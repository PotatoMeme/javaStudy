package com.potatomeme;

import java.math.BigInteger;

import static java.lang.Math.sqrt;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), "-");
        int T = st.countTokens();
        for (int i = 0; i < T; i++) {
            bw.write(st.nextToken().charAt(0) + "");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}