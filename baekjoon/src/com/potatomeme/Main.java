package com.potatomeme;

import java.io.*;
import java.math.BigInteger;
import java.util.*;
import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        for (int i = 2; i <= Math.sqrt(num); i++) {
            while (num % i == 0) {
                bw.write(i+"\n");
                num /= i;
            }
        }
        if (num != 1) {
            bw.write(num+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}



