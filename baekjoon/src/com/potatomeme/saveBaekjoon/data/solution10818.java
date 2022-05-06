package com.potatomeme.saveBaekjoon.data;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class solution10818 {
    //10818
    {/*문제
    N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.

    입력
    첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.

    출력
    첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.

    예제 입력 1
    5
    20 10 35 30 7
    예제 출력 1
    7 35
    */
    }

    public void solution10818_ver1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] num = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }
        int max, min;
        max = num[0];
        min = num[0];
        for (int i : num) {
            max = max > i ? max : i;
            min = min < i ? min : i;
        }
        bw.write(min + " " + max);
        br.close();
        bw.flush();
        bw.close();
    }

    public void solution10818_ver2() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] num = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }
        bw.write(Arrays.stream(num).min().getAsInt() + " " + Arrays.stream(num).max().getAsInt());
        br.close();
        bw.flush();
        bw.close();
    }
}
