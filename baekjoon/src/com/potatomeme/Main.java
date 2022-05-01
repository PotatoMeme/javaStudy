package com.potatomeme;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[9];
        st.nextToken();
        arr[0] = Integer.parseInt(st.nextToken());
        for (int i = 0; i < 8; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i + 1] = arr[i] - Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
        }
        br.readLine();
        bw.write(Arrays.stream(arr).max().getAsInt() + " ");
        br.close();
        bw.flush();
        bw.close();
    }
}



