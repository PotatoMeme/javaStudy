package com.potatomeme;

import java.math.BigInteger;

import static java.lang.Math.sqrt;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] str = br.readLine().toCharArray();
        int[] result = new int['z'-'a'+1];
        for(char c:str){
            result[c-'a']++;
        }
        for(int i:result){
            bw.write(i+" ");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}