package com.potatomeme;

import java.math.BigInteger;

import static java.lang.Math.sqrt;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for (int i=0;i<T;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());

            int cnt = 0;

            for (int j = num1; j <= num2; j++) {
                int t = j;
                if (t == 0) {
                    cnt++;
                    continue;
                }
                while (t > 1) {
                    if (t % 10 == 0) {
                        cnt++;
                    }
                    t /= 10;
                }
            }
            bw.write(cnt+"\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}