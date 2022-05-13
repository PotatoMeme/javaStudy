package com.potatomeme;

import java.math.BigInteger;

import static java.lang.Math.sqrt;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        for(int i=0;i<10;i++){
            arr1[i] = Integer.parseInt(br.readLine());
        }
        for(int i=0;i<10;i++){
            arr2[i] = Integer.parseInt(br.readLine());
        }
        bw.write(solution5576_sub(arr1)+" "+solution5576_sub(arr2));
        br.close();
        bw.flush();
        bw.close();
    }
    public static int solution5576_sub(int[] arr) {
        int temp;
        for(int i=0;i<3;i++){
            for(int j=1;j<10-i;j++){
                if(arr[j-1]>arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[7]+arr[8]+arr[9];
    }
}