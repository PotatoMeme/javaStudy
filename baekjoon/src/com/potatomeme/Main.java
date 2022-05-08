package com.potatomeme;

import java.math.BigInteger;

import static java.lang.Math.sqrt;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = new int[5];
        for(int i =0;i<5;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        bw.write(Arrays.stream(arr).sum()/5+"\n");
        bw.write(Arrays.stream(arr).sorted().toArray()[2]+"");
        br.close();
        bw.flush();
        bw.close();
    }
}



