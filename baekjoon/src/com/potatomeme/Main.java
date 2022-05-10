package com.potatomeme;

import java.math.BigInteger;

import static java.lang.Math.sqrt;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = new int[9];
        int sum = 0;
        int saveA = 0, saveB = 0;
        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }
        Arrays.sort(arr);
        for (int a = 0; a < 8; a++) {
            for (int b = a + 1; b < 9; b++) {
                if (sum - arr[a] - arr[b] == 100) {
                    saveA = a;
                    saveB = b;
                    break;
                }
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (j == saveA || j == saveB) continue;
            bw.write(arr[j] + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}



