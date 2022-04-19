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
        int n,cnt;
        while (true){
            n = Integer.parseInt(br.readLine());
            if(n == 0){ break;}
            prime = new boolean[2*n+1];
            cnt = 0;
            solution4948_sub();
            for (int i = n+1;i<=2*n;i++) {
                if(!prime[i]) {
                    bw.write(i+"\n");
                }
            }
            bw.write(cnt+"\n");
            bw.flush();
        }
        br.close();
        bw.flush();
        bw.close();
    }
    public static void solution4948_sub() {
        prime[0] = prime[1] = true;
        for(int i = 2; i <= Math.sqrt(prime.length); i++) {
            if(prime[i]) continue;
            for(int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
    }

}



