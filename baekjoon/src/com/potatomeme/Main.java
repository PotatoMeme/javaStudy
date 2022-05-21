package com.potatomeme;

import java.math.BigInteger;

import static java.lang.Math.sqrt;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str =br.readLine();
        int len = str.length();
        for (int i=0;i<len/10;i++){
            bw.write(str.substring(i*10,(i+1)*10)+"\n");
        }
        if(len%10 !=0){
            bw.write(str.substring(len/10*10));
        }

        br.close();
        bw.flush();
        bw.close();
    }
}