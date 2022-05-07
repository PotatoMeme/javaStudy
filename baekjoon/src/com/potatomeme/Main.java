package com.potatomeme;

import java.math.BigInteger;

import static java.lang.Math.sqrt;

import java.util.*;
import java.io.*;

public class Main {
    static int[] arr = new int[8];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int sum = 0;
        int[] result = new int[5];
        for (int i = 0; i < 8; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < 5; i++) {
            result[i] = solution2822_sub();
            sum += arr[result[i]];
            arr[result[i]] = 0;
        }
        bw.write(sum + "\n");
        int temp = 0;
        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                if (result[j] > result[j + 1]) {
                    temp = result[j];
                    result[j] = result[j + 1];
                    result[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            bw.write(result[i]+1 + " ");
        }
        br.close();
        bw.flush();
        bw.close();
    }

    public static int solution2822_sub() {
        int index = 0;
        int compare = 0;
        for (int i = 0; i < 8; i++) {
            if (arr[i] > compare) {
                compare = arr[i];
                index = i;
            }
        }
        return index;
    }
}



