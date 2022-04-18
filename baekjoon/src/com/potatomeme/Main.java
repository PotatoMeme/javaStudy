package com.potatomeme;

import java.io.*;
import java.math.BigInteger;
import java.util.*;
import static java.lang.Math.sqrt;

public class Main {
    public static boolean[] prime;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int start_num = Integer.parseInt(st.nextToken());
        int end_num = Integer.parseInt(st.nextToken());
        prime = new boolean[end_num+1];
        solution1929_sub();
        for (int i = start_num;i<=end_num;i++) {
            if(!prime[i]) {
                bw.write(i+"\n");
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
    public static void solution1929_sub() {
        prime[0] = prime[1] = true;
        for(int i = 2; i <= Math.sqrt(prime.length); i++) {
            if(prime[i]) continue;
            for(int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
    }

}



