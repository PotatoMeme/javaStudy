package com.potatomeme;

import java.math.BigInteger;

import static java.lang.Math.sqrt;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr;
        StringTokenizer st;
        int sum;
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            sum = 0;
            arr = new int[5];
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 5; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
                sum += arr[j];
            }
            Arrays.sort(arr);
            bw.write((arr[3] - arr[1]) >= 4 ? "KIN\n" : sum - arr[0] - arr[4] + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}



