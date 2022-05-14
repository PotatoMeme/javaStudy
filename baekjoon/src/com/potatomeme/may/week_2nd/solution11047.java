package com.potatomeme.may.week_2nd;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class solution11047 {
    //동전 0
    {//문제
    /*규가 가지고 있는 동전은 총 N종류이고, 각각의 동전을 매우 많이 가지고 있다.

    동전을 적절히 사용해서 그 가치의 합을 K로 만들려고 한다. 이때 필요한 동전 개수의 최솟값을 구하는 프로그램을 작성하시오.

    입력
    첫째 줄에 N과 K가 주어진다. (1 ≤ N ≤ 10, 1 ≤ K ≤ 100,000,000)

    둘째 줄부터 N개의 줄에 동전의 가치 Ai가 오름차순으로 주어진다. (1 ≤ Ai ≤ 1,000,000, A1 = 1, i ≥ 2인 경우에 Ai는 Ai-1의 배수)

    출력
    첫째 줄에 K원을 만드는데 필요한 동전 개수의 최솟값을 출력한다.

    예제 입력 1
    10 4200
    1
    5
    10
    50
    100
    500
    1000
    5000
    10000
    50000
    예제 출력 1
    6
    예제 입력 2
    10 4790
    1
    5
    10
    50
    100
    500
    1000
    5000
    10000
    50000
    예제 출력 2
    12
    */
    }

    public void solution11047_case1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        int total = Integer.parseInt(st.nextToken());
        int[] arr = new int[T];
        for (int i = 0; i < T; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        T--;
        int cnt = 0;
        while (true) {
            if (total - arr[T] >= 0) {
                total -= arr[T];
                cnt++;
            } else {
                T--;
            }
            if (total == 0) break;
        }
        bw.write(cnt+"");
        br.close();
        bw.flush();
        bw.close();
    }

    public void solution11047_case2() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        int total = Integer.parseInt(st.nextToken());
        int[] arr = new int[T];
        for (int i = 0; i < T; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        T--;
        int cnt = 0;
        int saveData;
        while (true) {
            if (total/arr[T] >= 1) {
                saveData = total/arr[T];
                total -= arr[T]*saveData;
                cnt += saveData;
            } else {
                T--;
            }
            if (total == 0) break;
        }
        bw.write(cnt + "");
        br.close();
        bw.flush();
        bw.close();
    }
}
