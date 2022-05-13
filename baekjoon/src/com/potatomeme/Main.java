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
        int num, min, sum;
        StringTokenizer st;
        for (int i = 0; i < T; i++) {
            min = sum = 0;
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 7; j++) {
                num = Integer.parseInt(st.nextToken());
                if (num % 2 == 0) {
                    min = min > num ? num : min == 0 ? num : min;
                    sum += num;
                }
            }
            bw.write(sum + " " + min + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}



