package com.potatomeme;

import java.math.BigInteger;

import static java.lang.Math.sqrt;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        int[] arr = new int[T];
        int index = 0, sum = 0;
        for (int i = 0; i < T; i++) {
            arr[index] = Integer.parseInt(br.readLine());
            if (arr[index] == 0) {
                index--;
            } else {
                index++;
            }
        }
        for (int i = 0; i < index; i++) {
            sum += arr[i];
        }
        bw.write(sum + "");
        br.close();
        bw.flush();
        bw.close();
    }
}



