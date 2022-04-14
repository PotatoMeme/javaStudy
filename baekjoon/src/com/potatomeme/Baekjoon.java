package com.potatomeme;

import java.io.*;
import java.util.*;

public class Baekjoon {
    //https://www.acmicpc.net/problemset
    {//A+B
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
    }

    public void solution1000() {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.println(num1 + num2);
        in.close();
    }

    {//A-B
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
    }

    public void solution1001() {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.println(num1 - num2);
        in.close();
    }

    {//터렛
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
    }

    public void solution1002() {
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

    {//피보나치 함수
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
    }

    public void solution1003() {
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

    {//어린 왕자
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
    }

    public void solution1004() {
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

                if (Math.pow(x1 - cx, 2) + Math.pow(y1 - cy, 2) > Math.pow(r, 2)) check1 = true;
                if (Math.pow(x2 - cx, 2) + Math.pow(y2 - cy, 2) > Math.pow(r, 2)) check2 = true;
                if ((check1 && !check2) || (!check1 && check2)) count++;
            }
            System.out.println(count);
        }
    }

    // 여기서부터 단계별로
    //  1 단계 : 입출력과 사칙연산 ----------------------------------------------------------
    //2557
    {/*Hello World
    문제
    Hello World!를 출력하시오.

    입력
            없음

    출력
    Hello World!를 출력하시오.

    예제 입력 1
    예제 출력 1
    Hello World!*/
    }

    public void solution2557() {
        System.out.println("Hello World!");
    }

    //10718
    {/*문제
    ACM-ICPC 인터넷 예선, Regional, 그리고 World Finals까지 이미 2회씩 진출해버린 kriii는 미련을 버리지 못하고 왠지 모르게 올해에도 파주 World Finals 준비 캠프에 참여했다.

    대회를 뜰 줄 모르는 지박령 kriii를 위해서 격려의 문구를 출력해주자.

    입력
    본 문제는 입력이 없다.

    출력
    두 줄에 걸쳐 "강한친구 대한육군"을 한 줄에 한 번씩 출력한다.

    예제 입력 1
    예제 출력 1
    강한친구 대한육군
    강한친구 대한육군*/
    }

    public void solution10718() {
        System.out.println("강한친구 대한육군\n강한친구 대한육군");
    }

    //10171
    {/*문제
    아래 예제와 같이 고양이를 출력하시오.

    입력
    없음.

    출력
    고양이를 출력한다.

    예제 입력 1
    예제 출력 1
    \    /\
     )  ( ')
    (  /  )
     \(__)|*/
    }

    public void solution10171() {
        System.out.println("\\    /\\\n )  ( ')\n(  /  )\n \\(__)|");
    }

    //10172
    {/*문제
    아래 예제와 같이 개를 출력하시오.

    입력
    없음.

    출력
    개를 출력한다.

    예제 입력 1
    예제 출력 1
    |\_/|
    |q p|   /}
    ( 0 )"""\
    |"^"`    |
    ||_/=\\__|*/
    }

    public void solution10172() {
        System.out.println("|\\_/|\n|q p|   /}\n( 0 )\"\"\"\\\n|\"^\"`    |\n||_/=\\\\__|");
    }

    //10998
    {/*문제
    두 정수 A와 B를 입력받은 다음, A×B를 출력하는 프로그램을 작성하시오.

    입력
    첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)

    출력
    첫째 줄에 A×B를 출력한다.

    예제 입력 1
    1 2
    예제 출력 1
    2
    예제 입력 2
    3 4
    예제 출력 2
    12*/
    }

    public void solution10998() {
        Scanner in = new Scanner(System.in);
        System.out.println(in.nextInt() * in.nextInt());
    }

    //1008
    {/*문제
    두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.

    입력
    첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)

    출력
    첫째 줄에 A/B를 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-9 이하이면 정답이다.

    예제 입력 1
    1 3
    예제 출력 1
    0.33333333333333333333333333333333
    10-9 이하의 오차를 허용한다는 말은 꼭 소수 9번째 자리까지만 출력하라는 뜻이 아니다.

    예제 입력 2
    4 5
    예제 출력 2
    0.8*/
    }

    public void solution1008() {
        Scanner in = new Scanner(System.in);
        System.out.println(in.nextDouble() / in.nextInt());
    }

    //10869
    {/*문제
    두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오.

    입력
    두 자연수 A와 B가 주어진다. (1 ≤ A, B ≤ 10,000)

    출력
    첫째 줄에 A+B, 둘째 줄에 A-B, 셋째 줄에 A*B, 넷째 줄에 A/B, 다섯째 줄에 A%B를 출력한다.

    예제 입력 1
    7 3
    예제 출력 1
    10
    4
    21
    2
    1*/
    }

    public void solution10869() {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        System.out.println(A + B);
        System.out.println(A - B);
        System.out.println(A * B);
        System.out.println(A / B);
        System.out.println(A % B);
    }

    //10926
    {/*문제
    준하는 사이트에 회원가입을 하다가 joonas라는 아이디가 이미 존재하는 것을 보고 놀랐다. 준하는 놀람을 ??!로 표현한다. 준하가 가입하려고 하는 사이트에 이미 존재하는 아이디가 주어졌을 때, 놀람을 표현하는 프로그램을 작성하시오.

    입력
    첫째 줄에 준하가 가입하려고 하는 사이트에 이미 존재하는 아이디가 주어진다. 아이디는 알파벳 소문자로만 이루어져 있으며, 길이는 50자를 넘지 않는다.

    출력
    첫째 줄에 준하의 놀람을 출력한다. 놀람은 아이디 뒤에 ??!를 붙여서 나타낸다.

    예제 입력 1
    joonas
    예제 출력 1
    joonas??!*/
    }

    public void solution10926() {
        Scanner in = new Scanner(System.in);
        System.out.println(in.next() + "??!");
    }

    //18108
    {/*문제
    ICPC Bangkok Regional에 참가하기 위해 수완나품 국제공항에 막 도착한 팀 레드시프트 일행은 눈을 믿을 수 없었다. 공항의 대형 스크린에 올해가 2562년이라고 적혀 있던 것이었다.

    불교 국가인 태국은 불멸기원(佛滅紀元), 즉 석가모니가 열반한 해를 기준으로 연도를 세는 불기를 사용한다. 반면, 우리나라는 서기 연도를 사용하고 있다. 불기 연도가 주어질 때 이를 서기 연도로 바꿔 주는 프로그램을 작성하시오.

    입력
    서기 연도를 알아보고 싶은 불기 연도 y가 주어진다. (1000 ≤ y ≤ 3000)

    출력
    불기 연도를 서기 연도로 변환한 결과를 출력한다.

    예제 입력 1
    2541
    예제 출력 1
    1998*/
    }

    public void solution18108() {
        Scanner in = new Scanner(System.in);
        System.out.println(in.nextInt() - 543);
    }

    //10430
    {/*문제
    (A+B)%C는 ((A%C) + (B%C))%C 와 같을까?

    (A×B)%C는 ((A%C) × (B%C))%C 와 같을까?

    세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.

    입력
    첫째 줄에 A, B, C가 순서대로 주어진다. (2 ≤ A, B, C ≤ 10000)

    출력
    첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C, 셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.

    예제 입력 1
    5 8 4
    예제 출력 1
    1
    1
    0
    0*/
    }

    public void solution10430() {
        Scanner in = new Scanner(System.in);
        int A, B, C;
        A = in.nextInt();
        B = in.nextInt();
        C = in.nextInt();
        System.out.println((A + B) % C);
        System.out.println(((A % C) + (B % C)) % C);
        System.out.println((A * B) % C);
        System.out.println(((A % C) * (B % C)) % C);
    }

    //2588
    {/*문제
    (세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.

    (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.

    입력
    첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.

    출력
    첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.

    예제 입력 1
    472
    385
    예제 출력 1
    2360
    3776
    1416
    181720*/
    }

    public void solution2588() {
        Scanner in = new Scanner(System.in);
        int A, B;
        A = in.nextInt();
        B = in.nextInt();
        System.out.println(A * (B % 10));
        System.out.println(A * (B % 100 / 10));
        System.out.println(A * (B / 100));
        System.out.println(A * B);
    }
    //  2 단계 : 조건문 ----------------------------------------------------------

    //1330
    {/*문제
    두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.

    입력
    첫째 줄에 A와 B가 주어진다. A와 B는 공백 한 칸으로 구분되어져 있다.

    출력
    첫째 줄에 다음 세 가지 중 하나를 출력한다.

    A가 B보다 큰 경우에는 '>'를 출력한다.
    A가 B보다 작은 경우에는 '<'를 출력한다.
    A와 B가 같은 경우에는 '=='를 출력한다.
    제한
    -10,000 ≤ A, B ≤ 10,000
    예제 입력 1
    1 2
    예제 출력 1
    <
    예제 입력 2
    10 2
    예제 출력 2
    >
    예제 입력 3
    5 5
    예제 출력 3
    ==*/
    }

    public void solution1330() {
        Scanner in = new Scanner(System.in);
        int A, B;
        A = in.nextInt();
        B = in.nextInt();
        System.out.println(A > B ? '>' : A == B ? "==" : '<');
    }

    //9498
    {/*문제
    시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.

    입력
    첫째 줄에 시험 점수가 주어진다. 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.

    출력
    시험 성적을 출력한다.

    예제 입력 1
    100
    예제 출력 1
    A*/
    }

    public void solution9498() {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        System.out.println(A > 89 ? 'A' : A > 79 ? 'B' : A > 69 ? 'C' : A > 59 ? 'D' : 'F');
    }

    //2753
    {/*문제
    연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.

    윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.

    예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이다. 1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아니다. 하지만, 2000년은 400의 배수이기 때문에 윤년이다.

    입력
    첫째 줄에 연도가 주어진다. 연도는 1보다 크거나 같고, 4000보다 작거나 같은 자연수이다.

    출력
    첫째 줄에 윤년이면 1, 아니면 0을 출력한다.

    예제 입력 1
    2000
    예제 출력 1
    1
    예제 입력 2
    1999
    예제 출력 2
    0*/
    }

    public void solution2753() {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        System.out.println(A % 4 == 0 && (A % 100 != 0 || A % 400 == 0) ? 1 : 0);
    }

    //14681
    {/*문제
    흔한 수학 문제 중 하나는 주어진 점이 어느 사분면에 속하는지 알아내는 것이다. 사분면은 아래 그림처럼 1부터 4까지 번호를 갖는다. "Quadrant n"은 "제n사분면"이라는 뜻이다.

    예를 들어, 좌표가 (12, 5)인 점 A는 x좌표와 y좌표가 모두 양수이므로 제1사분면에 속한다. 점 B는 x좌표가 음수이고 y좌표가 양수이므로 제2사분면에 속한다.

    점의 좌표를 입력받아 그 점이 어느 사분면에 속하는지 알아내는 프로그램을 작성하시오. 단, x좌표와 y좌표는 모두 양수나 음수라고 가정한다.

    입력
    첫 줄에는 정수 x가 주어진다. (−1000 ≤ x ≤ 1000; x ≠ 0) 다음 줄에는 정수 y가 주어진다. (−1000 ≤ y ≤ 1000; y ≠ 0)

    출력
    점 (x, y)의 사분면 번호(1, 2, 3, 4 중 하나)를 출력한다.

    예제 입력 1
    12
    5
    예제 출력 1
    1
    예제 입력 2
    9
    -13
    예제 출력 2
    4*/
    }

    public void solution14681() {
        Scanner in = new Scanner(System.in);
        boolean x = in.nextInt() > 0;
        boolean y = in.nextInt() > 0;
        if (x && y) {
            System.out.println(1);
        } else if (!x && y) {
            System.out.println(2);
        } else if (!x && !y) {
            System.out.println(3);
        } else {
            System.out.println(4);
        }

        //System.out.println(x&&y?1:!x&&y?2:!x&&!y?3:4);
        // 시간은 짧아지고 메모리 사용량은 많아짐

    }

    //2884
    {/*문제
    상근이는 매일 아침 알람을 듣고 일어난다. 알람을 듣고 바로 일어나면 다행이겠지만, 항상 조금만 더 자려는 마음 때문에 매일 학교를 지각하고 있다.

    상근이는 모든 방법을 동원해보았지만, 조금만 더 자려는 마음은 그 어떤 것도 없앨 수가 없었다.

    이런 상근이를 불쌍하게 보던, 창영이는 자신이 사용하는 방법을 추천해 주었다.

    바로 "45분 일찍 알람 설정하기"이다.

    이 방법은 단순하다. 원래 설정되어 있는 알람을 45분 앞서는 시간으로 바꾸는 것이다. 어차피 알람 소리를 들으면, 알람을 끄고 조금 더 잘 것이기 때문이다. 이 방법을 사용하면, 매일 아침 더 잤다는 기분을 느낄 수 있고, 학교도 지각하지 않게 된다.

    현재 상근이가 설정한 알람 시각이 주어졌을 때, 창영이의 방법을 사용한다면, 이를 언제로 고쳐야 하는지 구하는 프로그램을 작성하시오.

    입력
    첫째 줄에 두 정수 H와 M이 주어진다. (0 ≤ H ≤ 23, 0 ≤ M ≤ 59) 그리고 이것은 현재 상근이가 설정한 놓은 알람 시간 H시 M분을 의미한다.

    입력 시간은 24시간 표현을 사용한다. 24시간 표현에서 하루의 시작은 0:0(자정)이고, 끝은 23:59(다음날 자정 1분 전)이다. 시간을 나타낼 때, 불필요한 0은 사용하지 않는다.

    출력
    첫째 줄에 상근이가 창영이의 방법을 사용할 때, 설정해야 하는 알람 시간을 출력한다. (입력과 같은 형태로 출력하면 된다.)

    예제 입력 1
    10 10
    예제 출력 1
    9 25
    예제 입력 2
    0 30
    예제 출력 2
    23 45
    예제 입력 3
    23 40
    예제 출력 3
    22 55*/
    }

    public void solution2884() {
        Scanner in = new Scanner(System.in);
        int H = in.nextInt();
        int M = in.nextInt();
        System.out.println(M - 45 >= 0 ? H + " " + (M - 45) : H - 1 >= 0 ? (H - 1) + " " + (M + 15) : "23 " + (M + 15));
    }

    //2525
    {/*문제
    KOI 전자에서는 건강에 좋고 맛있는 훈제오리구이 요리를 간편하게 만드는 인공지능 오븐을 개발하려고 한다. 인공지능 오븐을 사용하는 방법은 적당한 양의 오리 훈제 재료를 인공지능 오븐에 넣으면 된다. 그러면 인공지능 오븐은 오븐구이가 끝나는 시간을 분 단위로 자동적으로 계산한다.

    또한, KOI 전자의 인공지능 오븐 앞면에는 사용자에게 훈제오리구이 요리가 끝나는 시각을 알려 주는 디지털 시계가 있다.

    훈제오리구이를 시작하는 시각과 오븐구이를 하는 데 필요한 시간이 분단위로 주어졌을 때, 오븐구이가 끝나는 시각을 계산하는 프로그램을 작성하시오.

    입력
    첫째 줄에는 현재 시각이 나온다. 현재 시각은 시 A (0 ≤ A ≤ 23) 와 분 B (0 ≤ B ≤ 59)가 정수로 빈칸을 사이에 두고 순서대로 주어진다. 두 번째 줄에는 요리하는 데 필요한 시간 C (0 ≤ C ≤ 1,000)가 분 단위로 주어진다.

    출력
    첫째 줄에 종료되는 시각의 시와 분을 공백을 사이에 두고 출력한다. (단, 시는 0부터 23까지의 정수, 분은 0부터 59까지의 정수이다. 디지털 시계는 23시 59분에서 1분이 지나면 0시 0분이 된다.)

    예제 입력 1
    14 30
    20
    예제 출력 1
    14 50
    예제 입력 2
    17 40
    80
    예제 출력 2
    19 0
    예제 입력 3
    23 48
    25
    예제 출력 3
    0 13*/
    }

    public void solution2525() {
        Scanner in = new Scanner(System.in);
        int H = in.nextInt();
        int M = in.nextInt();
        int m = in.nextInt();
        H += m / 60;
        M += m % 60;
        if (M > 59) {
            H += 1;
            M -= 60;
        }
        if (H > 23) {
            H -= 24;
        }
        System.out.println(H + " " + M);
    }

    //2480
    {/*문제
    1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다.

    같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
    같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
    모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.
    예를 들어, 3개의 눈 3, 3, 6이 주어지면 상금은 1,000+3×100으로 계산되어 1,300원을 받게 된다. 또 3개의 눈이 2, 2, 2로 주어지면 10,000+2×1,000 으로 계산되어 12,000원을 받게 된다. 3개의 눈이 6, 2, 5로 주어지면 그중 가장 큰 값이 6이므로 6×100으로 계산되어 600원을 상금으로 받게 된다.

    3개 주사위의 나온 눈이 주어질 때, 상금을 계산하는 프로그램을 작성 하시오.

    입력
    첫째 줄에 3개의 눈이 빈칸을 사이에 두고 각각 주어진다.

    출력
    첫째 줄에 게임의 상금을 출력 한다.

    예제 입력 1
    3 3 6
    예제 출력 1
    1300
    예제 입력 2
    2 2 2
    예제 출력 2
    12000
    예제 입력 3
    6 2 5
    예제 출력 3
    600*/
    }

    public void solution2480() {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        int result = 0;
        if (A == B & A == C) {
            result = A * 1000 + 10000;
        } else if (A == B || A == C) {
            result = A * 100 + 1000;
        } else if (B == C) {
            result = B * 100 + 1000;
        } else {
            result = (A > B && A > C ? A : B > A && B > C ? B : C) * 100;
        }
        System.out.println(result);
    }

    //  3 단계 : 반복문 ----------------------------------------------------------

    //2739
    {/*문제
    N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.

    입력
    첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 9보다 작거나 같다.

    출력
    출력형식과 같게 N*1부터 N*9까지 출력한다.

    예제 입력 1
    2
    예제 출력 1
    2 * 1 = 2
    2 * 2 = 4
    2 * 3 = 6
    2 * 4 = 8
    2 * 5 = 10
    2 * 6 = 12
    2 * 7 = 14
    2 * 8 = 16
    2 * 9 = 18*/
    }

    public void solution2739() {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        for (int i = 1; i < 10; i++) {
            System.out.println(String.format("%d * %d = %d", A, i, A * i));
        }
    }

    //10950
    {/*문제
    두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

    입력
    첫째 줄에 테스트 케이스의 개수 T가 주어진다.

    각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

    출력
    각 테스트 케이스마다 A+B를 출력한다.

    예제 입력 1
    5
    1 1
    2 3
    3 4
    9 8
    5 2
    예제 출력 1
    2
    5
    7
    17
    7*/
    }

    public void solution10950() {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            System.out.println(in.nextInt() + in.nextInt());
        }
    }

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

    //15552
    {/*문제
    본격적으로 for문 문제를 풀기 전에 주의해야 할 점이 있다. 입출력 방식이 느리면 여러 줄을 입력받거나 출력할 때 시간초과가 날 수 있다는 점이다.

    C++을 사용하고 있고 cin/cout을 사용하고자 한다면, cin.tie(NULL)과 sync_with_stdio(false)를 둘 다 적용해 주고, endl 대신 개행문자(\n)를 쓰자. 단, 이렇게 하면 더 이상 scanf/printf/puts/getchar/putchar 등 C의 입출력 방식을 사용하면 안 된다.

    Java를 사용하고 있다면, Scanner와 System.out.println 대신 BufferedReader와 BufferedWriter를 사용할 수 있다. BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.

    Python을 사용하고 있다면, input 대신 sys.stdin.readline을 사용할 수 있다. 단, 이때는 맨 끝의 개행문자까지 같이 입력받기 때문에 문자열을 저장하고 싶을 경우 .rstrip()을 추가로 해 주는 것이 좋다.

    또한 입력과 출력 스트림은 별개이므로, 테스트케이스를 전부 입력받아서 저장한 뒤 전부 출력할 필요는 없다. 테스트케이스를 하나 받은 뒤 하나 출력해도 된다.

    자세한 설명 및 다른 언어의 경우는 이 글에 설명되어 있다.

    이 블로그 글에서 BOJ의 기타 여러 가지 팁을 볼 수 있다.

    입력
    첫 줄에 테스트케이스의 개수 T가 주어진다. T는 최대 1,000,000이다. 다음 T줄에는 각각 두 정수 A와 B가 주어진다. A와 B는 1 이상, 1,000 이하이다.

    출력
    각 테스트케이스마다 A+B를 한 줄에 하나씩 순서대로 출력한다.

    예제 입력 1
    5
    1 1
    12 34
    5 500
    40 60
    1000 1000
    예제 출력 1
    2
    46
    505
    100
    2000*/
    }

    public void solution15552_ver1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        String st;
        for (int i = 0; i < T; i++) {
            st = br.readLine();
            int a = Integer.parseInt(st.split(" ")[0]);
            int b = Integer.parseInt(st.split(" ")[1]);
            bw.write(a + b + "\n");// stack처럼bw에 추가
        }
        br.close();
        bw.flush();// 한번에 출력력
        bw.close();
    }

    public void solution15552_ver2() throws IOException {// StringTokenizer가 더빠름
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write(a + b + "\n");// stack처럼bw에 추가
        }
        br.close();
        bw.flush();// 한번에 출력력
        bw.close();
    }

    //2741
    {/*
    첫째 줄부터 N번째 줄 까지 차례대로 출력한다.

    예제 입력 1
    5
    예제 출력 1
    1
    2
    3
    4
    5*/
    }

    public void solution2741_ver1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for (int i = 1; i <= N; i++) {
            bw.write(i + "\n");// stack처럼bw에 추가
        }
        br.close();
        bw.flush();// 한번에 출력력
        bw.close();
    }

    public void solution2741_ver2() throws IOException {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for (int i = 1; i <= N; i++) {
            System.out.println(i);
        }
    }

    //2742
    {/*문제
    자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.

    입력
    첫째 줄에 100,000보다 작거나 같은 자연수 N이 주어진다.

    출력
    첫째 줄부터 N번째 줄 까지 차례대로 출력한다.

    예제 입력 1
    5
    예제 출력 1
    5
    4
    3
    2
    1*/
    }

    public void solution2742() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for (int i = N; i > 0; i--) {
            bw.write(i + "\n");// stack처럼bw에 추가
        }
        br.close();
        bw.flush();// 한번에 출력력
        bw.close();
    }

    //11021
    {/*문제
    자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.

    입력
    첫째 줄에 100,000보다 작거나 같은 자연수 N이 주어진다.

    출력
    첫째 줄부터 N번째 줄 까지 차례대로 출력한다.

    예제 입력 1
    5
    예제 출력 1
    5
    4
    3
    2
    1*/
    }

    public void solution11021_ver1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int A, B;
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            bw.write("Case #" + i + ": " + (A + B) + "\n");
        }
        br.close();
        bw.flush();// 한번에 출력력
        bw.close();
    }

    public void solution11021_ver2() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Case #" + i + ": " + (in.nextInt() + in.nextInt()));
        }
    }

    //11022
    {/*문제
    자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.

    입력
    첫째 줄에 100,000보다 작거나 같은 자연수 N이 주어진다.

    출력
    첫째 줄부터 N번째 줄 까지 차례대로 출력한다.

    예제 입력 1
    5
    예제 출력 1
    5
    4
    3
    2
    1*/
    }

    public void solution11022() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int A, B;
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            bw.write("Case #" + i + ": " + A + " + " + B + " = " + (A + B) + "\n");
        }
        br.close();
        bw.flush();// 한번에 출력력
        bw.close();
    }

    //2438
    {/*문제
    첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제

    입력
    첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

    출력
    첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.

    예제 입력 1
    5
    예제 출력 1
    *
    **
    ***
    ****
    *****
    */
    }

    public void solution2438() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                bw.write('*');
            }
            bw.write('\n');
        }
        br.close();
        bw.flush();
        bw.close();
    }

    //2439
    {/*문제
    첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제

    하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.

    입력
    첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

    출력
    첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.

    예제 입력 1
    5
    예제 출력 1
        *
       **
      ***
     ****
    *****
    */
    }

    public void solution2439() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j > 0; j--) {
                bw.write(' ');
            }
            for (int j = 0; j < i; j++) {
                bw.write('*');
            }
            bw.write('\n');
        }
        br.close();
        bw.flush();
        bw.close();
    }

    //10871
    {/*문제
    정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.

    입력
    첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)

    둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.

    출력
    X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다. X보다 작은 수는 적어도 하나 존재한다.

    예제 입력 1
    10 5
    1 10 4 9 2 3 8 5 7 6
    예제 출력 1
    1 4 2 3
    */
    }

    public void solution10871() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), " ");
        int check;
        for (int i = 0; i < N; i++) {
            check = Integer.parseInt(st.nextToken());
            if (check < X) bw.write(check + " ");
        }
        br.close();
        bw.flush();
        bw.close();
    }

    //10952
    {/*문제
    두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

    입력
    입력은 여러 개의 테스트 케이스로 이루어져 있다.

    각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

    입력의 마지막에는 0 두 개가 들어온다.

    출력
    각 테스트 케이스마다 A+B를 출력한다.

    예제 입력 1
    1 1
    2 3
    3 4
    9 8
    5 2
    0 0
    예제 출력 1
    2
    5
    7
    17
    7
    */
    }

    public void solution10952() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A, B;
        StringTokenizer st;
        while (true) {
            st = new StringTokenizer(br.readLine(), " ");
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            if (A == 0 && B == 0) break;
            bw.write((A + B) + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }

    //10951
    {/*문제
    두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

    입력
    입력은 여러 개의 테스트 케이스로 이루어져 있다.

    각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

    출력
    각 테스트 케이스마다 A+B를 출력한다.

    예제 입력 1
    1 1
    2 3
    3 4
    9 8
    5 2
    예제 출력 1
    2
    5
    7
    17
    7
    */
    }

    public void solution10951() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A, B;
        String str;
        StringTokenizer st;
        while ((str = br.readLine()) != null) {
            st = new StringTokenizer(str, " ");
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            bw.write((A + B) + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }

    //1110
    {/*문제
    0보다 크거나 같고, 99보다 작거나 같은 정수가 주어질 때 다음과 같은 연산을 할 수 있다. 먼저 주어진 수가 10보다 작다면 앞에 0을 붙여 두 자리 수로 만들고, 각 자리의 숫자를 더한다. 그 다음, 주어진 수의 가장 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리 수를 이어 붙이면 새로운 수를 만들 수 있다. 다음 예를 보자.

    26부터 시작한다. 2+6 = 8이다. 새로운 수는 68이다. 6+8 = 14이다. 새로운 수는 84이다. 8+4 = 12이다. 새로운 수는 42이다. 4+2 = 6이다. 새로운 수는 26이다.

    위의 예는 4번만에 원래 수로 돌아올 수 있다. 따라서 26의 사이클의 길이는 4이다.

    N이 주어졌을 때, N의 사이클의 길이를 구하는 프로그램을 작성하시오.

    입력
    첫째 줄에 N이 주어진다. N은 0보다 크거나 같고, 99보다 작거나 같은 정수이다.

    출력
    첫째 줄에 N의 사이클 길이를 출력한다.

    예제 입력 1
    26
    예제 출력 1
    4
    예제 입력 2
    55
    예제 출력 2
    3
    예제 입력 3
    1
    예제 출력 3
    60
    예제 입력 4
    0
    예제 출력 4
    1
    예제 입력 5
    71
    예제 출력 5
    12
    */
    }

    public void solution1110() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int x, y, saveData, cnt;
        saveData = A;
        cnt = 0;
        do {
            x = saveData / 10;
            y = saveData % 10;
            saveData = y * 10 + (x + y) % 10;
            cnt++;
        } while (saveData != A);
        br.close();
        System.out.println(cnt);
    }

    //  4 단계 : 1차원 배열 ----------------------------------------------------------
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

    //2562
    {/*문제
    9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.

    예를 들어, 서로 다른 9개의 자연수

    3, 29, 38, 12, 57, 74, 40, 85, 61

    이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.

    입력
    첫째 줄부터 아홉 번째 줄까지 한 줄에 하나의 자연수가 주어진다. 주어지는 자연수는 100 보다 작다.

    출력
    첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 몇 번째 수인지를 출력한다.

    예제 입력 1
    3
    29
    38
    12
    57
    74
    40
    85
    61
    예제 출력 1
    85
    8
    */
    }

    public void solution2562_ver1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] num = new int[9];
        for (int i = 0; i < 9; i++) {
            num[i] = Integer.parseInt(br.readLine());
        }
        int max, index;
        max = num[0];
        index = 1;
        for (int i = 0; i < 9; i++) {
            max = max > num[i] ? max : num[i];
            index = max == num[i] ? i + 1 : index;
        }
        bw.write(max + "\n" + index);
        br.close();
        bw.flush();
        bw.close();
    }

    //2562
    {/*문제
    세 개의 자연수 A, B, C가 주어질 때 A × B × C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.

    예를 들어 A = 150, B = 266, C = 427 이라면 A × B × C = 150 × 266 × 427 = 17037300 이 되고, 계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.

    입력
    첫째 줄에 A, 둘째 줄에 B, 셋째 줄에 C가 주어진다. A, B, C는 모두 100보다 크거나 같고, 1,000보다 작은 자연수이다.

    출력
    첫째 줄에는 A × B × C의 결과에 0 이 몇 번 쓰였는지 출력한다. 마찬가지로 둘째 줄부터 열 번째 줄까지 A × B × C의 결과에 1부터 9까지의 숫자가 각각 몇 번 쓰였는지 차례로 한 줄에 하나씩 출력한다.

    예제 입력 1
    150
    266
    427
    예제 출력 1
    3
    1
    0
    2
    0
    0
    0
    2
    0
    0
    */
    }

    public void solution2577() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int result = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
        int[] num = new int[10];
        while (result > 0) {
            num[result % 10]++;
            result = result / 10;
        }
        for (int i : num) {
            bw.write(i + '\n');
        }
        br.close();
        bw.flush();
        bw.close();
    }

    //3052
    {/*문제
    두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다.

    수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.

    입력
    첫째 줄부터 열번째 줄 까지 숫자가 한 줄에 하나씩 주어진다. 이 숫자는 1,000보다 작거나 같고, 음이 아닌 정수이다.

    출력
    첫째 줄에, 42로 나누었을 때, 서로 다른 나머지가 몇 개 있는지 출력한다.

    예제 입력 1
    1
    2
    3
    4
    5
    6
    7
    8
    9
    10
    예제 출력 1
    10
    각 수를 42로 나눈 나머지는 1, 2, 3, 4, 5, 6, 7, 8, 9, 10이다.

    예제 입력 2
    42
    84
    252
    420
    840
    126
    42
    84
    420
    126
    예제 출력 2
    1
    모든 수를 42로 나눈 나머지는 0이다.

    예제 입력 3
    39
    40
    41
    42
    43
    44
    82
    83
    84
    85
    예제 출력 3
    6
    */
    }

    public void solution3052() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] num = new int[47];
        for (int i = 0; i < 10; i++) {
            num[Integer.parseInt(br.readLine()) % 42]++;
        }
        int cnt = 0;
        for (int i : num) {
            if (i > 0) {
                cnt++;
            }
        }
        bw.write(String.valueOf(cnt));
        br.close();
        bw.flush();
        bw.close();
    }

    //1546
    {/*문제
    세준이는 기말고사를 망쳤다. 세준이는 점수를 조작해서 집에 가져가기로 했다. 일단 세준이는 자기 점수 중에 최댓값을 골랐다. 이 값을 M이라고 한다. 그리고 나서 모든 점수를 점수/M*100으로 고쳤다.

    예를 들어, 세준이의 최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.

    세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오.

    입력
    첫째 줄에 시험 본 과목의 개수 N이 주어진다. 이 값은 1000보다 작거나 같다. 둘째 줄에 세준이의 현재 성적이 주어진다. 이 값은 100보다 작거나 같은 음이 아닌 정수이고, 적어도 하나의 값은 0보다 크다.

    출력
    첫째 줄에 새로운 평균을 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-2 이하이면 정답이다.

    예제 입력 1
    3
    40 80 60
    예제 출력 1
    75.0
    예제 입력 2
    3
    10 20 30
    예제 출력 2
    66.666667
    10-2 이하의 오차를 허용한다는 말은 정확히 소수 2번째 자리까지 출력하라는 뜻이 아니다.

    예제 입력 3
    4
    1 100 100 100
    예제 출력 3
    75.25
    예제 입력 4
    5
    1 2 4 8 16
    예제 출력 4
    38.75
    예제 입력 5
    2
    3 10
    예제 출력 5
    65.0
    예제 입력 6
    4
    10 20 0 100
    예제 출력 6
    32.5
    예제 입력 7
    1
    50
    예제 출력 7
    100.0
    예제 입력 8
    9
    10 20 30 40 50 60 70 80 90
    예제 출력 8
    55.55555555555556
    */
    }

    public void solution1546() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] num = new int[n];
        float sum = 0;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            sum += (num[i] = Integer.parseInt(st.nextToken()));
        }
        bw.write(String.valueOf(sum / Arrays.stream(num).max().getAsInt() * 100 / n));
        br.close();
        bw.flush();
        bw.close();
    }

    //8958
    {/*문제
    "OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다. 문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 예를 들어, 10번 문제의 점수는 3이 된다.

    "OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.

    OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.

    입력
    첫째 줄에 테스트 케이스의 개수가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 길이가 0보다 크고 80보다 작은 문자열이 주어진다. 문자열은 O와 X만으로 이루어져 있다.

    출력
    각 테스트 케이스마다 점수를 출력한다.

    예제 입력 1
    5
    OOXXOXXOOO
    OOXXOOXXOO
    OXOXOXOXOXOXOX
    OOOOOOOOOO
    OOOOXOOOOXOOOOX
    예제 출력 1
    10
    9
    7
    55
    30
    */
    }

    public void solution8958() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String[] txt = new String[n];
        int cnt, sum;
        for (int i = 0; i < n; i++) {
            sum = cnt = 0;

            txt[i] = br.readLine();
            for (int j = 0; j < txt[i].length(); j++) {
                sum += txt[i].charAt(j) == 'O' ? ++cnt : (cnt = 0);
            }
            bw.write(sum + " \n");
        }
        br.close();
        bw.flush();
        bw.close();
    }

    //4344
    {/*문제
    대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다. 당신은 그들에게 슬픈 진실을 알려줘야 한다.

    입력
    첫째 줄에는 테스트 케이스의 개수 C가 주어진다.

    둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 이어서 N명의 점수가 주어진다. 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.

    출력
    각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.

    예제 입력 1
    5
    5 50 50 70 80 100
    7 100 95 90 80 70 60 50
    3 70 90 80
    3 70 90 81
    9 100 99 98 97 96 95 94 93 91
    예제 출력 1
    40.000%
    57.143%
    33.333%
    66.667%
    55.556%
    */
    }

    public void solution4344() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int cnt;
        int[] list;
        double result;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            list = new int[Integer.parseInt(st.nextToken())];
            cnt = 0;
            for (int j = 0; j < list.length; j++) {
                list[j] = Integer.parseInt(st.nextToken());
            }
            result = Arrays.stream(list).average().getAsDouble();
            for (int j : list) {
                cnt += j > result ? 1 : 0;
            }
            result = (double) cnt / list.length * 100;
            bw.write(String.format("%.3f", result) + "% \n");
        }
        br.close();
        bw.flush();
        bw.close();
    }

    //  5 단계 : 함수 ----------------------------------------------------------
    //15596
    {/*문제
    정수 n개가 주어졌을 때, n개의 합을 구하는 함수를 작성하시오.

    작성해야 하는 함수는 다음과 같다.

    C, C11, C (Clang), C11 (Clang): long long sum(int *a, int n);
    a: 합을 구해야 하는 정수 n개가 저장되어 있는 배열 (0 ≤ a[i] ≤ 1,000,000, 1 ≤ n ≤ 3,000,000)
    n: 합을 구해야 하는 정수의 개수
    리턴값: a에 포함되어 있는 정수 n개의 합
    C++, C++11, C++14, C++17, C++ (Clang), C++11 (Clang), C++14 (Clang), C++17 (Clang): long long sum(std::vector<int> &a);
    a: 합을 구해야 하는 정수 n개가 저장되어 있는 배열 (0 ≤ a[i] ≤ 1,000,000, 1 ≤ n ≤ 3,000,000)
    리턴값: a에 포함되어 있는 정수 n개의 합
    Python 2, Python 3, PyPy, PyPy3: def solve(a: list) -> int
    a: 합을 구해야 하는 정수 n개가 저장되어 있는 리스트 (0 ≤ a[i] ≤ 1,000,000, 1 ≤ n ≤ 3,000,000)
    리턴값: a에 포함되어 있는 정수 n개의 합 (정수)
    Java: long sum(int[] a); (클래스 이름: Test)
    a: 합을 구해야 하는 정수 n개가 저장되어 있는 배열 (0 ≤ a[i] ≤ 1,000,000, 1 ≤ n ≤ 3,000,000)
    리턴값: a에 포함되어 있는 정수 n개의 합
    Go: sum(a []int) int
    a: 합을 구해야 하는 정수 n개가 저장되어 있는 배열 (0 ≤ a[i] ≤ 1,000,000, 1 ≤ n ≤ 3,000,000)
    리턴값: a에 포함되어 있는 정수 n개의 합
    */
    }

    public long solution15596(int[] a) throws IOException {
        long sum = 0;
        for (long i : a) {
            sum += i;
        }
        return sum;
    }

    //4673
    {/*문제
    셀프 넘버는 1949년 인도 수학자 D.R. Kaprekar가 이름 붙였다. 양의 정수 n에 대해서 d(n)을 n과 n의 각 자리수를 더하는 함수라고 정의하자. 예를 들어, d(75) = 75+7+5 = 87이다.

    양의 정수 n이 주어졌을 때, 이 수를 시작해서 n, d(n), d(d(n)), d(d(d(n))), ...과 같은 무한 수열을 만들 수 있다.

    예를 들어, 33으로 시작한다면 다음 수는 33 + 3 + 3 = 39이고, 그 다음 수는 39 + 3 + 9 = 51, 다음 수는 51 + 5 + 1 = 57이다. 이런식으로 다음과 같은 수열을 만들 수 있다.

    33, 39, 51, 57, 69, 84, 96, 111, 114, 120, 123, 129, 141, ...

    n을 d(n)의 생성자라고 한다. 위의 수열에서 33은 39의 생성자이고, 39는 51의 생성자, 51은 57의 생성자이다. 생성자가 한 개보다 많은 경우도 있다. 예를 들어, 101은 생성자가 2개(91과 100) 있다.

    생성자가 없는 숫자를 셀프 넘버라고 한다. 100보다 작은 셀프 넘버는 총 13개가 있다. 1, 3, 5, 7, 9, 20, 31, 42, 53, 64, 75, 86, 97

    10000보다 작거나 같은 셀프 넘버를 한 줄에 하나씩 출력하는 프로그램을 작성하시오.

    입력
    입력은 없다.

    출력
    10,000보다 작거나 같은 셀프 넘버를 한 줄에 하나씩 증가하는 순서로 출력한다.

    예제 입력 1
    예제 출력 1
    1
    3
    5
    7
    9
    20
    31
    42
    53
    64
     |
     |       <-- a lot more numbers
     |
    9903
    9914
    9925
    9927
    9938
    9949
    9960
    9971
    9982
    9993
    */
    }

    public void solution4673() throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean[] check = new boolean[10001];

        for (int i = 1; i < 10001; i++) {
            int n = solution4673_sub(i);
            if (n < 10001) {
                check[n] = true;
            }
        }
        for (int i = 1; i < 10001; i++) {
            if (!check[i]) {
                bw.write(i + "\n");
            }
        }
        bw.flush();
        bw.close();

    }

    public int solution4673_sub(int num) throws IOException {
        int sum = num;
        while (num != 0) {
            sum = sum + (num % 10);
            num = num / 10;
        }
        return sum;
    }

    //1065
    {/*문제
    어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다. 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오.

    입력
    첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.

    출력
    첫째 줄에 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력한다.

    예제 입력 1
    110
    예제 출력 1
    99
    예제 입력 2
    1
    예제 출력 2
    1
    예제 입력 3
    210
    예제 출력 3
    105
    예제 입력 4
    1000
    예제 출력 4
    144
    예제 입력 5
    500
    예제 출력 5
    119
    */
    }

    public void solution1065() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(solution1065_sub1(Integer.parseInt(br.readLine())) + "\n");
        br.close();
        bw.flush();
        bw.close();

    }

    public int solution1065_sub1(int num) throws IOException {
        if (num < 100) {
            return num;
        } else {
            int cnt = 99;
            if (num == 1000) {
                num = 999;
            }

            for (int i = 100; i <= num; i++) {
                int hun = i / 100;
                int ten = (i / 10) % 10;
                int one = i % 10;

                if ((hun - ten) == (ten - one)) {
                    cnt++;
                }
            }
            return cnt;
        }
    }

    //  6 단계 : 문자열 ----------------------------------------------------------
    //11654
    {/*문제
    알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.

    입력
    알파벳 소문자, 대문자, 숫자 0-9 중 하나가 첫째 줄에 주어진다.

    출력
    입력으로 주어진 글자의 아스키 코드 값을 출력한다.

    예제 입력 1
    A
    예제 출력 1
    65
    예제 입력 2
    C
    예제 출력 2
    67
    예제 입력 3
    0
    예제 출력 3
    48
    예제 입력 4
    9
    예제 출력 4
    57
    예제 입력 5
    a
    예제 출력 5
    97
    예제 입력 6
    z
    예제 출력 6
    122
    */
    }

    public void solution11654() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int ask = br.readLine().charAt(0);
        bw.write(ask + "");
        br.close();
        bw.flush();
        bw.close();
    }

    //11720
    {/*문제
    N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.

    입력
    첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.

    출력
    입력으로 주어진 숫자 N개의 합을 출력한다.

    예제 입력 1
    1
    1
    예제 출력 1
    1
    예제 입력 2
    5
    54321
    예제 출력 2
    15
    예제 입력 3
    25
    7000000000000000000000000
    예제 출력 3
    7
    예제 입력 4
    11
    10987654321
    예제 출력 4
    46
    */
    }

    public void solution11720() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += str.charAt(i) - '0';
        }
        bw.write(sum + "");
        br.close();
        bw.flush();
        bw.close();
    }

    //10809
    {/*문제
    알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.

    입력
    첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.

    출력
    각각의 알파벳에 대해서, a가 처음 등장하는 위치, b가 처음 등장하는 위치, ... z가 처음 등장하는 위치를 공백으로 구분해서 출력한다.

    만약, 어떤 알파벳이 단어에 포함되어 있지 않다면 -1을 출력한다. 단어의 첫 번째 글자는 0번째 위치이고, 두 번째 글자는 1번째 위치이다.

    예제 입력 1
    baekjoon
    예제 출력 1
    1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 -1 7 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1
    */
    }

    public void solution10809() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        int[] list = new int[26];
        for (int i = 0; i < str.length(); i++) {
            list[str.charAt(i) - 'a'] = list[str.charAt(i) - 'a'] == 0 ? i + 1 : list[str.charAt(i) - 97];
        }
        for (int i : list) {
            bw.write(i == 0 ? -1 + " " : i - 1 + " ");
        }
        br.close();
        bw.flush();
        bw.close();
    }

    //2675
    {/*문제
    문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오. 즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다. S에는 QR Code "alphanumeric" 문자만 들어있다.

    QR Code "alphanumeric" 문자는 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: 이다.

    입력
    첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)가 주어진다. 각 테스트 케이스는 반복 횟수 R(1 ≤ R ≤ 8), 문자열 S가 공백으로 구분되어 주어진다. S의 길이는 적어도 1이며, 20글자를 넘지 않는다.

    출력
    각 테스트 케이스에 대해 P를 출력한다.

    예제 입력 1
    2
    3 ABC
    5 /HTP
    예제 출력 1
    AAABBBCCC
    /////HHHHHTTTTTPPPPP
    */
    }

    public void solution2675() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        String str;
        int num;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            num = Integer.parseInt(st.nextToken());
            str = st.nextToken();
            for (int j = 0; j < str.length(); j++) {
                for (int k = 0; k < num; k++) {
                    bw.write(str.charAt(j) + "");
                }
            }
            bw.write("\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }

    //1157
    {/*문제
    알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.

    입력
    첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.

    출력
    첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.

    예제 입력 1
    Mississipi
    예제 출력 1
    ?
    예제 입력 2
    zZa
    예제 출력 2
    Z
    예제 입력 3
    z
    예제 출력 3
    Z
    예제 입력 4
    baaa
    예제 출력 4
    A
    */
    }

    public void solution1157() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine().toLowerCase();
        int[] list = new int['z' - 'a' + 1];
        for (int i = 0; i < str.length(); i++) {
            list[str.charAt(i) - 'a']++;
        }
        int max = -1;
        char c = '?';
        for (int i = 0; i < list.length; i++) {
            if (list[i] > max) {
                max = list[i];
                c = (char) (i + 65);
            } else if (list[i] == max) {
                c = '?';
            }
        }
        bw.write(c + "");
        br.close();
        bw.flush();
        bw.close();
    }

    //1152
    {/*문제
    영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 이 문자열에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오. 단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.

    입력
    첫 줄에 영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 이 문자열의 길이는 1,000,000을 넘지 않는다. 단어는 공백 한 개로 구분되며, 공백이 연속해서 나오는 경우는 없다. 또한 문자열은 공백으로 시작하거나 끝날 수 있다.

    출력
    첫째 줄에 단어의 개수를 출력한다.

    예제 입력 1
    The Curious Case of Benjamin Button
    예제 출력 1
    6
    예제 입력 2
     The first character is a blank
    예제 출력 2
    6
    예제 입력 3
    The last character is a blank
    예제 출력 3
    6
    */
    }

    public void solution1152() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        bw.write(st.countTokens() + "");
        br.close();
        bw.flush();
        bw.close();
    }

    //2908
    {/*문제
    상근이의 동생 상수는 수학을 정말 못한다. 상수는 숫자를 읽는데 문제가 있다. 이렇게 수학을 못하는 상수를 위해서 상근이는 수의 크기를 비교하는 문제를 내주었다. 상근이는 세 자리 수 두 개를 칠판에 써주었다. 그 다음에 크기가 큰 수를 말해보라고 했다.

    상수는 수를 다른 사람과 다르게 거꾸로 읽는다. 예를 들어, 734와 893을 칠판에 적었다면, 상수는 이 수를 437과 398로 읽는다. 따라서, 상수는 두 수중 큰 수인 437을 큰 수라고 말할 것이다.

    두 수가 주어졌을 때, 상수의 대답을 출력하는 프로그램을 작성하시오.

    입력
    첫째 줄에 상근이가 칠판에 적은 두 수 A와 B가 주어진다. 두 수는 같지 않은 세 자리 수이며, 0이 포함되어 있지 않다.

    출력
    첫째 줄에 상수의 대답을 출력한다.

    예제 입력 1
    734 893
    예제 출력 1
    437
    예제 입력 2
    221 231
    예제 출력 2
    132
    예제 입력 3
    839 237
    예제 출력 3
    938
    */
    }

    public void solution2908() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] num = new int[2];
        num[0] = Integer.parseInt(st.nextToken());
        num[0] = num[0] % 10 * 100 + num[0] % 100 / 10 * 10 + num[0] / 100;
        num[1] = Integer.parseInt(st.nextToken());
        num[1] = num[1] % 10 * 100 + num[1] % 100 / 10 * 10 + num[1] / 100;
        bw.write((num[0] > num[1] ? num[0] : num[1]) + "");
        br.close();
        bw.flush();
        bw.close();
    }

    //5622
    {/*문제
    상근이의 할머니는 아래 그림과 같이 오래된 다이얼 전화기를 사용한다.

    전화를 걸고 싶은 번호가 있다면, 숫자를 하나를 누른 다음에 금속 핀이 있는 곳 까지 시계방향으로 돌려야 한다. 숫자를 하나 누르면 다이얼이 처음 위치로 돌아가고, 다음 숫자를 누르려면 다이얼을 처음 위치에서 다시 돌려야 한다.

    숫자 1을 걸려면 총 2초가 필요하다. 1보다 큰 수를 거는데 걸리는 시간은 이보다 더 걸리며, 한 칸 옆에 있는 숫자를 걸기 위해선 1초씩 더 걸린다.

    상근이의 할머니는 전화 번호를 각 숫자에 해당하는 문자로 외운다. 즉, 어떤 단어를 걸 때, 각 알파벳에 해당하는 숫자를 걸면 된다. 예를 들어, UNUCIC는 868242와 같다.

    할머니가 외운 단어가 주어졌을 때, 이 전화를 걸기 위해서 필요한 최소 시간을 구하는 프로그램을 작성하시오.

    입력
    첫째 줄에 알파벳 대문자로 이루어진 단어가 주어진다. 단어의 길이는 2보다 크거나 같고, 15보다 작거나 같다.

    출력
    첫째 줄에 다이얼을 걸기 위해서 필요한 최소 시간을 출력한다.

    예제 입력 1
    WA
    예제 출력 1
    13
    예제 입력 2
    UNUCIC
    예제 출력 2
    36
    */
    }

    public void solution5622() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'C') {
                sum += 3;
            } else if (str.charAt(i) >= 'D' && str.charAt(i) <= 'F') {
                sum += 4;
            } else if (str.charAt(i) >= 'G' && str.charAt(i) <= 'I') {
                sum += 5;
            } else if (str.charAt(i) >= 'J' && str.charAt(i) <= 'L') {
                sum += 6;
            } else if (str.charAt(i) >= 'M' && str.charAt(i) <= 'O') {
                sum += 7;
            } else if (str.charAt(i) >= 'P' && str.charAt(i) <= 'S') {
                sum += 8;
            } else if (str.charAt(i) >= 'T' && str.charAt(i) <= 'V') {
                sum += 9;
            } else if (str.charAt(i) >= 'W' && str.charAt(i) <= 'Z') {
                sum += 10;
            }
        }
        bw.write(sum + "");
        br.close();
        bw.flush();
        bw.close();
    }

    //2941
    {/*문제
    예전에는 운영체제에서 크로아티아 알파벳을 입력할 수가 없었다. 따라서, 다음과 같이 크로아티아 알파벳을 변경해서 입력했다.

    크로아티아 알파벳	변경
    č	c=
    ć	c-
    dž	dz=
    đ	d-
    lj	lj
    nj	nj
    š	s=
    ž	z=
    예를 들어, ljes=njak은 크로아티아 알파벳 6개(lj, e, š, nj, a, k)로 이루어져 있다. 단어가 주어졌을 때, 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.

    dž는 무조건 하나의 알파벳으로 쓰이고, d와 ž가 분리된 것으로 보지 않는다. lj와 nj도 마찬가지이다. 위 목록에 없는 알파벳은 한 글자씩 센다.

    입력
    첫째 줄에 최대 100글자의 단어가 주어진다. 알파벳 소문자와 '-', '='로만 이루어져 있다.

    단어는 크로아티아 알파벳으로 이루어져 있다. 문제 설명의 표에 나와있는 알파벳은 변경된 형태로 입력된다.

    출력
    입력으로 주어진 단어가 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.

    예제 입력 1
    ljes=njak
    예제 출력 1
    6
    예제 입력 2
    ddz=z=
    예제 출력 2
    3
    예제 입력 3
    nljj
    예제 출력 3
    3
    예제 입력 4
    c=c=
    예제 출력 4
    2
    예제 입력 5
    dz=ak
    예제 출력 5
    3
    */
    }

    public void solution2941() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        int cnt = 0;
        char c;
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            if (c == 'c' && i < str.length() - 1) {
                if (str.charAt(i + 1) == '=') {
                    i++;
                } else if (str.charAt(i + 1) == '-') {
                    i++;
                }
            } else if (c == 'd' && i < str.length() - 1) {
                if (str.charAt(i + 1) == 'z' && i < str.length() - 2 && str.charAt(i + 2) == '=') {
                    i += 2;
                } else if (str.charAt(i + 1) == '-') {
                    i++;
                }
            } else if (c == 'l' && i < str.length() - 1 && str.charAt(i + 1) == 'j') {
                i++;
            } else if (c == 'n' && i < str.length() - 1 && str.charAt(i + 1) == 'j') {
                i++;
            } else if (c == 's' && i < str.length() - 1 && str.charAt(i + 1) == '=') {
                i++;
            } else if (c == 'z' && i < str.length() - 1 && str.charAt(i + 1) == '=') {
                i++;
            }
            cnt++;
        }
        bw.write(cnt + "");
        br.close();
        bw.flush();
        bw.close();
    }

    //1316
    {/*문제
    그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다. 예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만, aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.

    단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.

    입력
    첫째 줄에 단어의 개수 N이 들어온다. N은 100보다 작거나 같은 자연수이다. 둘째 줄부터 N개의 줄에 단어가 들어온다. 단어는 알파벳 소문자로만 되어있고 중복되지 않으며, 길이는 최대 100이다.

    출력
    첫째 줄에 그룹 단어의 개수를 출력한다.

    예제 입력 1
    3
    happy
    new
    year
    예제 출력 1
    3
    예제 입력 2
    4
    aba
    abab
    abcabc
    a
    예제 출력 2
    1
    예제 입력 3
    5
    ab
    aa
    aca
    ba
    bb
    예제 출력 3
    4
    예제 입력 4
    2
    yzyzy
    zyzyz
    예제 출력 4
    0
    예제 입력 5
    1
    z
    예제 출력 5
    1
    */
    }

    public void solution1316() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int chk = 0;
        String str;
        ArrayList<Character> arr;
        Boolean test;
        for (int i = 0; i < N; i++) {
            str = br.readLine();
            arr = new ArrayList<>();
            test = true;
            arr.add(str.charAt(0));
            for (int j = 0; j < str.length() - 1; j++) {
                if (str.charAt(j) != str.charAt(j + 1)) {
                    if (arr.contains(str.charAt(j + 1))) {
                        test = false;
                        break;
                    }
                    arr.add(str.charAt(j + 1));
                }
            }
            if (test) {
                chk++;
            }
        }
        bw.write(chk + "");
        br.close();
        bw.flush();
        bw.close();
    }

    //  7 단계 : 기본 수학 1 ----------------------------------------------------------
    //1712
    {/*문제
    월드전자는 노트북을 제조하고 판매하는 회사이다. 노트북 판매 대수에 상관없이 매년 임대료, 재산세, 보험료, 급여 등 A만원의 고정 비용이 들며, 한 대의 노트북을 생산하는 데에는 재료비와 인건비 등 총 B만원의 가변 비용이 든다고 한다.

    예를 들어 A=1,000, B=70이라고 하자. 이 경우 노트북을 한 대 생산하는 데는 총 1,070만원이 들며, 열 대 생산하는 데는 총 1,700만원이 든다.

    노트북 가격이 C만원으로 책정되었다고 한다. 일반적으로 생산 대수를 늘려 가다 보면 어느 순간 총 수입(판매비용)이 총 비용(=고정비용+가변비용)보다 많아지게 된다. 최초로 총 수입이 총 비용보다 많아져 이익이 발생하는 지점을 손익분기점(BREAK-EVEN POINT)이라고 한다.

    A, B, C가 주어졌을 때, 손익분기점을 구하는 프로그램을 작성하시오.

    입력
    첫째 줄에 A, B, C가 빈 칸을 사이에 두고 순서대로 주어진다. A, B, C는 21억 이하의 자연수이다.

    출력
    첫 번째 줄에 손익분기점 즉 최초로 이익이 발생하는 판매량을 출력한다. 손익분기점이 존재하지 않으면 -1을 출력한다.

    예제 입력 1
    1000 70 170
    예제 출력 1
    11
    예제 입력 2
    3 2 1
    예제 출력 2
    -1
    예제 입력 3
    2100000000 9 10
    예제 출력 3
    2100000001
    */
    }

    public void solution1712() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A, B, C;
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        int i = 0;
        if (B >= C) {
            i = -1;
        } else {
            i = A / (C - B) + 1;
        }
        bw.write(i + "");
        br.close();
        bw.flush();
        bw.close();
    }

    //2292
    {/*문제
    문제

    위의 그림과 같이 육각형으로 이루어진 벌집이 있다. 그림에서 보는 바와 같이 중앙의 방 1부터 시작해서 이웃하는 방에 돌아가면서 1씩 증가하는 번호를 주소로 매길 수 있다. 숫자 N이 주어졌을 때, 벌집의 중앙 1에서 N번 방까지 최소 개수의 방을 지나서 갈 때 몇 개의 방을 지나가는지(시작과 끝을 포함하여)를 계산하는 프로그램을 작성하시오. 예를 들면, 13까지는 3개, 58까지는 5개를 지난다.

    입력
    첫째 줄에 N(1 ≤ N ≤ 1,000,000,000)이 주어진다.

    출력
    입력으로 주어진 방까지 최소 개수의 방을 지나서 갈 때 몇 개의 방을 지나는지 출력한다.

    예제 입력 1
    13
    예제 출력 1
    3
    */
    }
    // 1 7 19 37 61
    // 1 6 12 18 24

    public void solution2292() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine()) - 1;
        int N_save;
        int i = 0;
        if (N % 6 == 0) {
            N_save = N / 6;
        } else {
            N_save = N / 6 + 1;
        }
        while (true) {
            N_save -= i;
            if (N_save <= 0) {
                break;
            }
            i++;
        }
        bw.write(i + 1 + "");
        br.close();
        bw.flush();
        bw.close();
    }

    //1193
    {/*문제
    무한히 큰 배열에 다음과 같이 분수들이 적혀있다.

    1/1	1/2	1/3	1/4	1/5	…
    2/1	2/2	2/3	2/4	…	…
    3/1	3/2	3/3	…	…	…
    4/1	4/2	…	…	…	…
    5/1	…	…	…	…	…
    …	…	…	…	…	…
    이와 같이 나열된 분수들을 1/1 → 1/2 → 2/1 → 3/1 → 2/2 → … 과 같은 지그재그 순서로 차례대로 1번, 2번, 3번, 4번, 5번, … 분수라고 하자.

    X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오.

    입력
    첫째 줄에 X(1 ≤ X ≤ 10,000,000)가 주어진다.

    출력
    첫째 줄에 분수를 출력한다.

    예제 입력 1
    1
    예제 출력 1
    1/1
    예제 입력 2
    2
    예제 출력 2
    1/2
    예제 입력 3
    3
    예제 출력 3
    2/1
    예제 입력 4
    4
    예제 출력 4
    3/1
    예제 입력 5
    5
    예제 출력 5
    2/2
    예제 입력 6
    6
    예제 출력 6
    1/3
    예제 입력 7
    7
    예제 출력 7
    1/4
    예제 입력 8
    8
    예제 출력 8
    2/3
    예제 입력 9
    9
    예제 출력 9
    3/2
    예제 입력 10
    14
    예제 출력 10
    2/4
    */
    }
    // 1:1 - 1번 sum:2 i,j
    // 1:2 2:1 - 2번 sum:3 i,j
    // 3:1 2:2 1:3

    public void solution1193() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int i = 1;
        while (true) {
            N -= i;
            if (N <= 0) {
                break;
            }
            i++;
        }
        if (i % 2 == 1) {
            bw.write((1 - N) + "/" + (i + N));
        } else {
            bw.write((i + N) + "/" + (1 - N));
        }
        br.close();
        bw.flush();
        bw.close();
    }
}