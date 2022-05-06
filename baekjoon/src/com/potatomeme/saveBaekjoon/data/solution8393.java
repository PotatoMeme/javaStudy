package com.potatomeme.saveBaekjoon.data;

import java.util.Scanner;

public class solution8393 {
    //8393
    {/*문제
    n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.

    입력
    첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.

    출력
    1부터 n까지 합을 출력한다.

    예제 입력 1
    3
    예제 출력 1
    6*/
    }

    public void solution8393() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println((1 + n) * n / 2);
        /*int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }*/
    }

}
