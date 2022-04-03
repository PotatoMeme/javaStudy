package com.company.codeup100;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class CodeUp {
    public void fun001() {
        //Hello
        //출력하기
        System.out.println("Hello");
    }

    public void fun002() {
        //Hello World
        //출력하기
        System.out.println("Hello World");
    }

    public void fun003() {
        //Hello
        //World
        //(두 줄에 걸쳐 줄을 바꿔 출력하기)
        System.out.println("Hello\nWorld");
    }

    public void fun004() {
        //'Hello'
        //(단, 작은 따옴표도 함께 출력한다.)
        System.out.println("\'Hello World\'");
    }

    public void fun005() {
        //"Hello World"
        //(단, 큰따옴표도 함께 출력한다.)
        System.out.println("\"Hello World\"");
    }

    public void fun006() {
        //"!@#$%^&*()"
        //(단, 큰따옴표도 함께 출력한다.)
        System.out.println("\"!@#$%^&*()\"");
    }

    public void fun007() {
        //"C:\Download\hello.cpp"
        //(단, 큰따옴표도 함께 출력한다.)
        System.out.println("\"C:\\Download\\hello.cpp\"");
    }

    public void fun008() {
        //┌┬┐
        //├┼┤
        //└┴┘
        //출력하기
        System.out.println("┌┬┐\n" + "├┼┤\n" + "└┴┘");
    }

    public void fun009() {
        //문자 1개가 입력라고 출력
        //입력된 문자를 그대로 출력한다.
        Scanner in = new Scanner(System.in);
        System.out.println(in.next());
    }

    public void fun010() {
        //정수형(int)으로 변수를 선언하고, 변수에 정수값을 저장한 후
        //변수에 저장되어 있는 값을 그대로 출력해보자.
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(num);
    }

    public void fun011() {
        //문자형(char)으로 변수를 하나 선언하고, 변수에 문자를 저장한 후
        //변수에 저장되어 있는 문자를 그대로 출력해보자.
        Scanner in = new Scanner(System.in);
        String a = in.next();
        System.out.println(a);
    }

    public void fun012() {
        //실수형(float)로 변수를 선언하고 그 변수에
        // 실수값을 저장한 후 저장되어 있는 실수값을 출력해보자.
        Scanner in = new Scanner(System.in);
        float num = in.nextFloat();
        System.out.println(num);
    }

    public void fun013() {
        //정수(int) 2개를 입력받아 그대로 출력해보자. (단, 띄어쓰기를 기준으로 입력한다.)
        //입력 : 1 5
        //출력 : 1 5
        Scanner in = new Scanner(System.in);
        int[] num = new int[2];
        num[0] = in.nextInt();
        num[1] = in.nextInt();
        System.out.println(num[0] + " " + num[1]);
    }

    public void fun014() {
        //2개의 문자(ASCII CODE)를 입력받아서 순서를 바꿔 출력해보자.
        Scanner in = new Scanner(System.in);
        String a, b;
        a = in.next();
        b = in.next();
        System.out.println(b + " " + a);
    }

    public void fun015() {
        //실수(float) 1개를 입력받아 저장한 후, 저장되어 있는 값을 소수점
        // 셋 째 자리에서 반올림하여 소수점 이하 둘 째 자리까지 출력하시오.
        Scanner in = new Scanner(System.in);
        float num = in.nextFloat();
        System.out.println(String.format("%.2f", num));
    }

    public void fun016() {
        //int형 정수 1개를 입력받아 공백을 사이에 두고 3번 출력해보자.
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(num + " " + num + " " + num);
    }

    public void fun017() {
        //어떤 형식에 맞추어 시간이 입력될 때, 그대로 출력하는 연습을 해보자.
        //콜론(:) 기호를 기준으로 두 수가 각 변수에 저장된다.
        //입력 : 3:15
        //출력 : 3:15
        Scanner in = new Scanner(System.in);
        String a = in.next();
        System.out.println(a);
    }

    public void fun018() {
        //년, 월, 일을 입력받아 지정된 형식으로 출력하는 연습을 해보자.
        //
        //입력
        //연, 월, 일이 ".(닷)"으로 구분되어 입력된다.
        //출력
        //입력받은 연, 월, 일을 yyyy.mm.dd 형식으로 출력한다.
        //
        //입력 : 2020.2.9
        //출력 : 2020.02.09
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String[] b = a.split("\\.");
        System.out.println(String.format("%s.%02d.%02d", b[0],
                Integer.parseInt(b[1]), Integer.parseInt(b[2])));
    }

    public void fun019() {
        //주민번호는 다음과 같이 구성된다.
        //
        //XXXXXX-XXXXXXX
        //
        //앞의 6자리는 생년월일(yymmdd)이고 뒤 7자리는 성별, 지역, 오류검출코드이다.
        //주민번호를 입력받아 형태를 바꿔 출력해보자.
        //
        //입력
        //주민번호 앞 6자리와 뒷 7자리가 '-'로 구분되어 입력된다. (입력값은 가상의 주민번호이다.) ex)110011-0000000
        //출력
        //'-'를 제외한 주민번호 13자리를 모두 붙여 출력한다.
        //
        //입력 : 000907-1121112
        //출력 : 0009071121112
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String[] b = a.split("-");
        System.out.println(b[0] + "-" + b[1]);
    }

    public void fun020() {
        //1개의 문자열을 입력받아 그대로 출력해보자.
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        System.out.println(a);
    }

    public void fun022() {
        //공백이 포함되어 있는 한 문장이 입력된다.
        // 단, 입력되는 문장은 여러 개의 단어로 구성되고, 엔터로 끝난다.
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        System.out.println(a);
    }

    public void fun023() {
        //실수 1개를 입력받아 정수 부분과 실수 부분으로 나누어 출력한다.
        //입력 :
        //1.435867
        //
        //출력 :
        //1
        //435867
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String[] b = a.split("\\.");
        System.out.println(b[0]);
        System.out.println(b[1]);
    }

    public void fun024() {
        //단어를 1개 입력받는다.
        //입력받은 단어(영어)의 각 문자를 한줄에 한 문자씩 분리해 출력한다.
        //(단, 단어의 문자(영어)를 하나씩 나누어 한 줄에 한 개씩 ' '로 묶어서 출력한다.)
        //
        //입력 :
        //'Boy'
        //
        //출력 :
        //'B'
        //'o'
        //'y'
        Scanner in = new Scanner(System.in);
        String a = in.next();
        /*for(char j: a.toCharArray()){
            System.out.println("'"+j+"'");
        }*/ //가능
        for (int i = 0; i < a.length(); i++) {
            System.out.println("'" + a.charAt(i) + "'");
        }
    }

    public void fun025() {
        //다섯 자리의 정수 1개를 입력받아 각 자리별로 나누어 출력한다.
        //
        //입력 :
        //75254
        //
        //출력 :
        //[70000]
        //[5000]
        //[200]
        //[50]
        //[4]
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println("[" + (a % 100000 / 10000) * 10000 + "]");
        System.out.println("[" + (a % 10000 / 1000) * 1000 + "]");
        System.out.println("[" + (a % 1000 / 100) * 100 + "]");
        System.out.println("[" + (a % 100 / 10) * 10 + "]");
        System.out.println("[" + (a % 10 / 1) * 1 + "]");
    }

    public void fun026() {
        //입력되는 시:분:초 에서 분만 출력해보자.
        //17:24:55
        //24
        Scanner in = new Scanner(System.in);
        String a = in.next().split(":")[1];
        System.out.println(a);
    }

    public void fun027() {
        //년월일을 출력하는 방법은 나라마다, 형식마다 조금씩 다르다.
        //
        //년월일(yyyy.mm.dd)를 입력받아,
        //
        //일월년(dd-mm-yyyy)로 출력해보자.
        //
        //(단, 한 자리 일/월은 0을 붙여 두자리로 출력한다.)
        //2020.2.11
        //11-02-2020
        Scanner in = new Scanner(System.in);
        String[] a = in.next().split("\\.");
        System.out.println(String.format("%02d-%02d-%s",
                Integer.parseInt(a[2]), Integer.parseInt(a[1]), a[0]));
    }

    public void fun028() {
        //정수 1개를 입력받아 그대로 출력해보자.
        Scanner in = new Scanner(System.in);
        System.out.println(in.nextInt());
    }

    public void fun029() {
        //실수 1개를 입력받아 그대로 출력해보자.
        Scanner in = new Scanner(System.in);
        System.out.println(in.nextFloat());
    }

    public void fun030() {
        //정수 1개를 입력받아 그대로 출력해보자.
        Scanner in = new Scanner(System.in);
        System.out.println(in.nextInt());
    }

    public void fun031() {
        //10진수를 입력받아 8진수(octal)로 출력해보자.
        Scanner in = new Scanner(System.in);
        System.out.println(String.format("%o", in.nextInt()));
    }

    public void fun032() {
        //10진수를 입력받아 16진수(hexadecimal)로 출력해보자.
        Scanner in = new Scanner(System.in);
        System.out.println(String.format("%x", in.nextInt()));
    }

    public void fun033() {
        //10진수를 입력받아 16진수(hexadecimal)로 출력해보자.
        //16진수(대문자)로 출력한다.
        Scanner in = new Scanner(System.in);
        System.out.println(String.format("%X", in.nextInt()));
    }

    public void fun034() {
        //8진수로 입력된 정수 1개를 10진수로 바꾸어 출력해보자.
        Scanner in = new Scanner(System.in);
        System.out.println(in.nextInt(8));
    }

    public void fun035() {
        //16진수로 입력된 정수 1개를 8진수로 바꾸어 출력해보자.
        Scanner in = new Scanner(System.in);
        System.out.println(String.format("%o", in.nextInt(16)));
    }

    public void fun036() {
        //영문자 1개를 입력받아 아스키 코드표의 10진수 값으로 출력해보자.
        Scanner in = new Scanner(System.in);
        //int num = in.next().charAt(0);
        System.out.println((int) in.next().charAt(0));
    }

    public void fun037() {
        //10진 정수 1개를 입력받아 아스키 문자로 출력해보자.
        Scanner in = new Scanner(System.in);
        //char a = (char)in.nextInt();
        System.out.println(String.format("%c", in.nextInt()));
    }

    public void fun038() {
        //정수 2개를 입력받아 합을 출력하는 프로그램을 작성해보자.
        Scanner in = new Scanner(System.in);
        System.out.println(in.nextInt() + in.nextInt());
    }

    public void fun039() {
        //정수 2개를 입력받아 합을 출력하는 프로그램을 작성해보자.
        Scanner in = new Scanner(System.in);
        System.out.println(in.nextInt() + in.nextInt());
    }

    public void fun040() {
        //입력된 정수의 부호를 바꿔 출력해보자.
        Scanner in = new Scanner(System.in);
        System.out.println(in.nextInt() * -1);
    }

    public void fun041() {
        //영문자 1개를 입력받아 그 다음 문자를 출력해보자.
        //
        //영문자 'A'의 다음 문자는 'B'이고, 영문자 '0'의 다음 문자는 '1'이다.
        Scanner in = new Scanner(System.in);
        System.out.println(String.format("%c", in.next().charAt(0) + 1));
    }

    public void fun042() {
        //정수 2개(a, b) 를 입력받아 a를 b로 나눈 몫을 출력해보자.
        Scanner in = new Scanner(System.in);
        System.out.println(in.nextInt() / in.nextInt());
    }

    public void fun043() {
        //정수 2개(a, b) 를 입력받아 a를 b로 나눈 나머지를 출력해보자.
        Scanner in = new Scanner(System.in);
        System.out.println(in.nextInt() % in.nextInt());
    }

    public void fun044() {
        //정수를 1개 입력받아 1만큼 더해 출력해보자.
        Scanner in = new Scanner(System.in);
        System.out.println(in.nextInt() + 1);
    }

    public void fun045() {
        //정수 2개(a, b)를 입력받아 합, 차, 곱, 몫, 나머지, 나눈 값을 자동으로 계산해보자.
        //11 7
        //18
        //4
        //77
        //1
        //4
        //1.57
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(a + b + "\n" + (a - b) + "\n" + a * b
                + "\n" + a / b + "\n" + a % b + "\n" + (float) a / b);
    }

    public void fun046() {
        //정수 3개를 입력받아 합과 평균을 출력해보자.
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.println(String.format("%d\n%.1f",
                a + b + c, a + b + c / (float) 3));
    }

    public void fun047() {
        //정수 1개를 입력받아 2배 곱해 출력해보자.
        Scanner in = new Scanner(System.in);
        System.out.println(in.nextInt() * 2);
    }

    public void fun048() {
        //정수 2개(a, b)를 입력받아 a를 2(b 제곱)배
        // 곱한 값으로 출력해보자. ( a * 2(b 제곱) )
        Scanner in = new Scanner(System.in);
        System.out.println(in.nextInt() << in.nextInt());
    }

    public void fun049() {
        //두 정수(a, b)를 입력받아 a가 b보다 크면 1을, a가 b보다
        //작거나 같으면 0을 출력하는 프로그램을 작성해보자.
        Scanner in = new Scanner(System.in);
        System.out.println(in.nextInt() > in.nextInt() ? 1 : 0);
    }

    public void fun050() {
        //두 정수(a, b)를 입력받아 a와 b가 같으면 1을,
        //같지 않으면 0을 출력하는 프로그램을 작성해보자.
        Scanner in = new Scanner(System.in);
        System.out.println(in.nextInt() == in.nextInt() ? 1 : 0);
    }

    public void fun051() {
        //두 정수(a, b)를 입력받아 b가 a보다 크거나 같으면 1을,
        //그렇지 않으면 0을 출력하는 프로그램을 작성해보자.
        Scanner in = new Scanner(System.in);
        System.out.println(in.nextInt() <= in.nextInt() ? 1 : 0);
    }

    public void fun052() {
        //두 정수(a, b)를 입력받아 a와 b가 서로 다르면 1을,
        //그렇지 않으면 0을 출력하는 프로그램을 작성해보자.
        Scanner in = new Scanner(System.in);
        System.out.println(in.nextInt() != in.nextInt() ? 1 : 0);
    }

    public void fun053() {
        //1(true, 참) 또는 0(false, 거짓) 이 입력되었을 때
        //반대로 출력하는 프로그램을 작성해보자.
        Scanner in = new Scanner(System.in);
        System.out.println(in.nextInt() == 0 ? 1 : 0);
    }

    public void fun054() {
        //두 개의 참(1) 또는 거짓(0)이 입력될 때, 모두 참일
        //때에만 참을 출력하는 프로그램을 작성해보자.
        Scanner in = new Scanner(System.in);
        System.out.println(in.nextInt() == 1 && in.nextInt() == 1 ? 1 : 0);
    }

    public void fun055() {
        //두 개의 참(1) 또는 거짓(0)이 입력될 때,
        // 하나라도 참이면 참을 출력하는 프로그램을 작성해보자.
        Scanner in = new Scanner(System.in);
        System.out.println(in.nextInt() == 1 || in.nextInt() == 1 ? 1 : 0);
    }

    public void fun055_bonus() {
        //1개의 정수형 입력이 들어오면 논리 연산을 이용하여
        // '홀수'와 '짝수'를 판별하여라
        Scanner in = new Scanner(System.in);
        System.out.println(in.nextInt() % 2 == 1 ? "홀수" : "짝수");
    }

    public void fun056() {
        //두 가지의 참(1) 또는 거짓(0)이 입력될 때, 참/거짓이
        // 서로 다를 때에만 참을 출력하는 프로그램을 작성해보자.
        Scanner in = new Scanner(System.in);
        boolean a = in.nextInt() == 1;
        boolean b = in.nextInt() == 1;
        System.out.println((!a && b) || (a && !b) ? true : false);
    }

    public void fun057() {
        //두 개의 참(1) 또는 거짓(0)이 입력될 때, 참/거짓이 서로 같을
        // 때에만 참이 계산되는 프로그램을 작성해보자.
        Scanner in = new Scanner(System.in);
        boolean a = in.nextInt() == 1;
        boolean b = in.nextInt() == 1;
        System.out.println((a && b) || (!a && !b) ? true : false);
    }

    public void fun058() {
        //두 개의 참(1) 또는 거짓(0)이 입력될 때, 모두 거짓일 때에만
        //참이 계산되는 프로그램을 작성해보자.
        Scanner in = new Scanner(System.in);
        boolean a = in.nextInt() == 1;
        boolean b = in.nextInt() == 1;
        System.out.println(!a && !b ? true : false);
    }

    public void fun059() {
        //입력 된 정수를 비트단위로 참/거짓을 바꾼 후 정수로 출력해보자.
        //
        //예를 들어 1이 입력되었을 때 저장되는
        //1을 32비트 2진수로 표현하면 00000000 00000000 00000000 00000001 이고,
        //~1은 11111111 11111111 11111111 11111110 가 되는데 이는 -2를 의미한다.
        Scanner in = new Scanner(System.in);
        System.out.println(~in.nextInt());
    }

    public void fun060() {
        //입력된 정수 두 개를 비트단위로 and 연산한 후 그 결과를 정수로 출력해보자.
        //
        //예를 들어 3과 5가 입력되었을 때를 살펴보면
        //3 : 00000000 00000000 00000000 00000011
        //5 : 00000000 00000000 00000000 00000101
        //3 & 5 : 00000000 00000000 00000000 00000001
        //3 5
        //1
        Scanner in = new Scanner(System.in);
        System.out.println(in.nextInt() & in.nextInt());
    }

    public void fun061() {
        //입력된 정수 두 개를 비트단위로 or 연산한 후 그 결과를 정수로 출력해보자.
        //
        //예를 들어 3과 5가 입력되었을 때를 살펴보면
        //3 : 00000000 00000000 00000000 00000011
        //5 : 00000000 00000000 00000000 00000101
        //3 | 5 : 00000000 00000000 00000000 00000111
        //3 5
        //7
        Scanner in = new Scanner(System.in);
        System.out.println(in.nextInt() | in.nextInt());
    }

    public void fun062() {
        //입력된 정수 두 개를 비트단위로 xor 연산한 후 그 결과를 정수로 출력해보자.
        //
        //예를 들어 3과 5가 입력되었을 때를 살펴보면
        //3 : 00000000 00000000 00000000 00000011
        //5 : 00000000 00000000 00000000 00000101
        //3 ^ 5 : 00000000 00000000 00000000 00000110
        //138 255
        //117
        Scanner in = new Scanner(System.in);
        System.out.println(in.nextInt() ^ in.nextInt());
    }

    public int[] fun062_bonus_1(int[][] coordinates) {
        //직사각형을 만드는 데 필요한 4개의 점 중 3개의 좌표가 주어질 때,
        // 나머지 한 점의 좌표를 구하려고 합니다. 점 3개의 좌표가 들어있는
        // 배열 v가 매개변수로 주어질 때, 직사각형을 만드는 데 필요한 나머지
        // 한 점의 좌표를 return 하도록 solution 함수를 완성해주세요.
        //
        //단, 직사각형의 각 변은 x축, y축에 평행하며, 반드시 직사각형을 만들 수
        // 있는 경우만 입력으로 주어집니다.
        //
        //제한사항
        //
        //v는 세 점의 좌표가 들어있는 2차원 배열입니다.
        //v의 각 원소는 점의 좌표를 나타내며, 좌표는 [x축 좌표, y축 좌표] 순으로
        // 주어집니다.
        //
        //좌표 값은 1 이상 10억 이하의 자연수입니다.
        //직사각형을 만드는 데 필요한 나머지 한 점의 좌표를 [x축 좌표, y축 좌표]
        // 순으로 담아 return 해주세요.
        //[[1,4], [3,4], [3,10]]
        //
        //
        //[1,10]
        int[] result = new int[2];
        for (int i = 0; i < 2; i++) {
            if (coordinates[0][i] == coordinates[1][i]) {
                result[i] = coordinates[2][i];
            } else if (coordinates[0][i] == coordinates[2][i]) {
                result[i] = coordinates[1][i];
            } else if (coordinates[1][i] == coordinates[2][i]) {
                result[i] = coordinates[0][i];
            }
        }
        return result;
    }

    public int[] fun062_bonus_2(int[][] coordinates) {
        //직사각형을 만드는 데 필요한 4개의 점 중 3개의 좌표가 주어질 때,
        // 나머지 한 점의 좌표를 구하려고 합니다. 점 3개의 좌표가 들어있는
        // 배열 v가 매개변수로 주어질 때, 직사각형을 만드는 데 필요한 나머지
        // 한 점의 좌표를 return 하도록 solution 함수를 완성해주세요.
        //
        //단, 직사각형의 각 변은 x축, y축에 평행하며, 반드시 직사각형을 만들 수
        // 있는 경우만 입력으로 주어집니다.
        //
        //제한사항
        //
        //v는 세 점의 좌표가 들어있는 2차원 배열입니다.
        //v의 각 원소는 점의 좌표를 나타내며, 좌표는 [x축 좌표, y축 좌표] 순으로
        // 주어집니다.
        //
        //좌표 값은 1 이상 10억 이하의 자연수입니다.
        //직사각형을 만드는 데 필요한 나머지 한 점의 좌표를 [x축 좌표, y축 좌표]
        // 순으로 담아 return 해주세요.
        //[[1,4], [3,4], [3,10]]
        //
        //
        //[1,10]
        int[] result = new int[2];
        result[0] = coordinates[0][0] ^ coordinates[1][0] ^ coordinates[2][0];
        result[1] = coordinates[0][1] ^ coordinates[1][1] ^ coordinates[2][1];
        return result;
    }

    public void fun063() {
        //입력된 두 정수 a, b 중 큰 값을 출력하는 프로그램을 작성해보자.
        //단, 조건문을 사용하지 않고 3항 연산자 'and or' 를 사용한다.
        Scanner in = new Scanner(System.in);
        int[] num = new int[2];
        num[0] = in.nextInt();
        num[1] = in.nextInt();
        System.out.println(num[0] > num[1] ? num[0] : num[1]);
    }

    public void fun064_1() {
        //입력된 세 정수 a, b, c 중 가장 작은 값을 출력하는
        //프로그램을 작성해보자. (단, 삼항 연산자 이용)
        Scanner in = new Scanner(System.in);
        int[] num = new int[3];
        num[0] = in.nextInt();
        num[1] = in.nextInt();
        num[2] = in.nextInt();
        System.out.println(
                num[0] > num[1] ? num[1] > num[2] ? num[2] : num[1] :
                        num[0] > num[2] ? num[2] : num[0]);
    }

    public void fun064_2() {
        //입력된 세 정수 a, b, c 중 가장 작은 값을 출력하는
        //프로그램을 작성해보자. (단, 삼항 연산자 이용)
        Scanner in = new Scanner(System.in);
        int[] num = new int[4];
        num[0] = in.nextInt();
        num[1] = in.nextInt();
        num[2] = in.nextInt();
        num[3] = num[0] > num[1] ? num[1] : num[0];
        System.out.println(num[2] > num[3] ? num[3] : num[2]);
    }

    public void fun064_bonus() {
        //1개의 정수형 입력이 들어오면 삼항 연산을 이용하여
        // '홀수'와 '짝수'를 판별하여라
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(num % 2 == 0 ? "짝수" : "홀수");
    }

    public void fun065() {
        //세 정수 a, b, c가 입력되었을 때, 짝수만 출력해보자.
        Scanner in = new Scanner(System.in);
        int[] num = new int[3];
        num[0] = in.nextInt();
        num[1] = in.nextInt();
        num[2] = in.nextInt();
        for (int i : num) {
            System.out.print(i % 2 == 0 ? i + " " : "");
        }
    }

    public void fun066() {
        //세 정수 a, b, c가 입력되었을 때, 짝수만 출력해보자.
        Scanner in = new Scanner(System.in);
        int[] num = new int[3];
        num[0] = in.nextInt();
        num[1] = in.nextInt();
        num[2] = in.nextInt();
        for (int i : num) {
            System.out.print(i % 2 == 0 ? "even " : "odd ");
        }
    }

    public void fun067() {
        //정수 1개가 입력되었을 때,
        // 음(minus)/양(plus)과 짝(even)/홀(odd)을 출력해보자.
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(num > 0 ? "plus" : "minus");
        System.out.println(num % 2 == 0 ? "even" : "odd");

    }

    public void fun068() {
        //점수(정수, 0 ~ 100)를 입력받아 평가를 출력해보자.
        //**평가 기준**
        //점수 범위 : 평가
        // 90 ~  100 : A
        // 70 ~   89 : B
        // 40 ~   69 : C
        //  0 ~   39 : D
        //로 평가되어야 한다.
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num > 89) {
            System.out.println("A");
        } else if (num > 69) {
            System.out.println("B");
        } else if (num > 39) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
    }

    public void fun069() {
        //평가를 문자(A, B, C, D, ...)로 입력받아 내용을 다르게 출력해보자.
        //평가 내용
        //[평가 : 내용]
        //A : best!!!
        //B : good!!
        //C : run!
        //D : slowly~
        //나머지 문자들 : what?
        Scanner in = new Scanner(System.in);
        char result = in.next().charAt(0);
        if (result == 'A') {
            System.out.println("best!!!");
        } else if (result == 'B') {
            System.out.println("good!!");
        } else if (result == 'C') {
            System.out.println("run!");
        } else if (result == 'D') {
            System.out.println("slowly~");
        } else {
            System.out.println("what?");
        }
    }

    public void fun070() {
        //월이 입력될 때 계절 이름이 출력되도록 해보자.
        //[월 : 계절 이름]
        //12, 1, 2 : winter
        //3, 4, 5 : spring
        //6, 7, 8 : summer
        //9, 10, 11 : fall
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("fall");
                break;
        }
    }

    public void fun071() {
        //정수가 순서대로 입력된다.
        //(단, 개수는 알 수 없다.)
        //
        //0이 아니면 입력된 정수를 출력하고, 0이 입력되면 출력을 중단해보자.
        //while( ), for( ) 등의 반복문을 사용할 수 없다.
        //7 4 2 3 0 1 5 6 9 10 8

        //7
        //4
        //2
        //3
        Scanner in = new Scanner(System.in);
        String[] line = in.nextLine().split(" ");
        for (String word : line) { // 자바는 goto문이 없다
            if (word == "0") break;
            System.out.println(word);
        }
    }

    public void fun072() {
        //n개의 정수가 순서대로 입력된다.
        //(단 n의 최대 개수는 알 수 없다.)
        //
        //n개의 입력된 정수를 순서대로 출력해보자.
        //while( ), for( ) 등의 반복문을 사용할 수 없다.
        //5
        //1 2 3 4 5

        //1
        //2
        //3
        //4
        //5
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int[] num = new int[length];
        for (int i = 0; i < length; i++) {
            num[i] = in.nextInt();
        }
        for (int i : num) {
            System.out.println(i);
        }
    }

    public void fun073() {
        //정수가 순서대로 입력된다.
        //(단, 개수는 알 수 없다.)
        //
        //0이 아니면 입력된 정수를 출력하고, 0이 입력되면 출력을 중단해보자.
        //7 4 2 3 0 1 5 6 9 10 8

        //7
        //4
        //2
        //3
        Scanner in = new Scanner(System.in);
        String[] line = in.nextLine().split(" ");
        for (String word : line) { // 자바는 goto문이 없다
            if (word == "0") break;
            System.out.println(word);
        }
    }

    public void fun074() {
        //정수(1 ~ 100) 1개가 입력되었을 때 카운트다운을 출력해보자.
        //5

        //5
        //4
        //3
        //2
        //1
        Scanner in = new Scanner(System.in);
        for (int i = in.nextInt(); i > 0; i--) { // 자바는 goto문이 없다
            System.out.println(i);
        }
    }

    public void fun075() {
        //정수(1 ~ 100) 1개가 입력되었을 때 카운트다운을 출력해보자.
        //5

        //5
        //4
        //3
        //2
        //1
        //0
        Scanner in = new Scanner(System.in);
        for (int i = in.nextInt(); i >= 0; i--) { // 자바는 goto문이 없다
            System.out.println(i);
        }
    }

    public void fun076() {
        //영문자(a ~ z) 1개가 입력되었을 때 그 문자까지의 알파벳을 순서대로 출력해보자.
        //f

        //a b c d e f
        Scanner in = new Scanner(System.in);
        char c = in.next().charAt(0);
        while (c > ('a' - 1)) {
            System.out.println(c);
            c--;
        }
    }

    public void fun077() {
        //정수(0 ~ 100) 1개를 입력받아 0부터 그 수까지 순서대로 출력해보자.
        //4

        //0
        //1
        //2
        //3
        //4
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for (int i = 0; i <= num; i++) System.out.println(i);
    }

    public void fun078_1() {
        //정수(1 ~ 100) 1개를 입력받아 1부터 그 수까지 짝수의 합을 구해보자.
        //5

        //6
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int sum = 0;
        for (int i = 0; i <= num; i += 2) sum += i;
        System.out.println(sum);
    }

    public void fun078_2() {
        //정수(1 ~ 100) 1개를 입력받아 1부터 그 수까지 짝수의 합을 구해보자.
        //5

        //6
        Scanner in = new Scanner(System.in);
        int num = in.nextInt() / 2;
        int sum = (1 + num) * num;
        System.out.println(sum);
    }

    public void fun079() {
        //원하는 문자가 입력될 때까지 반복 출력하기
        //
        //'q'가 입력될 때까지 입력한 문자를 계속 출력하는 프로그램을 작성해보자.
        //x b k d l q g a c

        //x
        //b
        //k
        //d
        //l
        //q
        Scanner in = new Scanner(System.in);
        String[] line = in.nextLine().split(" ");
        for (String word : line) {
            System.out.println(word);
            if (word == "q") break;
        }
    }

    public void fun080() {
        //언제까지 더해야 할까?
        //
        //1, 2, 3 ... 을 계속 더해 나갈 때, 그 합이 입력한 정수(0 ~ 1000)보다
        // 같거나 작을 때까지 계속 더하는 프로그램을 작성해보자.
        //
        //즉, 1부터 n까지 정수를 계속 더한다고 할 때, 어디까지 더해야 입력한 수보다
        // 같거나 커지는지 알아보고자 하는 문제이다.

        //55

        //10
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int sum = 0;
        for (int i = 1; i >= num; i++) {
            sum += i;
        }
        System.out.println("sum");
    }

    public void fun081() {
        //주사위를 2개 던지면?
        //
        //1부터 n까지, 1부터 m까지 숫자가 적힌 서로 다른
        //주사위 2개를 던졌을 때 나올 수 있는 모든 경우를 출력해보자.

        //2 3

        //1 1
        //1 2
        //1 3
        //2 1
        //2 2
        //2 3
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        for (int i = 1; i >= num1; i++) {
            for (int j = 1; i >= num2; j++) System.out.println(i + " " + j);
        }
    }

    public void fun082() {
        //6진수 구구단
        //
        //16진수(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F)를
        // 배운 영일(01)이는 16진수끼리 곱하는 16진수 구구단에 대해서 궁금해졌다.
        //
        //A, B, C, D, E, F 중 하나가 입력될 때, 1부터 F까지 곱한 16진수
        // 구구단의 내용을 출력해보자.
        //(단, A ~ F 까지만 입력된다.)

        //B

        //B*1=B
        //B*2=16
        //B*3=21
        //B*4=2C
        //B*5=37
        //B*6=42
        //B*7=4D
        //B*8=58
        //B*9=63
        //B*A=6E
        //B*B=79
        //B*C=84
        //B*D=8F
        //B*E=9A
        //B*F=A5
        Scanner in = new Scanner(System.in);
        int num = in.nextInt(16);
        for (int i = 1; i <= 15; i++) {
            System.out.println(String.format("%X*%X=%X", num, i, num * i));
        }
    }

    public void fun083() {
        // 3 6 9 게임의 왕이 되자
        //
        //3 6 9 게임을 하던 영일이는 3 6 9 게임에서 잦은 실수로 계속해서 벌칙을 받게 되었다.
        //3 6 9 게임의 왕이 되기 위한 마스터 프로그램을 작성해 보자.

        //10 보다 작은 정수 1개가 입력된다. (1 ~ 9)
        //9

        //1 2 X 4 5 X 7 8 X
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0) {
                System.out.print("X ");
            } else {
                System.out.print(i + " ");
            }
        }
    }

    public void fun084() {
        //  빛 섞어 색 만들기
        //
        //빨강(red), 초록(green), 파랑(blue) 빛을 섞어 여러 가지 빛의 색을
        // 만들어 내려고 한다.
        //
        //빨강(r), 초록(g), 파랑(b) 각각의 빛의 개수가 주어질 때,
        //(빛의 강약에 따라 0 ~ n-1 까지 n가지의 빛 색깔을 만들 수 있다.)
        //
        //주어진 rgb 빛들을 다르게 섞어 만들 수 있는 모든 경우의 조합(r g b)과
        //총 가짓 수를 계산해보자.

        //2 2 2

        //0 0 0
        //0 0 1
        //0 1 0
        //0 1 1
        //1 0 0
        //1 0 1
        //1 1 0
        //1 1 1
        //8
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        for (int i = 0; i > num1; i++) {
            for (int j = 0; j > num2; j++) {
                for (int k = 0; k > num3; k++) {
                    System.out.println(i + " " + j + " " + k);
                }
            }
        }
    }

    public void fun085() {
        /*
        # 소리 파일 저장용량 계산하기

        # **서론**
        # 소리가 컴퓨터에 저장될 때에는 디지털 데이터화 되어 저장된다.

        # 마이크를 통해 1초에 적게는 수십 번, 많게는 수만 번 소리의 강약을 체크해
        # 그 값을 정수값으로 바꾸고, 그 값을 저장해 소리를 파일로 저장할 수 있다.

        # 값을 저장할 때에는 비트를 사용하는 정도에 따라 세세한 녹음 정도를 결정할 수 있고,
        # 좌우(스테레오) 채널로 저장하면 2배… 5.1채널이면 6배의 저장공간이 필요하고,
        # 녹음 시간이 길면 그 만큼 더 많은 저장공간이 필요하다.
        # 1초 동안 마이크로 소리강약을 체크하는 수를 h (헤르쯔, Hz 는 1초에 몇 번? 체크하는가를 의미한다.)

        # 한 번 체크한 결과를 저장하는 비트 b (2비트를 사용하면 0 또는 1 두 가지, 16비트를 사용하면 65536가지..)

        # 좌우 등 소리를 저장할 트랙 개수인 채널 c (모노는 1개, 스테레오는 2개의 트랙으로 저장함을 의미한다.)

        # 녹음할 시간 s가 주어질 때, 필요한 저장 용량을 계산하는 프로그램을 작성해보자.

        # **문제의 핵심 포인트**
        # 실제로 일반적인 CD 음질(44.1KHz, 16bit, 스테레오)로 1초 동안 저장하려면
        # 44100 * 16 * 2 * 1 bit의 저장공간이 필요
        # 이렇게 녹음하는 방식을 PCM(Pulse Code Modulation) 방법이라고 하는데, 압축하지 않은 순수한(raw) 소리 데이터 파일은 대표적으로 *.wav 가 있다.

        # **틈새 자료구조**
        # 8 bit(비트)           = 1byte(바이트)
        # 1024 Byte(2^10 byte) = 1KB(킬로 바이트)
        # 1024 KB(2^10 KB)     = 1MB(메가 바이트)
        # 1024 MB(2^10 MB)     = 1GB(기가 바이트)
        # 1024 GB(2^10 GB)     = 1TB(테라 바이트)

        # 입력
        # h, b, c, s 가 공백을 두고 입력된다.
        # h는 48,000이하, b는 32이하(단, 8의배수), c는 5이하, s는 6,000이하의 자연수이다.

        # 출력
        # 필요한 저장 공간을 MB 단위로 바꾸어 출력한다.
        # 단, 소수점 둘째 자리에서 반올림해 첫째 자리까지 출력하고 MB를 공백을 두고 출력한다.*/

        //44100 16 2 10

        //1.7 MB

        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        int num4 = in.nextInt();
        String result = String.format("%.1f MB",
                (float) (num1 * num2 * num3 * num4) / (8 * 1024 * 1024));
        System.out.println(result);
    }

    public void fun086() {
        /*
        # 그림 파일 저장용량 계산하기

        # **서론**
        # 이미지가 컴퓨터에 저장될 때에도 디지털 데이터화 되어 저장된다.

        # 가장 기본적인 방법으로는 그림을 구성하는 한 점(pixel, 픽셀)의 색상을
        # 빨강(r), 초록(g), 파랑(b)의 3가지의 빛의 세기 값으로 따로 변환하여 저장하는 것인데,

        # 예를 들어 r, g, b 각 색에 대해서 8비트(0~255, 256가지 가능)씩을 사용한다고 하면,

        # 한 점의 색상은 3가지 r, g, b의 8비트+8비트+8비트로 총 24비트로 표현해서
        # 총 2^24 가지의 서로 다른 빛의 색깔을 사용할 수 있는 것이다.

        # 그렇게 저장하는 점을 모아 하나의 큰 이미지를 저장할 수 있게 되는데,
        # 1024 * 768 사이즈에 각 점에 대해 24비트로 저장하면 그 이미지를 저장하기 위한
        # 저장 용량을 계산할 수 있다.
        # 이미지의 가로 해상도 w, 세로 해상도 h, 한 픽셀을 저장하기 위한 비트 b 가 주어질 때, 압축하지 않고 저장하기 위해 필요한 저장 용량을 계산하는 프로그램을 작성해 보자.

        # **문제의 핵심 포인트**
        # 실제로 일반적인 1024 * 768 사이즈(해상도)의 각점에 대해
        # 24비트(rgb 각각 8비트씩 3개)로 저장하려면 1024 * 768 * 24 bit의 저장 용량이 필요하다.
        # 이렇게 이미지의 원래(raw) 데이터를 압축하지 않고 그대로 저장하는 대표적인 이미지 파일이 *.bmp 파일이며, 비트로 그림을 구성한다고 하여 비트맵 방식 또는 래스터 방식이라고 한다.

        # **틈새 자료구조**
        # 8 bit(비트)           = 1byte(바이트)
        # 1024 Byte(2^10 byte) = 1KB(킬로 바이트)
        # 1024 KB(2^10 KB)     = 1MB(메가 바이트)
        # 1024 MB(2^10 MB)     = 1GB(기가 바이트)
        # 1024 GB(2^10 GB)     = 1TB(테라 바이트)

        # 입력
        # w, h, b 가 공백을 두고 입력된다. 단, w, h는
        # 모두 정수이고 1~1024 이다. b는 40이하의 4의 배수이다.

        # 출력
        # 필요한 저장 공간을 MB 단위로 바꾸어 출력한다. 소수점 이하
        # 셋째 자리에서 반올림해 둘째 자리까지 출력한 뒤 MB를 출력한다.
        */

        //1024 768 24

        //2.25 MB

        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        String result = String.format("%.2f MB",
                (float) (num1 * num2 * num3) / (8 * 1024 * 1024));
        System.out.println(result);
    }

    public void fun087() {
        /*
        # 여기까지! 이제 그만~

        # 1, 2, 3 ... 을 순서대로 계속 더해나갈 때, 그 합이 입력한 정수보다
        # 작을 동안만 계속 더하는 프로그램을 작성해보자.

        # 즉, 1부터 n까지 정수를 계속 더한다고 할 때, 어디까지 더해야
        # 입력한 수보다 같거나 커지는지 알아보고자 하는 문제이다.

        # 하지만, 이번에는 그 때의 합을 출력해야 한다.

        # 예를 들어 57을 입력하면 1+2+3+...+8+9+10=55에 다시 11을 더해
        # 66이 될 때, 그 값 66이 출력되어야 한다.

        # 입력
        # 언제까지 합을 계산할 지, 정수 1개를 입력받는다.
        # 단, 입력되는 자연수는 100,000,000이하이다.

        # 출력
        # 1, 2, 3, 4, 5 ... 순서대로 계속 더해가다가, 그 합이 입력된
        #  정수보다 커지거나 같아지는 경우, 그때까지의 합을 출력한다.
        */

        //57

        //66.0

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int i, total;
        i = total = 0;
        while (total >= num) {
            i++;
            total += i;
        }
        System.out.println(total);
    }

    public void fun088() {
        /*
        1부터 입력한 정수까지 1씩 증가시켜 출력하는 프로그램을 작성하되,
        3의 배수인 경우는 출력하지 않도록 만들어보자.
        예를 들면, 1 2 4 5 7 8 10 11 13 14 ... 와 같이 출력하는 것이다.
        */

        //10

        //1 2 4 5 7 8 10

        Scanner in = new Scanner(System.in);
        for (int i = 1; i <= in.nextInt(); i++) {
            if (i % 2 == 0) continue;
            System.out.print(i + " ");
        }
    }

    public void fun089() {
        /*
        수 나열하기1

        어떤 규칙에 따라 수를 순서대로 나열한 것을 수열(series)이라고 한다.

        예를 들어 1 4 7 10 13 16 19 22 25 ... 은 1부터 시작해 이전에
        만든 수에 3을 더해 다음 수를 만든 수열이다.

        이러한 것을 수학에서는 앞뒤 수들의 차이가 같다고 하여 등차(차이가
        같다의 한문 말) 수열이라고 한다.
        수열을 알게 된 영일이는 갑자기 궁금해졌다.

        "그럼.... 123번째 나오는 수는 뭘까?"

        영일이는 프로그램을 만들어 더 큰 수도 자동으로 계산하고 싶어졌다.

        시작 값(a), 등차(d), 몇 번째인지를 나타내는 정수(n)가 입력될 때
        n번째 수를 출력하는 프로그램을 만들어보자.
        */

        //1 3 5

        //13

        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        System.out.println(num1 + num2 * (num3 - 1));
    }

    public void fun090() {
        /*
        # 수 나열하기2

        # 어떤 규칙에 따라 수를 순서대로 나열한 것을 수열이라고 한다.

        # 예를 들어 2 6 18 54 162 486 ... 은 2부터 시작해 이전에
         만든 수에 3을 곱해 다음 수를 만든 수열이다.

        # 이러한 것을 수학에서는 앞뒤 수들의 비율이 같다고 하여 등비
        (비율이 같다의 한문 말) 수열이라고 한다.

        # 등비 수열을 알게된 영일이는 갑자기 궁금해졌다.

        # "그럼.... 13번째 나오는 수는 뭘까?"

        # 영일이는 프로그램을 만들어 더 큰 수도 자동으로 계산하고 싶어졌다.

        # 시작 값(a), 등비(r), 몇 번째인지를 나타내는 정수(n)가 입력될 때
        n번째 수를 출력하는 프로그램을 만들어보자.

        # 입력
        # 시작 값(a), 등비의 값(r), 몇 번째 인지를 나타내는 정수(n)가 공백을
        두고 입력된다.(모두 0 ~ 10)

        # 출력
        # n번째 수를 출력한다.
        */

        //2 3 7

        //1458

        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        int total = num1;
        for (int i = 1; i < num3; i++) {
            total *= num2;
        }
        System.out.println(total);
    }

    public void fun091() {
        /*
        # 수 나열하기3

        # 어떤 규칙에 따라 수를 순서대로 나열한 것을 수열이라고 한다.

        # 예를 들어 1 -1 3 -5 11 -21 43 ... 은 1부터 시작해 이전에 만든 수
        에 -2를 곱한 다음 1을 더해 다음 수를 만든 수열이다.

        # 이런 이상한 수열을 알게 된 영일이는 또 궁금해졌다.

        # "그럼.... 13번째 나오는 수는 뭘까?"

        # 영일이는 물론 수학을 아주 잘하지만 이런 문제는 본 적이 거의 없었다...

        # 그래서 프로그램을 만들어 더 큰 수도 자동으로 계산하고 싶어졌다.

        # 시작 값(a), 곱할 값(m), 더할 값(d), 몇 번째인지를 나타내는 정수(n)가
         입력될 때, n번째 수를 출력하는 프로그램을 만들어보자.

        # 입력
        # 시작 값(a), 곱할 값(m), 더할 값(d), 몇 번째 인지를 나타내는 정수(n)가
         공백을 두고 입력된다.
        # (a, m, d는 -50 ~ +50, n은 10이하의 자연수)

        # 출력
        # n번째 수를 출력한다.
        */

        //1 -2 1 8

        //-85

        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        int num4 = in.nextInt();
        int now = num1;
        for (int i = 1; i < num4; i++) {
            now = now * num2 + num3;
        }
        System.out.println(now);
    }

    public void fun092() {
        /*
        # 함께 문제 푸는 날

        # 같은 날 동시에 가입한 3명의 사람들이 온라인 채점시스템에 들어와
        # 문제를 푸는 날짜가 매우 규칙적이라고 할 때, 다시 모두 함께 문제를
        # 풀게 되는 그날은 언제일까?

        # 예를 들어 3명이 같은 날 가입/등업하고, 각각 3일마다, 7일마다,
        # 9일마다 한 번씩 들어온다면, 처음 가입하고 63일 만에 다시 3명이
        # 함께 문제를 풀게 된다.

        # 입력
        # 같은 날 동시에 가입한 인원 3명이 규칙적으로 방문하는, 방문 주기가
        # 공백을 두고 입력된다. (단, 입력값은 100이하의 자연수이다.)
        */

        //3 7 9

        //63

        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        int i = 1;
        while (!(i % num1 == 0 && i % num2 == 0 && i % num3 == 0)) {
            i += 1;
        }
        System.out.println(i);
    }
}
