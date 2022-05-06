package com.potatomeme.saveBaekjoon.data;

import java.io.*;
import java.util.Scanner;

public class solution2742 {

    //2742
    {/*문제
    자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.

    입력
    첫째 줄에 100,000보다 작거나 같은 자연수 N이 주어진다.

    출력
    첫째 줄부터 N번째 줄 까지 차례대로 출력한다.

    예제 입력 1
    5
    예제 출력 1
    5
    4
    3
    2
    1*/
    }

    public void solution2742() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for (int i = N; i > 0; i--) {
            bw.write(i + "\n");// stack처럼bw에 추가
        }
        br.close();
        bw.flush();// 한번에 출력력
        bw.close();
    }
}
