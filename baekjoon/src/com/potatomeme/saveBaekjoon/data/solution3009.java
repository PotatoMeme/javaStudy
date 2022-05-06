package com.potatomeme.saveBaekjoon.data;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class solution3009 {

    //3009
    {/*문제
    세 점이 주어졌을 때, 축에 평행한 직사각형을 만들기 위해서 필요한 네 번째 점을 찾는 프로그램을 작성하시오.
    입력
    세 점의 좌표가 한 줄에 하나씩 주어진다. 좌표는 1보다 크거나 같고, 1000보다 작거나 같은 정수이다.
    출력
    직사각형의 네 번째 점의 좌표를 출력한다.
    예제 입력 1
    5 5
    5 7
    7 5
    예제 출력 1
    7 7
    예제 입력 2
    30 20
    10 10
    10 20
    예제 출력 2
    30 10
    */
    }

    public void solution3009() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] x = new int[4];
        int[] y = new int[4];
        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }
        x[3] = x[0] == x[1] ? x[2] : x[0] == x[2] ? x[1] : x[0];
        y[3] = y[0] == y[1] ? y[2] : y[0] == y[2] ? y[1] : y[0];
        bw.write(x[3] + " " + y[3]);
        br.close();
        bw.flush();
        bw.close();
    }
}
