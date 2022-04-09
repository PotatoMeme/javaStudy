package com.potatomeme;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int cnt;
        int[] list;
        double result;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            list = new int[Integer.parseInt(st.nextToken())];
            cnt=0;
            for (int j = 0; j < list.length; j++) {
                list[j] = Integer.parseInt(st.nextToken());
            }
            result = Arrays.stream(list).average().getAsDouble();
            for(int j:list){
                cnt += j>result?1:0;
            }
            result = (double) cnt/list.length*100;
            bw.write(String.format("%.3f",result)+"% \n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}


