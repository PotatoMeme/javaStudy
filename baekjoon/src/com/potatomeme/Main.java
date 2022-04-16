package com.potatomeme;

import java.io.*;
import java.math.BigInteger;
import java.util.*;
import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = 0;
        int start_num = Integer.parseInt(br.readLine());
        int end_num = Integer.parseInt(br.readLine());
        int sum = 0;
        int min = 0;
        for (int i = start_num;i<=end_num;i++) {
            if (solution2581_sub(i)) {
                sum += i;
                if(sum==i) min=i;
            }
        }
        if(sum == 0){
            bw.write(-1+"");
        } else{
            bw.write(sum+"\n");
            bw.write(min+"");
        }
        br.close();
        bw.flush();
        bw.close();
    }
    public static boolean solution2581_sub(int num) {
        if (num == 1) return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}



