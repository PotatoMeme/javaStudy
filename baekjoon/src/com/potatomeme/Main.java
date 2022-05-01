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
        StringTokenizer st = new StringTokenizer(br.readLine());
        int v = Integer.parseInt(br.readLine());
        int check = 0;
        for (int i = 0; i < t; i++) check = Integer.parseInt(st.nextToken()) == v ? check + 1 : check;
        bw.write(check+"");
        br.close();
        bw.flush();
        bw.close();
    }
}



