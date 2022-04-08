package com.potatomeme;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

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
    // ----------------------------------------------------------
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
}
