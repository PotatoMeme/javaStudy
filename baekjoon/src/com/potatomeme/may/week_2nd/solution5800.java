package com.potatomeme.may.week_2nd;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class solution5800 {
    {//성적 통계
    /*문제
    한상덕은 이번에 중덕 고등학교에 새로 부임한 교장 선생님이다. 교장 선생님으로서 첫 번째 일은 각 반의 수학 시험 성적의 통계를 내는 일이다.

    중덕 고등학교 각 반의 학생들의 수학 시험 성적이 주어졌을 때, 최대 점수, 최소 점수, 점수 차이를 구하는 프로그램을 작성하시오.

    입력
    첫째 줄에 중덕 고등학교에 있는 반의 수 K (1 ≤ K ≤ 100)가 주어진다. 다음 K개 줄에는 각 반의 학생수 N (2 ≤ N ≤ 50)과 각 학생의 수학 성적이 주어진다. 시험 성적은 0보다 크거나 같고, 100보다 작거나 같은 정수이고, 공백으로 나누어져 있다.

    출력
    각 반에 대한 출력은 다음과 같이 두 줄로 이루어져 있다.

    첫째 줄에는 "Class X"를 출력한다. X는 반의 번호이며 입력으로 주어진 순서대로 1부터 증가한다.
    둘째 줄에는 가장 높은 점수, 낮은 점수, 성적을 내림차순으로 정렬했을 때 가장 큰 인접한 점수 차이를 예제 출력과 같은 형식으로 출력한다.
    예제 입력 1
    2
    5 30 25 76 23 78
    6 25 50 70 99 70 90
    예제 출력 1
    Class 1
    Max 78, Min 23, Largest gap 46
    Class 2
    Max 99, Min 25, Largest gap 25
    */
    }

    public void solution5800() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr;
        StringTokenizer st;
        int arrsize,gap;
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            arrsize = Integer.parseInt(st.nextToken());
            arr = new int[arrsize];
            for(int j=0;j<arrsize;j++){
                arr[j] = Integer.parseInt(st.nextToken());
            }
            arr = Arrays.stream(arr).sorted().toArray();
            gap = 0;
            for(int j=1;j<arrsize;j++){
                gap = arr[j] - arr[j-1] > gap? arr[j] - arr[j-1]:gap;
            }
            bw.write("Class "+(i+1)+"\n");
            bw.write("Max "+arr[arrsize-1]+", Min "+arr[0]+", Largest gap "+gap+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
