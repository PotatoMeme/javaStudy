package com.potatomeme;

import java.util.ArrayList;
import java.util.Collections;
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
            count = new int[num + 1 < 2 ? 2 : num + 1][2];
            count[0][0] = 1;
            count[0][1] = 0;
            count[1][0] = 0;
            count[1][1] = 1;
            if (num <= 1) {
                System.out.println(count[num][0] + " " + count[num][1]);
            } else {
                for (int j = 2; j <= num; j++) {
                    count[j][0] = count[j - 1][0] + count[j - 2][0];
                    count[j][1] = count[j - 1][1] + count[j - 2][1];
                }
                System.out.println(count[num][0] + " " + count[num][1]);
                count = null;
            }
        }

    }

    public void solution1004() {
        //어린 왕자
        /*문제
        어린 왕자는 소혹성 B-664에서 자신이 사랑하는 한 송이 장미를 위해 살아간다. 어느 날 장미가 위험에 빠지게 된 것을 알게 된 어린 왕자는, 장미를 구하기 위해 은하수를 따라 긴 여행을 하기 시작했다. 하지만 어린 왕자의 우주선은 그렇게 좋지 않아서 행성계 간의 이동을 최대한 피해서 여행해야 한다. 아래의 그림은 어린 왕자가 펼쳐본 은하수 지도의 일부이다.

        빨간 실선은 어린 왕자가 출발점에서 도착점까지 도달하는데 있어서 필요한 행성계 진입/이탈 횟수를 최소화하는 경로이며, 원은 행성계의 경계를 의미한다. 이러한 경로는 여러 개 존재할 수 있지만 적어도 3번의 행성계 진입/이탈이 필요하다는 것을 알 수 있다.

        위와 같은 은하수 지도, 출발점, 도착점이 주어졌을 때 어린 왕자에게 필요한 최소의 행성계 진입/이탈 횟수를 구하는 프로그램을 작성해 보자. 행성계의 경계가 맞닿거나 서로 교차하는 경우는 없다. 또한, 출발점이나 도착점이 행성계 경계에 걸쳐진 경우 역시 입력으로 주어지지 않는다.

        입력
        입력의 첫 줄에는 테스트 케이스의 개수 T가 주어진다. 그 다음 줄부터 각각의 테스트케이스에 대해 첫째 줄에 출발점 (x1, y1)과 도착점 (x2, y2)이 주어진다. 두 번째 줄에는 행성계의 개수 n이 주어지며, 세 번째 줄부터 n줄에 걸쳐 행성계의 중점과 반지름 (cx, cy, r)이 주어진다.

        출력
        각 테스트 케이스에 대해 어린 왕자가 거쳐야 할 최소의 행성계 진입/이탈 횟수를 출력한다.

        제한
        -1000 ≤ x1, y1, x2, y2, cx, cy ≤ 1000
        1 ≤ r ≤ 1000
        1 ≤ n ≤ 50
        좌표와 반지름은 모두 정수
        예제 입력 1
        2
        -5 1 12 1
        7
        1 1 8
        -3 -1 1
        2 2 2
        5 5 1
        -4 5 1
        12 1 1
        12 1 2
        -5 1 5 1
        1
        0 0 2
        예제 출력 1
        3
        0
        예제 입력 2
        3
        -5 1 5 1
        3
        0 0 2
        -6 1 2
        6 2 2
        2 3 13 2
        8
        -3 -1 1
        2 2 3
        2 3 1
        0 1 7
        -4 5 1
        12 1 1
        12 1 2
        12 1 3
        102 16 19 -108
        12
        -107 175 135
        -38 -115 42
        140 23 70
        148 -2 39
        -198 -49 89
        172 -151 39
        -179 -52 43
        148 42 150
        176 0 10
        153 68 120
        -56 109 16
        -187 -174 8
        예제 출력 2
        2
        5
        3
        */
        Scanner in = new Scanner(System.in);
        int T, x1, y1, x2, y2, count, n, cx, cy, r;
        T = in.nextInt();
        for (int i = 0; i < T; i++) {
            x1 = in.nextInt();
            y1 = in.nextInt();
            x2 = in.nextInt();
            y2 = in.nextInt();
            count = 0;
            n = in.nextInt();
            for (int j = 0; j < n; j++) {
                cx = in.nextInt();
                cy = in.nextInt();
                r = in.nextInt();
                boolean check1 = false;
                boolean check2 = false;

                if(Math.pow(x1 - cx, 2) + Math.pow(y1 - cy, 2) > Math.pow(r, 2)) check1 = true;
                if(Math.pow(x2 - cx, 2) + Math.pow(y2 - cy, 2) > Math.pow(r, 2)) check2 = true;
                if((check1 && !check2) ||(!check1 && check2)) count++;
            }
            System.out.println(count);
        }

    }

    public void solution1005() {
        //ACM Craft
        /*문제
        서기 2012년! 드디어 2년간 수많은 국민들을 기다리게 한 게임 ACM Craft (Association of Construction Manager Craft)가 발매되었다.

        이 게임은 지금까지 나온 게임들과는 다르게 ACM크래프트는 다이나믹한 게임 진행을 위해 건물을 짓는 순서가 정해져 있지 않다. 즉, 첫 번째 게임과 두 번째 게임이 건물을 짓는 순서가 다를 수도 있다. 매 게임시작 시 건물을 짓는 순서가 주어진다. 또한 모든 건물은 각각 건설을 시작하여 완성이 될 때까지 Delay가 존재한다.

        위의 예시를 보자.

        이번 게임에서는 다음과 같이 건설 순서 규칙이 주어졌다. 1번 건물의 건설이 완료된다면 2번과 3번의 건설을 시작할수 있다. (동시에 진행이 가능하다) 그리고 4번 건물을 짓기 위해서는 2번과 3번 건물이 모두 건설 완료되어야지만 4번건물의 건설을 시작할수 있다.

        따라서 4번건물의 건설을 완료하기 위해서는 우선 처음 1번 건물을 건설하는데 10초가 소요된다. 그리고 2번 건물과 3번 건물을 동시에 건설하기 시작하면 2번은 1초뒤에 건설이 완료되지만 아직 3번 건물이 완료되지 않았으므로 4번 건물을 건설할 수 없다. 3번 건물이 완성되고 나면 그때 4번 건물을 지을수 있으므로 4번 건물이 완성되기까지는 총 120초가 소요된다.

        프로게이머 최백준은 애인과의 데이트 비용을 마련하기 위해 서강대학교배 ACM크래프트 대회에 참가했다! 최백준은 화려한 컨트롤 실력을 가지고 있기 때문에 모든 경기에서 특정 건물만 짓는다면 무조건 게임에서 이길 수 있다. 그러나 매 게임마다 특정건물을 짓기 위한 순서가 달라지므로 최백준은 좌절하고 있었다. 백준이를 위해 특정건물을 가장 빨리 지을 때까지 걸리는 최소시간을 알아내는 프로그램을 작성해주자.

        입력
        첫째 줄에는 테스트케이스의 개수 T가 주어진다. 각 테스트 케이스는 다음과 같이 주어진다. 첫째 줄에 건물의 개수 N과 건물간의 건설순서 규칙의 총 개수 K이 주어진다. (건물의 번호는 1번부터 N번까지 존재한다)

        둘째 줄에는 각 건물당 건설에 걸리는 시간 D1, D2, ..., DN이 공백을 사이로 주어진다. 셋째 줄부터 K+2줄까지 건설순서 X Y가 주어진다. (이는 건물 X를 지은 다음에 건물 Y를 짓는 것이 가능하다는 의미이다)

        마지막 줄에는 백준이가 승리하기 위해 건설해야 할 건물의 번호 W가 주어진다.

        출력
        건물 W를 건설완료 하는데 드는 최소 시간을 출력한다. 편의상 건물을 짓는 명령을 내리는 데는 시간이 소요되지 않는다고 가정한다.

        건설순서는 모든 건물이 건설 가능하도록 주어진다.

        제한
        2 ≤ N ≤ 1000
        1 ≤ K ≤ 100,000
        1 ≤ X, Y, W ≤ N
        0 ≤ Di ≤ 100,000, Di는 정수
        예제 입력 1
        2
        4 4
        10 1 100 10
        1 2
        1 3
        2 4
        3 4
        4
        8 8
        10 20 1 5 8 7 1 43
        1 2
        1 3
        2 4
        2 5
        3 6
        5 7
        6 7
        7 8
        7
        예제 출력 1
        120
        39
        예제 입력 2
        5
        3 2
        1 2 3
        3 2
        2 1
        1
        4 3
        5 5 5 5
        1 2
        1 3
        2 3
        4
        5 10
        100000 99999 99997 99994 99990
        4 5
        3 5
        3 4
        2 5
        2 4
        2 3
        1 5
        1 4
        1 3
        1 2
        4
        4 3
        1 1 1 1
        1 2
        3 2
        1 4
        4
        7 8
        0 0 0 0 0 0 0
        1 2
        1 3
        2 4
        3 4
        4 5
        4 6
        5 7
        6 7
        7
        예제 출력 2
        6
        5
        399990
        2
        0
        */

        }

    }


}
