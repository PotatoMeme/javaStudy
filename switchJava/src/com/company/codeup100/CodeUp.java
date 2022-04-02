package com.company.codeup100;

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

}
