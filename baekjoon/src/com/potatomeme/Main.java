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
        String[] num;
        for (int i = 0; i < t; i++) {
            num = new StringBuffer(Integer.toBinaryString(Integer.parseInt(br.readLine())))
                    .reverse()
                    .toString()
                    .split("");

            for (int j = 0; j < num.length; j++) {
                if (num[j].equals("1")) {
                    bw.write(j + " ");
                }
            }
            bw.write("\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}



