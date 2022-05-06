package com.potatomeme.saveBaekjoon.data;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class solution10757 {
    //10757
    {/*문제
    두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

    입력
    첫째 줄에 A와 B가 주어진다. (0 < A,B < 1010000)

    출력
    첫째 줄에 A+B를 출력한다.

    예제 입력 1
    9223372036854775807 9223372036854775808
    예제 출력 1
    18446744073709551615
    */
    }

    public void solution10757() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        BigInteger A = new BigInteger(st.nextToken());
        BigInteger B = new BigInteger(st.nextToken());
        bw.write((A = A.add(B)).toString());
        br.close();
        bw.flush();
        bw.close();
    }
}
