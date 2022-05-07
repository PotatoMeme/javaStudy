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
        for(int i = 0;i<T;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        for(int i : Arrays.stream(arr).sorted().toArray()){
            bw.write(i+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}



