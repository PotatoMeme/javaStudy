package com.potatomeme.saveBaekjoon.data;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class solution2455 {

    //2455
    {/*지능형 기차

    문제
    최근에 개발된 지능형 기차가 1번역(출발역)부터 4번역(종착역)까지 4개의 정차역이 있는 노선에서 운행되고 있다. 이 기차에는 타거나 내리는 사람 수를 자동으로 인식할 수 있는 장치가 있다. 이 장치를 이용하여 출발역에서 종착역까지 가는 도중 기차 안에 사람이 가장 많을 때의 사람 수를 계산하려고 한다. 단, 이 기차를 이용하는 사람들은 질서 의식이 투철하여, 역에서 기차에 탈 때, 내릴 사람이 모두 내린 후에 기차에 탄다고 가정한다.


        내린 사람 수	탄 사람 수
    1번역(출발역)	0	32
    2번역	3	13
    3번역	28	25
    4번역(종착역)	39	0
    예를 들어, 위와 같은 경우를 살펴보자. 이 경우, 기차 안에 사람이 가장 많은 때는 2번역에서 3명의 사람이 기차에서 내리고, 13명의 사람이 기차에 탔을 때로, 총 42명의 사람이 기차 안에 있다.

    이 기차는 다음 조건을 만족하면서 운행된다고 가정한다.

    기차는 역 번호 순서대로 운행한다.
    출발역에서 내린 사람 수와 종착역에서 탄 사람 수는 0이다.
    각 역에서 현재 기차에 있는 사람보다 더 많은 사람이 내리는 경우는 없다.
    기차의 정원은 최대 10,000명이고, 정원을 초과하여 타는 경우는 없다.
    4개의 역에 대해 기차에서 내린 사람 수와 탄 사람 수가 주어졌을 때, 기차에 사람이 가장 많을 때의 사람 수를 계산하는 프로그램을 작성하시오.

    입력
    각 역에서 내린 사람 수와 탄 사람 수가 빈칸을 사이에 두고 첫째 줄부터 넷째 줄까지 역 순서대로 한 줄에 하나씩 주어진다.

    출력
    첫째 줄에 최대 사람 수를 출력한다.

    예제 입력 1
    0 32
    3 13
    28 25
    39 0
    예제 출력 1
    42
    */
    }

    public void solution2455() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int x, y;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        st.nextToken();
        y = Integer.parseInt(st.nextToken());
        int[] arr = new int[3];
        arr[0] = y;
        for (int i = 0; i < 2; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            arr[i + 1] = arr[i] - x + y;
        }
        br.readLine();
        bw.write(Arrays.stream(arr).min().getAsInt() + "");
        br.close();
        bw.flush();
        bw.close();
    }
}
