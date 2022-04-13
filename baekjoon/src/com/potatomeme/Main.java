package com.potatomeme;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A, B, C;
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        int i = 0;
        if (B >= C) {
            i = -1;
        } else {
            i = A / (C - B)+1;
        }
        bw.write(i + "");
        br.close();
        bw.flush();
        bw.close();
    }
}



