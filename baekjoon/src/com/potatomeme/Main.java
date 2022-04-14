package com.potatomeme;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int i = 1;
        while (true) {
            N -= i;
            if (N <= 0) {
                break;
            }
            i++;
        }
        if (i % 2 == 1) {
            bw.write((1 - N) + "/" + (i + N));
        } else {
            bw.write((i + N) + "/" + (1 - N));
        }
        br.close();
        bw.flush();
        bw.close();
    }
}



