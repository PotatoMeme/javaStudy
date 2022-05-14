package com.potatomeme.may.week_2nd;

import java.io.*;
import java.util.StringTokenizer;

public class solution10953 {
    //A+B - 6
    {//문제
    /*두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

    입력
    첫째 줄에 테스트 케이스의 개수 T가 주어진다.

    각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. A와 B는 콤마(,)로 구분되어 있다. (0 < A, B < 10)

    출력
    각 테스트 케이스마다 A+B를 출력한다.

    예제 입력 1
    5
    1,1
    2,3
    3,4
    9,8
    5,2
    예제 출력 1
    2
    5
    7
    17
    7
    */
    }

    public void solution10953() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine(), ",");
            bw.write(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

}
