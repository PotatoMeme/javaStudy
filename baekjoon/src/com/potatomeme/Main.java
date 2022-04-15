package com.potatomeme;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int K, N;
        int[][] list = new int[15][14];
        for(int i =0; i < 14;i++){
            list[0][i] = i+1;
        }
        for(int i =0; i < 15;i++){
            list[i][0] = 1;
        }
        for(int i =1; i < 15;i++){
            for(int j =1; j < 14;j++){
                list[i][j] = list[i-1][j]+list[i][j-1];
            }
        }
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            K = Integer.parseInt(br.readLine());
            N = Integer.parseInt(br.readLine());
            bw.write(list[K][N-1]+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}



