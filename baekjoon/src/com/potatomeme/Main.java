package com.potatomeme;

import java.math.BigInteger;

import static java.lang.Math.sqrt;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] word = br.readLine().toCharArray();
        for (char i : word) {
            if (i > 96) {
                bw.write(i - 32);
            } else {
                bw.write(i + 32);
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}