package com.potatomeme;

import java.math.BigInteger;

import static java.lang.Math.sqrt;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int n;
        int[] arr;
        for (int i = 0; i < t; i++){
            n = Integer.parseInt(br.readLine());
            arr = new int[n];
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++){
                arr[j] = Integer.parseInt(st.nextToken());
            }
            int result = (Arrays.stream(arr).max().getAsInt()-Arrays.stream(arr).min().getAsInt())*2;
            bw.write(result+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}



