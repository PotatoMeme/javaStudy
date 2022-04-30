package com.potatomeme;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int r = Integer.parseInt(br.readLine());
        bw.write(String.format("%.6f\n",r*r*Math.PI));
        bw.write(String.format("%.6f\n",r*r*2.0)+"");
        br.close();
        bw.flush();
        bw.close();
    }
}



