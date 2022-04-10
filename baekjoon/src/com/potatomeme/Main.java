package com.potatomeme;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(solution1065_sub1(Integer.parseInt(br.readLine()))+"\n");
        br.close();
        bw.flush();
        bw.close();
    }
    public static int solution1065_sub1(int num) throws IOException {
        if (num < 100) {
            return num;
        } else {
            int cnt = 99;
            if (num == 1000) {
                num = 999;
            }

            for (int i = 100; i <= num; i++) {
                int hun = i / 100;
                int ten = (i / 10) % 10;
                int one = i % 10;

                if ((hun - ten) == (ten - one)) {
                    cnt++;
                }
            }
            return cnt;
        }
    }
}



