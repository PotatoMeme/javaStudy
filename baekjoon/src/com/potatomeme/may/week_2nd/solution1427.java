package com.potatomeme.may.week_2nd;

import java.io.*;
import java.util.Arrays;

public class solution1427 {
    {//소트인사이드
    /*문제
    배열을 정렬하는 것은 쉽다. 수가 주어지면, 그 수의 각 자리수를 내림차순으로 정렬해보자.

    입력
    첫째 줄에 정렬하려고 하는 수 N이 주어진다. N은 1,000,000,000보다 작거나 같은 자연수이다.

    출력
    첫째 줄에 자리수를 내림차순으로 정렬한 수를 출력한다.

    예제 입력 1
    2143
    예제 출력 1
    4321
    예제 입력 2
    999998999
    예제 출력 2
    999999998
    예제 입력 3
    61423
    예제 출력 3
    64321
    예제 입력 4
    500613009
    예제 출력 4
    965310000
    */
    }

    public void solution1427() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char[] arr = br.readLine().toCharArray();
        char temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] < arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        bw.write(arr);
        br.close();
        bw.flush();
        bw.close();
    }
}
