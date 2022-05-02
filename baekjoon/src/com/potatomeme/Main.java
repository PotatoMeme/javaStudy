package com.potatomeme;

import java.math.BigInteger;

import static java.lang.Math.sqrt;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num, sum;
        sum = 0;
        for (int i = 0; i < 5; i++) {
            num = Integer.parseInt(br.readLine());
            sum += num < 40 ? 40 : num;
        }
        bw.write(sum / 5 + " ");
        br.close();
        bw.flush();
        bw.close();
    }
}



