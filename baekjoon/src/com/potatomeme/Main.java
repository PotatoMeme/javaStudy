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
        int arrsize,gap;
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            arrsize = Integer.parseInt(st.nextToken());
            arr = new int[arrsize];
            for(int j=0;j<arrsize;j++){
                arr[j] = Integer.parseInt(st.nextToken());
            }
            arr = Arrays.stream(arr).sorted().toArray();
            gap = 0;
            for(int j=1;j<arrsize;j++){
                gap = arr[j] - arr[j-1] > gap? arr[j] - arr[j-1]:gap;
            }
            bw.write("Class "+(i+1)+"\n");
            bw.write("Max "+arr[arrsize-1]+", Min "+arr[0]+", Largest gap "+gap+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}



