
package com.potatomeme.saveBaekjoon.data;

import java.io.*;
import java.util.StringTokenizer;

public class solution2609 {
    //2609
    {/*최대공약수와 최소공배수
    문제
    두 개의 자연수를 입력받아 최대 공약수와 최소 공배수를 출력하는 프로그램을 작성하시오.

    입력
    첫째 줄에는 두 개의 자연수가 주어진다. 이 둘은 10,000이하의 자연수이며 사이에 한 칸의 공백이 주어진다.

    출력
    첫째 줄에는 입력으로 주어진 두 수의 최대공약수를, 둘째 줄에는 입력으로 주어진 두 수의 최소 공배수를 출력한다.

    예제 입력 1
    24 18
    예제 출력 1
    6
    72
    */
    }

    public void solution2609() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        int save = 0;
        if (num1 < num2) {
            save = num1;
            num1 = num2;
            num2 = save;
        }
        for (int i = num2; i > 0; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                bw.write(i + "\n");
                break;
            }
        }
        for (int i = 1; i <= num2; i++) {
            if ((num1 * i) % num2 == 0) {
                bw.write(i + "\n");
                break;
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
