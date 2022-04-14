package com.potatomeme;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        if ((V - A) % (A - B) == 0) {
            bw.write((V - A) / (A - B) + 1 + "");
        } else {
            bw.write((V - A) / (A - B) + 2 + "");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}



