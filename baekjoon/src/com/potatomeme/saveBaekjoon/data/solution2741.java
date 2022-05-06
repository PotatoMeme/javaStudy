package com.potatomeme.saveBaekjoon.data;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class solution2741 {

    //2741
    {/*
    첫째 줄부터 N번째 줄 까지 차례대로 출력한다.

    예제 입력 1
    5
    예제 출력 1
    1
    2
    3
    4
    5*/
    }

    public void solution2741_ver1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for (int i = 1; i <= N; i++) {
            bw.write(i + "\n");// stack처럼bw에 추가
        }
        br.close();
        bw.flush();// 한번에 출력력
        bw.close();
    }

    public void solution2741_ver2() throws IOException {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for (int i = 1; i <= N; i++) {
            System.out.println(i);
        }
    }
}
