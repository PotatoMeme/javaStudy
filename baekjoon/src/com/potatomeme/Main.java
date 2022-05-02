package com.potatomeme;

import java.math.BigInteger;
import static java.lang.Math.sqrt;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int sum = Integer.parseInt(br.readLine())+Integer.parseInt(br.readLine());
        bw.write(sum+" ");
        br.close();
        bw.flush();
        bw.close();
    }
}



