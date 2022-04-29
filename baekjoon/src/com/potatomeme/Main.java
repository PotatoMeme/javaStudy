package com.potatomeme;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int T,result;
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            T = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine()," ");
            result = 0;
            for(int j = 0; j < T; j++){
                result +=Integer.parseInt(st.nextToken());
            }
            bw.write(result+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}



