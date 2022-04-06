package com.potatomeme;

import java.util.Scanner;

public class Baekjoon {
    //https://www.acmicpc.net/problemset
    public void solution1000() {
        //A+B
        /*문제
        두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

                입력
        첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)

        출력
        첫째 줄에 A+B를 출력한다.

        예제 입력 1
        1 2

        예제 출력 1
        3*/
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.println(num1 + num2);
        in.close();
    }

    public void solution1001() {
        //A-B
        /*문제
        두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.

        입력
        첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)

        출력
        첫째 줄에 A-B를 출력한다.

        예제 입력 1
        3 2
        예제 출력 1
        1
        3*/
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.println(num1 - num2);
        in.close();
    }

    public void solution1002() {
        //터렛
        /*문제
        조규현과 백승환은 터렛에 근무하는 직원이다. 하지만 워낙 존재감이 없어서 인구수는 차지하지 않는다. 다음은 조규현과 백승환의 사진이다.
        이석원은 조규현과 백승환에게 상대편 마린(류재명)의 위치를 계산하라는 명령을 내렸다. 조규현과 백승환은 각각 자신의 터렛 위치에서 현재 적까지의 거리를 계산했다.

        조규현의 좌표 (x1, y1)와 백승환의 좌표 (x2, y2)가 주어지고, 조규현이 계산한 류재명과의 거리 r1과 백승환이 계산한 류재명과의 거리 r2가 주어졌을 때, 류재명이 있을 수 있는 좌표의 수를 출력하는 프로그램을 작성하시오.

        입력
        첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 다음과 같이 이루어져 있다.

        한 줄에 x1, y1, r1, x2, y2, r2가 주어진다. x1, y1, x2, y2는 -10,000보다 크거나 같고, 10,000보다 작거나 같은 정수이고, r1, r2는 10,000보다 작거나 같은 자연수이다.

        출력
        각 테스트 케이스마다 류재명이 있을 수 있는 위치의 수를 출력한다. 만약 류재명이 있을 수 있는 위치의 개수가 무한대일 경우에는 -1을 출력한다.

        예제 입력 1
        3
        0 0 13 40 0 37
        0 0 3 0 7 4
        1 1 1 1 1 5

        예제 출력 1
        2
        1
        0
        */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x1, y1, r1, x2, y2, r2;
        int d_x, d_y;
        double d;
        for (int i = 0; i < n; i++) {
            x1 = in.nextInt();
            y1 = in.nextInt();
            r1 = in.nextInt();
            x2 = in.nextInt();
            y2 = in.nextInt();
            r2 = in.nextInt();
            d_x = x1 > x2 ? x1 - x2 : x2 - x1;
            d_y = y1 > y2 ? y1 - y2 : y2 - y1;
            d = Math.sqrt(d_x * d_x + d_y * d_y);
            if (d == 0 && r1 == r2) {
                System.out.println(-1);
            } else if (d < r1 + r2 && d > Math.abs(r1 - r2)) {
                System.out.println(2);
            } else if (d == r1 + r2 || Math.abs(r1 - r2) == d) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
        in.close();
    }

    public void solution1003() {
        //피보나치 함수
        /*문제
        문제
        다음 소스는 N번째 피보나치 수를 구하는 C++ 함수이다.

        int fibonacci(int n) {
            if (n == 0) {
                printf("0");
                return 0;
            } else if (n == 1) {
                printf("1");
                return 1;
            } else {
                return fibonacci(n‐1) + fibonacci(n‐2);
            }
        }
        fibonacci(3)을 호출하면 다음과 같은 일이 일어난다.

        fibonacci(3)은 fibonacci(2)와 fibonacci(1) (첫 번째 호출)을 호출한다.
        fibonacci(2)는 fibonacci(1) (두 번째 호출)과 fibonacci(0)을 호출한다.
        두 번째 호출한 fibonacci(1)은 1을 출력하고 1을 리턴한다.
        fibonacci(0)은 0을 출력하고, 0을 리턴한다.
        fibonacci(2)는 fibonacci(1)과 fibonacci(0)의 결과를 얻고, 1을 리턴한다.
        첫 번째 호출한 fibonacci(1)은 1을 출력하고, 1을 리턴한다.
        fibonacci(3)은 fibonacci(2)와 fibonacci(1)의 결과를 얻고, 2를 리턴한다.
        1은 2번 출력되고, 0은 1번 출력된다. N이 주어졌을 때, fibonacci(N)을 호출했을 때, 0과 1이 각각 몇 번 출력되는지 구하는 프로그램을 작성하시오.

        입력
        첫째 줄에 테스트 케이스의 개수 T가 주어진다.

        각 테스트 케이스는 한 줄로 이루어져 있고, N이 주어진다. N은 40보다 작거나 같은 자연수 또는 0이다.

        출력
        각 테스트 케이스마다 0이 출력되는 횟수와 1이 출력되는 횟수를 공백으로 구분해서 출력한다.

        예제 입력 1
        3
        0
        1
        3
        예제 출력 1
        1 0
        0 1
        1 2
        예제 입력 2
        2
        6
        22
        예제 출력 2
        5 8
        10946 17711
        */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] count;
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            count = new int[num + 1<2?2:num+1][2];
            count[0][0] = 1; count[0][1] = 0;
            count[1][0] = 0; count[1][1] = 1;
            if (num <= 1) {
                System.out.println(count[num][0] + " " + count[num][1]);
            }else{
                for (int j = 2; j <= num; j++) {
                    count[j][0] = count[j - 1][0] + count[j - 2][0];
                    count[j][1] = count[j - 1][1] + count[j - 2][1];
                }
                System.out.println(count[num][0] + " " + count[num][1]);
                count = null;
            }
        }

    }


}
