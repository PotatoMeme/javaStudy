package com.potatomeme.may.week_2nd;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class solution5576 {
    {//콘테스트
    /*문제
    최근 온라인에서의 프로그래밍 콘테스트가 열렸다. W 대학과 K 대학의 컴퓨터 클럽은 이전부터 라이벌 관계에있어,이 콘테스트를 이용하여 양자의 우열을 정하자라는 것이되었다.

    이번이 두 대학에서 모두 10 명씩이 콘테스트에 참여했다. 긴 논의 끝에 참가한 10 명 중 득점이 높은 사람에서 3 명의 점수를 합산하여 대학의 득점으로하기로 했다.

    W 대학 및 K 대학 참가자의 점수 데이터가 주어진다. 이때, 각각의 대학의 점수를 계산하는 프로그램을 작성하라.

    입력
    입력은 20 행으로 구성된다. 1 번째 줄부터 10 번째 줄에는 W 대학의 각 참가자의 점수를 나타내는 정수가 11 번째 줄부터 20 번째 줄에는 K 대학의 각 참가자의 점수를 나타내는 정수가 적혀있다. 이 정수는 모두 0 이상 100 이하이다.

    출력
    W 대학 점수와 K 대학의 점수를 순서대로 공백으로 구분하여 출력하라.

    예제 입력 1
    23
    23
    20
    15
    15
    14
    13
    9
    7
    6
    25
    19
    17
    17
    16
    13
    12
    11
    9
    5
    예제 출력 1
    66 61
    예제 입력 2
    17
    25
    23
    25
    79
    29
    1
    61
    59
    100
    44
    74
    94
    57
    13
    54
    82
    0
    42
    45
    예제 출력 2
    240 250
    */
    }

    public void solution5576() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        for(int i=0;i<10;i++){
            arr1[i] = Integer.parseInt(br.readLine());
        }
        for(int i=0;i<10;i++){
            arr2[i] = Integer.parseInt(br.readLine());
        }
        bw.write(solution5576_sub(arr1)+" "+solution5576_sub(arr2));
        br.close();
        bw.flush();
        bw.close();
    }
    public int solution5576_sub(int[] arr) {
        int temp;
        for(int i=0;i<3;i++){
            for(int j=1;j<10-i;j++){
                if(arr[j-1]>arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[7]+arr[8]+arr[9];
    }
}