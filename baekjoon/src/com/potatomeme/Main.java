package com.potatomeme;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int x,y;
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        st.nextToken();
        y = Integer.parseInt(st.nextToken());
        int[] arr = new int[3];
        arr[0] = y;
        for(int i = 0;i<2;i++){
            st = new StringTokenizer(br.readLine()," ");
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            arr[i+1] = arr[i]-x+y;
        }
        br.readLine();
        bw.write(Arrays.stream(arr).max().getAsInt()+"");
        br.close();
        bw.flush();
        bw.close();
    }
}



