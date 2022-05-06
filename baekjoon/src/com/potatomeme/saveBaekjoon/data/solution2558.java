
package com.potatomeme.saveBaekjoon.data;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class solution2558 {
    //2558
    {/*A+B - 2
   문제
    두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

    입력
    첫째 줄에 A, 둘째 줄에 B가 주어진다. (0 < A, B < 10)

    출력
    첫째 줄에 A+B를 출력한다.

    예제 입력 1
    1
    2
    예제 출력 1
    3
    */
    }

    public void solution2558() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int sum = Integer.parseInt(br.readLine()) + Integer.parseInt(br.readLine());
        bw.write(sum + " ");
        br.close();
        bw.flush();
        bw.close();
    }
}
