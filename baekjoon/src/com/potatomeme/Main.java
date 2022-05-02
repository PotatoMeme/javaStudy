package com.potatomeme;

import java.math.BigInteger;

import static java.lang.Math.sqrt;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        int save = 0;
        if (num1 < num2) {
            save = num1;
            num1 = num2;
            num2 = save;
        }
        for (int i = num2; i > 0; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                bw.write(i + "\n");
                break;
            }
        }
        for (int i = 1; i <= num2; i++) {
            if ((num1 * i) % num2 == 0) {
                bw.write(num1 * i + "");
                break;
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}



