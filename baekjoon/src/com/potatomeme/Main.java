package com.potatomeme;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int save, result;
        save = 0;
        result = 0;
        for (int i = 0; i < n; i++) {
            save = Integer.parseInt(st.nextToken()) == 1 ? save + 1 : 0;
            result += save;
        }
        bw.write(result+"");
        br.close();
        bw.flush();
        bw.close();
    }
}



