package com.potatomeme;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine()) - 1;
        int N_save;
        int i = 0;
        if (N % 6 == 0) {
            N_save = N / 6;
        } else {
            N_save = N / 6 + 1;
        }
        while (true) {
            N_save -= i;
            if (N_save <= 0) {
                break;
            }
            i++;
        }
        bw.write(i + 1 + "");
        br.close();
        bw.flush();
        bw.close();
    }
}



