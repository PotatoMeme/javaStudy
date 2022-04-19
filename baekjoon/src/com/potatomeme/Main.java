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
        int T,n,first,second;
        prime = new boolean[10001];
        solution9020_sub_upgrade();
        T = Integer.parseInt(br.readLine());
        while(T-- > 0) {
            n = Integer.parseInt(br.readLine());
            first = n/2;
            second = n/2;
            while (true) {
                if (!prime[first] && !prime[second]) {
                    bw.write(first + " " + second+"\n");
                    break;
                }
                first--;
                second++;
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
    public static void solution9020_sub_upgrade() {
        prime[0] = prime[1] = true;
        for(int i = 2; i <= Math.sqrt(prime.length); i++) {
            if(prime[i]) continue;
            for(int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
    }
}



