package com.potatomeme;

import java.math.BigInteger;

import static java.lang.Math.sqrt;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        bw.write(solution2748_sub(n) + "");
        br.close();
        bw.flush();
        bw.close();
    }

    public static int solution2748_sub(int n) {
        if (n < 2) {
            return n;
        }
        return solution2748_sub(n - 1) + solution2748_sub(n - 2);
    }
}



