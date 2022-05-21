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
        for(int i=0;i<str.length;i++){
            if(str[i]>='a' && str[i]<='z'){
                if(str[i] > 'm'){
                    str[i]-=13;
                }else{
                    str[i]+=13;
                }
            }else if(str[i]>='A' && str[i]<='Z'){
                if(str[i] > 'M'){
                    str[i]-=13;
                }else{
                    str[i]+=13;
                }
            }
            bw.write(str[i]+"");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}