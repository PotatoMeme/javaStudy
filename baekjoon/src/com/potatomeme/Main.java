package com.potatomeme;
import java.math.BigInteger;
import static java.lang.Math.sqrt;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) arr[i] = Integer.parseInt(br.readLine());
        bw.write((int) Arrays.stream(arr).average().getAsDouble() + "\n");
        Arrays.sort(arr);
        int save = 1;
        int check = 0;
        int num = arr[0];
        for (int i = 1; i < 10; i++) {
            save = arr[i - 1] == arr[i] ? save + 1 : 0;
            if (save > check) {
                check = save;
                num = arr[i - 1];
            }
        }
        bw.write(num + "");
        br.close();
        bw.flush();
        bw.close();
    }
}



