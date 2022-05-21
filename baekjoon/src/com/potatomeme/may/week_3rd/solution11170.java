package com.potatomeme.may.week_3rd;

import java.io.*;
import java.util.StringTokenizer;

public class solution11170 {
    {//0의 개수
    /*문제
    N부터 M까지의 수들을 종이에 적었을 때 종이에 적힌 0들을 세는 프로그램을 작성하라.

    예를 들어, N, M이 각각 0, 10일 때 0을 세면 0에 하나, 10에 하나가 있으므로 답은 2이다.

    입력
    첫 번째 줄에 테스트 케이스의 수 T가 주어진다.

    각 줄에는 N과 M이 주어진다.

    1 ≤ T ≤ 20
    0 ≤ N ≤ M ≤ 1,000,000
    출력
    각각의 테스트 케이스마다 N부터 M까지의 0의 개수를 출력한다.

    예제 입력 1
    3
    0 10
    33 1005
    1 4
    예제 출력 1
    2
    199
    0
    */
    }

    public void solution11170() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for (int i=0;i<T;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());

            int cnt = 0;

            for (int j = num1; j <= num2; j++) {
                int t = j;
                if (t == 0) {
                    cnt++;
                    continue;
                }
                while (t > 1) {
                    if (t % 10 == 0) {
                        cnt++;
                    }
                    t /= 10;
                }
            }
            bw.write(cnt+"\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
