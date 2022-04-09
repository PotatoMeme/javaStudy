package com.potatomeme;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int x, y, saveData, cnt;
        saveData = A;
        cnt = 0;
        do {
            x = saveData / 10;
            y = saveData % 10;
            saveData = y * 10 + (x + y)%10;
            cnt++;
        } while (saveData != A);
        br.close();
        System.out.println(cnt);
    }
}


