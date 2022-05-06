package com.potatomeme.saveBaekjoon.data;

import java.io.*;
import java.util.StringTokenizer;

public class solution2869 {
    //2869
    {/*문제
    땅 위에 달팽이가 있다. 이 달팽이는 높이가 V미터인 나무 막대를 올라갈 것이다.

    달팽이는 낮에 A미터 올라갈 수 있다. 하지만, 밤에 잠을 자는 동안 B미터 미끄러진다. 또, 정상에 올라간 후에는 미끄러지지 않는다.

    달팽이가 나무 막대를 모두 올라가려면, 며칠이 걸리는지 구하는 프로그램을 작성하시오.

    입력
    첫째 줄에 세 정수 A, B, V가 공백으로 구분되어서 주어진다. (1 ≤ B < A ≤ V ≤ 1,000,000,000)

    출력
    첫째 줄에 달팽이가 나무 막대를 모두 올라가는데 며칠이 걸리는지 출력한다.

    예제 입력 1
    2 1 5
    예제 출력 1
    4
    예제 입력 2
    5 1 6
    예제 출력 2
    2
    예제 입력 3
    100 99 1000000000
    예제 출력 3
    999999901
    */
    }
    //(1 ≤ B < A ≤ V ≤ 1,000,000,000)
    // A +(n-1)(A-B) >=V
    // => 자연수 n의 최솟값

    public void solution2869() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        if ((V - A) % (A - B) == 0) {
            bw.write((V - A) / (A - B) + 1 + "");
        } else {
            bw.write((V - A) / (A - B) + 2 + "");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
