package com.potatomeme;

import java.math.BigInteger;

import static java.lang.Math.sqrt;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
        int sum = 0;
        int num = 1;
        int count = 0;
        for (int i = 1; i <= end; i++) {
            if (i >= start) {
                sum += num;
            }
            count++;
            if (num == count) {
                num++;
                count = 0;
            }
        }
        bw.write(sum + "");
        br.close();
        bw.flush();
        bw.close();
    }
}



