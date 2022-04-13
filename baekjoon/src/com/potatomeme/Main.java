package com.potatomeme;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int chk = 0;
        String str;
        ArrayList<Character> arr;
        Boolean test;
        for (int i = 0; i < N; i++) {
            str = br.readLine();
            arr = new ArrayList<>();
            test = true;
            arr.add(str.charAt(0));
            for (int j = 0; j < str.length() - 1; j++) {
                if (str.charAt(j) != str.charAt(j + 1)) {
                    if (arr.contains(str.charAt(j + 1))) {
                        test = false;
                        break;
                    }
                    arr.add(str.charAt(j + 1));
                }
            }
            if (test) {
                chk++;
            }
        }
        bw.write(chk + "");
        br.close();
        bw.flush();
        bw.close();
    }
}



