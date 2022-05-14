package com.potatomeme.may.week_2nd;

import java.io.*;
import java.util.StringTokenizer;

public class solution1357 {
    //뒤집힌 덧셈
    {//문제
    /*어떤 수 X가 주어졌을 때, X의 모든 자리수가 역순이 된 수를 얻을 수 있다. Rev(X)를 X의 모든 자리수를 역순으로 만드는 함수라고 하자. 예를 들어, X=123일 때, Rev(X) = 321이다. 그리고, X=100일 때, Rev(X) = 1이다.

    두 양의 정수 X와 Y가 주어졌을 때, Rev(Rev(X) + Rev(Y))를 구하는 프로그램을 작성하시오

    입력
    첫째 줄에 수 X와 Y가 주어진다. X와 Y는 1,000보다 작거나 같은 자연수이다.

    출력
    첫째 줄에 문제의 정답을 출력한다.

    예제 입력 1
    123 100
    예제 출력 1
    223
    예제 입력 2
    111 111
    예제 출력 2
    222
    예제 입력 3
    5 5
    예제 출력 3
    1
    예제 입력 4
    1000 1
    예제 출력 4
    2
    예제 입력 5
    456 789
    예제 출력 5
    1461
    */
    }

    public void solution1357() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        int result = solution1357_sub(solution1357_sub(num1) + solution1357_sub(num2));
        bw.write(result + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public int solution1357_sub(int num) {
        if (num >= 1000) {
            return num % 10 * 1000 + num / 10 % 10 * 100 + num / 100 % 10 * 10 + +num / 1000;
        } else if (num >= 100) {
            return num % 10 * 100 + num / 10 % 10 * 10 + num / 100;
        } else if (num >= 10) {
            return num % 10 * 10 + num / 10;
        } else {
            return num;
        }
    }

}
