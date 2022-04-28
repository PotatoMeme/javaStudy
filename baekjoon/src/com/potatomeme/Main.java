package com.potatomeme;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] x = new int[4];
        int[] y = new int[4];
        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }
        x[3] = x[0] == x[1] ? x[2] : x[0] == x[2] ? x[1] : x[0];
        y[3] = y[0] == y[1] ? y[2] : y[0] == y[2] ? y[1] : y[0];
        bw.write(x[3] + " " + y[3]);
        br.close();
        bw.flush();
        bw.close();
    }
}



