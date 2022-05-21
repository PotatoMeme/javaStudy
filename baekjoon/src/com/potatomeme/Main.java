package com.potatomeme;

import java.math.BigInteger;

import static java.lang.Math.sqrt;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            String str1 = st.nextToken();
            String str2 = st.nextToken();
            int[] arr = new int[str1.length()];
            for(int j=0; j<str1.length(); j++) {
                if(str2.charAt(j) >= str1.charAt(j)) {
                    arr[j] = str2.charAt(j) - str1.charAt(j);
                }
                else {
                    arr[j] = str2.charAt(j) - str1.charAt(j) + 26;
                }
            }
            bw.write("Distances: ");
            for(int j=0; j<arr.length; j++) {
                bw.write(arr[j] + " ");
            }
            bw.write("\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}