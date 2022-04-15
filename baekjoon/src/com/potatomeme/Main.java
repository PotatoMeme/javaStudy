package com.potatomeme;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int N_save, i;
        for (i = N / 5; i >= 0; i--) {
            N_save = N - 5 * i;
            if (N_save % 3 == 0) {
                bw.write(String.format("%d", i + N_save / 3));
                break;
            }
        }
        if (i < 0) bw.write(-1 + "");
        br.close();
        bw.flush();
        bw.close();
    }
}



