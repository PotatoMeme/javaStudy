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
        int result = solution1357_sub(solution1357_sub(num1) + solution1357_sub(num2));
        bw.write(result + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static int solution1357_sub(int num) {
        if (num >= 1000) {
            return num % 10 * 1000 + num / 10 % 10 * 100 + num / 100 % 10 * 10 + +num / 1000;
        } else if (num >= 100) {
            return num % 10 * 100 + num / 10 % 10 * 10 + num / 100;
        } else if (num >= 10) {
            return num % 10 * 10 + num / 10;
        } else {
            return num;
        }
    }
}