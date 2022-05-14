package com.potatomeme;

import java.math.BigInteger;

import static java.lang.Math.sqrt;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        int total = Integer.parseInt(st.nextToken());
        int[] arr = new int[T];
        for (int i = 0; i < T; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        T--;
        int cnt = 0;
        int saveData;
        while (true) {
            if (total/arr[T] >= 1) {
                saveData = total/arr[T];
                total -= arr[T]*saveData;
                cnt += saveData;
            } else {
                T--;
            }
            if (total == 0) break;
        }
        bw.write(cnt + "");
        br.close();
        bw.flush();
        bw.close();
    }
}