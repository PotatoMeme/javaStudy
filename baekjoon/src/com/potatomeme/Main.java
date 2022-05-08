package com.potatomeme;

import java.math.BigInteger;

import static java.lang.Math.sqrt;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        if (num == 1) {
            int result = Integer.parseInt(st.nextToken());
            bw.write(result * result + "");
        } else {
            int[] arr = new int[num];
            for (int i = 0; i < num; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            int result = Arrays.stream(arr).min().getAsInt() * Arrays.stream(arr).max().getAsInt();
            bw.write(result + "");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}



