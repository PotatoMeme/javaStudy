package com.potatomeme;

import java.io.*;
import java.math.BigInteger;
import java.util.*;
import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int x,y,w,h;
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());
        w = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());
        int[] testCase = {x,y,w-x,h-y};
        bw.write(Arrays.stream(testCase).min().getAsInt()+"");
        br.close();
        bw.flush();
        bw.close();
    }
}



