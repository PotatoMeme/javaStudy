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
        bw.write(solution10872_sub(n)+"");
        br.close();
        bw.flush();
        bw.close();
    }
    public static int solution10872_sub(int n){
        if(n<2){
            return 1;
        }
        return n*solution10872_sub(n-1);
    }
}



