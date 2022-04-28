package com.potatomeme;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int x,y,z;
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            z = Integer.parseInt(st.nextToken());
            if(x==0 && y == 0&& z==0) break;
            if(x>=y && y>=z){
                bw.write(x*x == y*y + z*z?"right\n":"wrong\n");
            } else if(y>=z && z>=x){
                bw.write(y*y == x*x + z*z?"right\n":"wrong\n");
            } else{
                bw.write(z*z == x*x + y*y?"right\n":"wrong\n");
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}



