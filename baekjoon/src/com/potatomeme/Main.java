package com.potatomeme;

import java.math.BigInteger;

import static java.lang.Math.sqrt;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int sum, save, index;
        save = index = 0;
        StringTokenizer st;
        for (int i = 1; i < 6; i++) {
            st = new StringTokenizer(br.readLine());
            sum = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
            if (save < sum) {
                save = sum;
                index = i;
            }
        }
        bw.write(index+" "+save);
        br.close();
        bw.flush();
        bw.close();
    }
}



