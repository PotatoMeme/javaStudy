package com.company;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class week01Switch {
    //link
    //https://github.com/PotatoMeme/ifp-2022-winter-vacation-study/tree/kimseonghwan/week01
    public void unit03_exercise01() {
        //'Hello, world!'와 'Python Programming'이 각 줄에 출력되게 만드세요.
        System.out.println("Hello, world!");
        System.out.println("Python Programming");
    }

    public void unit03_practice01() {
        //'Hello, world!' 두 개를 각 줄에 출력하는 프로그램을 만드세요
        //(대소문자 구분과 띄어쓰기가 정확해야 합니다).
        //정답에는 출력 결과를 만족하는 전체 소스 코드를 입력해야 합니다.System.out.println("Hello, world!");
        System.out.println("Hello, world!");
        System.out.println("Hello, world!");
    }

    public void unit05_exercise01() {
        //국립환경과학원에서는 아파트에서 소음이 가장 심한 층수를 구하는 계산식을 발표했습니다.
        //소음이 가장 심한 층은 0.2467 * 도로와의 거리(m) + 4.159입니다.
        //다음 소스 코드를 완성하여 소음이 가장 심한 층수가 출력되게 만드세요.
        //단, 층수를 출력할 때는 소수점 이하 자리는 버립니다(정수로 출력).
        System.out.println((int) (0.2467 * 12 + 4.159));
    }

    public void unit05_practice01() {
        // L이라는 게임에서 "왜곡"이라는 스킬이 AP * 0.6 + 225의 피해를 입힙니다.
        // 참고로 이 게임에서 AP(Ability Power, 주문력)는 마법 능력치를 뜻합니다.
        // 다음 소스 코드를 완성하여 스킬의 피해량이 출력되게 만드세요.
        // AP: 102
        System.out.println((int) (102 * 0.6 + 225));
    }

    public void unit06_exercise01() {
        // 다음 소스 코드를 완성하여 정수 세 개를 입력받고 합계가 출력되게 만드세요
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.println(a + " " + b + " " + c);
    }

    public void unit06_practice01() {
        //다음 소스 코드를 완성하여 50, 100, None이 각 줄에 출력되게 만드세요.
        //print(a) => 50
        //print(b) => 100
        //print(c) => None
        var a = 50;
        var b = 100;
        var c = "none";
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public void unit06_practice02() {
        // 표준 입력으로 국어, 영어, 수학, 과학 점수가 입력됩니다.
        // 평균 점수를 출력하는 프로그램을 만드세요(input에서 안내 문자열은 출력하지 않아야 합니다).
        // 단, 평균 점수를 출력할 때는 소수점 이하 자리는 버립니다(정수로 출력).
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        System.out.println((a + b + c + d) / 4);
    }

    public void unit07_exercise01() {
        //다음 소스 코드를 완성하여 날짜와 시간이 출력되게 만드세요.
        //출력 : 2000/10/27 11:43:59
        int year, month, day, minute, hour, second;
        year = 2000;
        month = 10;
        day = 27;
        hour = 11;
        minute = 43;
        second = 59;
        System.out.println(year + "/" + month + "/" + day);
        System.out.println(hour + ":" + minute + ":" + second);
    }

    public void unit07_practice01() {
        //표준 입력으로 년, 월, 일, 시, 분, 초가 입력됩니다.
        //다음 소스 코드를 완성하여 입력된 날짜와 시간을 년-월-일T시:분:초 형식으로 출력되게 만드세요.
        //입력 => 1999 12 31 10 37 21
        //결과 => 1999-12-31T10:37:21
        Scanner in = new Scanner(System.in);
        int year, month, day, minute, hour, second;
        year = in.nextInt();
        month = in.nextInt();
        day = in.nextInt();
        hour = in.nextInt();
        minute = in.nextInt();
        second = in.nextInt();
        System.out.println(year + "-" + month + "-" + day);
        System.out.println(hour + ":" + minute + ":" + second);
    }

    public void unit08_exercise01() {
        //국어, 영어, 수학, 과학 점수가 있을 때 한 과목이라도 50점 미만이면 불합격이라고 정했습니다.
        //다음 소스 코드를 완성하여 합격이면 True, 불합격이면 False가 출력되게 만드세요.
        //출력 =>  False
        int korean, english, mathematics, science;
        korean = 92;
        english = 47;
        mathematics = 86;
        science = 81;
        System.out.println((korean >= 50) && (english >= 50) && (mathematics >= 50) && (science >= 50));
    }

    public void unit08_practice01() {
        //표준 입력으로 국어, 영어, 수학, 과학 점수가 입력됩니다.
        //국어는 90점 이상, 영어는 80점 초과, 수학은 85점 초과, 과학은 80점 이상일 때 합격이라고 정했습니다(한 과목이라도 조건에 만족하지 않으면 불합격).
        //다음 소스 코드를 완성하여 합격이면 True, 불합격이면 False가 출력되게 만드세요(input에서 안내 문자열은 출력하지 않아야 합니다).
        Scanner in = new Scanner(System.in);
        int korean, english, mathematics, science;
        korean = in.nextInt();
        english = in.nextInt();
        mathematics = in.nextInt();
        science = in.nextInt();
        System.out.println((korean >= 90) && (english > 80) && (mathematics > 85) && (science >= 80));
    }

    public void unit09_exercise01() {
        //다음 소스 코드를 완성하여 실행 결과대로 문자열이 출력되게 만드세요.
        //출력
        //Python is a programming language that lets you work quickly
        //and
        //integrate systems more effectively.Scanner in = new Scanner(System.in);
        var s = "Python is a programming language that lets you work quickly\nand\nintegrate systems more effectively.";
        System.out.println(s);
    }

    public void unit09_practice01() {
        //다음 소스 코드를 완성하여 실행 결과대로 문자열이 출력되게 만드세요.
        //출력
        //'Python' is a "programming language"
        //that lets you work quickly
        //and
        //integrate systems more effectively.
        var s = "'Python' is a \"programming language\"\n" +
                "that lets you work quickly\n" +
                "and\n" +
                "integrate systems more effectively.";

        System.out.println(s);
    }

    public void unit10_exercise01() {
        //다음 소스 코드를 완성하여 리스트 [5, 3, 1, -1, -3, -5, -7, -9]가 출력되게 만드세요.
        //리스트를 만들 때는 range를 사용해야 합니다 => 배열로 변경
        Integer[] data = {5, 3, 1, -1, -3, -5, -7, -9};

        System.out.println(Arrays.toString(data));
    }

    public void unit10_practice01() {
        //표준 입력으로 정수가 입력됩니다.
        //range의 시작하는 숫자는 -10, 끝나는 숫자는 10이며 입력된 정수만큼 증가하는 숫자가
        //들어가도록 튜플을 만들고, 해당 튜플을 출력하는 프로그램을 만드세요
        //(input에서 안내 문자열은 출력하지 않아야 합니다).

    }


}
