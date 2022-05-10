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
        int member;
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            member = Integer.parseInt(st.nextToken());
            arr = new int[member];
            for (int j = 0; j < member; j++) arr[j] = Integer.parseInt(br.readLine());
            bw.write(member - Arrays.stream(arr).distinct().toArray().length + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}



