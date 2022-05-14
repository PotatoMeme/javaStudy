package com.potatomeme;

import java.math.BigInteger;

import static java.lang.Math.sqrt;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] word = br.readLine().toCharArray();
        int cnt = 0;
        for(char c : word){
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                cnt++;
            }
        }
        bw.write(cnt+"");
        br.close();
        bw.flush();
        bw.close();
    }
}