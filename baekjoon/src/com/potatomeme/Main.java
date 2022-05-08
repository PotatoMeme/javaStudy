package com.potatomeme;

import java.math.BigInteger;

import static java.lang.Math.sqrt;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int sum = 0;
        int[] arr1 = new int[3];
        int[] arr2 = new int[2];
        for (int i = 0; i < 3; i++) {
            arr1[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < 2; i++) {
            arr2[i] = Integer.parseInt(br.readLine());
        }
        sum = Arrays.stream(arr1).min().getAsInt() + Arrays.stream(arr2).min().getAsInt() - 50;
        bw.write(sum + "");
        br.close();
        bw.flush();
        bw.close();
    }
}



