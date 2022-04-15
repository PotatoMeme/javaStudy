package com.potatomeme;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int H, N;
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            H = Integer.parseInt(st.nextToken());
            st.nextToken();
            N = Integer.parseInt(st.nextToken());
            bw.write(String.format("%d%02d\n", (N - 1) % H + 1, (N - 1) / H + 1));
        }
        br.close();
        bw.flush();
        bw.close();
    }
}



