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
        for(int i = 0;i<T;i++){
            String str = br.readLine();
            bw.write(str.substring(0,1).toUpperCase()+str.substring(1)+"\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}