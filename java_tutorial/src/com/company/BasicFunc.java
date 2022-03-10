package com.company;
import java.io.*;
import java.util.Scanner;

public class BasicFunc {
    // 숫자와 문자
    public static void tuto_01(){
        System.out.println("Hellow world");
    }
    public static void tuto_02(){
        System.out.println(1+2);//3
    }
    public static void tuto_03(){
        System.out.println(1.2+1.3);//2.5
    }
    public static void tuto_04(){
        System.out.println(6/2);//3
    }
    public static void tuto_05(){
        System.out.println('생');//생
    }
    public static void tuto_06(){
        System.out.println("생활코딩");//생활코딩
        //System.out.println('생활코딩');
    }
    public static void tuto_07(){
        System.out.println("생");//생
    }
    public static void tuto_08(){
        System.out.println("egoing said \"Welcome programming world\"");
        //egoing said "Welcome programming world"
    }
    public static void tuto_09(){
        System.out.println("HTML\nCSS\nJavaScript\n");
        //HTML
        //CSS
        //JavaScript
    }
    public static void tuto_10(){
        System.out.println("생활"+"코딩");//생활코딩
    }
    // 변수
    public static void tuto_11(){
        int a;
        a = 1;
        System.out.println(a+1); //2

        a = 2;
        System.out.println(a+1); //3
    }
    public static void tuto_12(){
        double a = 1.1;
        System.out.println(a+1.1); // 2.2

        a = 2.1;
        System.out.println(a+1.1); // 3.2
    }
    public static void tuto_13(){
        int a = (int) 1.1;
        System.out.println(a+1.1);// 2.1
    }
    public static void tuto_14(){
        String first = "coding";
        System.out.println(first+" "+"everybody");// coding everybody
    }
    public static void tuto_15(){
        String a, b;
        a = "coding";
        b = " everybody";
        System.out.println(a+b);// coding everybody
    }
    public static void tuto_16(){
        System.out.println(100 + 10); // 110
        System.out.println((100 + 10) / 10); // 11
        System.out.println(((100 + 10) / 10) - 10); // 1
        System.out.println((((100 + 10) / 10) - 10) * 10); // 10
    }
    public static void tuto_17(){
        int a = 100;
        System.out.println(a + 10); // 110
        System.out.println((a+ 10) / 10); // 11
        System.out.println(((a + 10) / 10) - 10); // 1
        System.out.println((((a + 10) / 10) - 10) * 10); // 10
    }
    // 주석과 세미콜론
    public static void tuto_18(){
        // 한줄 주석
        /*
        여러줄
        주석
        */
        /**
         *
         * JavaDoc 주석
         *
         */
    }
    // 형변환
    public static void tuto_19(){
        // double a = 3.0F; // 성공
        // float b = 3.0; // 상수 3.0은 상수인데, 이 상수는 double 형이다.
        // byte -> short or char -> int -> long -> float -> double
        int a = 3; // 3
        float b = 1.0F; //1.0F
        double c = a + b; // 4.0
        System.out.println(a+" , "+b+" , "+c); // 3 , 1.0 , 4.0
    }
    public static void tuto_20(){
        //float a = 100.0; // 에러 100.0f
        //int b = 100.0F; // 에러 100
        float a = (float)100.0;
        int b = (int)100.0F;
        System.out.println(a +" , "+ b); // 100.0 , 100
    }
    // 연산자
    public static void tuto_21(){
        int result = 1 + 2;
        System.out.println(result); // 3
        System.out.println(result -= 1); // 2
        System.out.println(result *= 2); // 4
        System.out.println(result /= 2); // 2
        System.out.println(result %= 7); // 2
    }
    public static void tuto_22(){
        String firstString = "This is";
        String secondString = " a concatenated string.";
        String thirdString = firstString+secondString;
        System.out.println(thirdString); // This is a concatenated string.
    }
    public static void tuto_23(){
        int a = 10;
        int b = 3;
        float c = 10.0F;
        float d = 3.0F;
        System.out.println(a/b); // 3
        System.out.println(c/d); // 3.3333333
        System.out.println(a/d); // 3.3333333
    }
    public static void tuto_24(){
        int i = 3;
        i++;
        System.out.println(i); // 4
        ++i;
        System.out.println(i); // 5
        System.out.println(++i); // 6
        System.out.println(i++); // 6
        System.out.println(i); // 7
    }
    // 비교와 Boolean
    public static void tuto_25(){
        System.out.println(1==2);           //false
        System.out.println(1==1);           //true
        System.out.println("one"=="two");   //false
        System.out.println("one"=="one");   //true
    }
    public static void tuto_26(){
        System.out.println(1!=2);           //true
        System.out.println(1!=1);           //false
        System.out.println("one"!="two");   //true
        System.out.println("one"!="one");   //false
    }
    public static void tuto_27(){
        System.out.println(10>20);       //false
        System.out.println(10>2);        //true
        System.out.println(10>10);       //false
    }
    public static void tuto_28(){
        System.out.println(10 >= 20);   // false
        System.out.println(10 >= 2);    // true
        System.out.println(10 >= 10);   // true
    }
    public static void tuto_29(){
        String a = "Hello world";
        String b = new String("Hello world");
        System.out.println(a == b);         // false
        System.out.println(a.equals(b));    // true
    }
    // 조건문
    public static void tuto_30(){
        if(true){
            System.out.println("result : true");    // result : true
        }
        if(false){
            System.out.println("result : true");
        }
    }
    public static void tuto_31(){
        if (true) {
            System.out.println(1);  // 1
        } else {
            System.out.println(2);
        }
        if(false){
            System.out.println(1);
        } else {
            System.out.println(2);  // 2
        }
    }
    public static void tuto_32(){
        if(false){
            System.out.println(1);
        } else if(false) {
            System.out.println(2);
        } else if(true) {
            System.out.println(3); // 3
        } else {
            System.out.println(4);
        }
    }
    public static void tuto_33(){
        switch(3){
            case 1:
                System.out.println("one");
            case 2:
                System.out.println("two");
            case 3:
                System.out.println("three"); // three
        }
    }
    public static void tuto_34(){
        switch(3){
            case 1:
                System.out.println("one");
            case 2:
                System.out.println("two");
            case 3:
                System.out.println("three"); // three
        }
    }
    // 논리 연산자
    public static void tuto_35(){
        if (true && true) {
            System.out.println(1); // 1
        }

        if (true && false) {
            System.out.println(2);
        }

        if (false && true) {
            System.out.println(3);
        }

        if (false && false) {
            System.out.println(4);
        }
    }
    public static void tuto_36(){
        if (true || true) {
            System.out.println(1);  // 1
        }

        if (true || false) {
            System.out.println(2);  // 2
        }

        if (false || true) {
            System.out.println(3);  // 3
        }

        if (false || false) {
            System.out.println(4);
        }
    }
    public static void tuto_37(){
        if (!true) {
            System.out.println(1);
        }
        if (!false) {
            System.out.println(2);
        }
    }
    // 반복문
    public static void tuto_38(){
        while (true) {
            // break없어서 계속 반복
            System.out.println("Coding Everybody"); //Coding Everybody
        }
    }
    public static void tuto_39(){
        int i = 0;
        // i의 값이 10보다 작다면 true, 크다면 false가 된다.
        // 현재 i의 값은 0이기 때문에 이 반복문은 실행된다.
        while(i<10){ // 10번 반복
            System.out.println("Coding Everybody"+i);
            // i의 값에 1을 더한다. 반복문의 중괄호의 마지막 라인에 도달하면
            // 반복문은 반복문을 재호출한다. 이때 i<10의 값을 검사하게 된다.
            i++;
        }
    }
    public static void tuto_40(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Coding Everybody " + i);
        }
    }
    public static void tuto_41(){
        for (int i = 0; i < 10; i++) {
            if (i == 5)
                break;
            System.out.println("Coding Everybody " + i);
        }
    }
    public static void tuto_42(){
        for (int i = 0; i < 10; i++) {
            if (i == 5)
                continue;
            System.out.println("Coding Everybody " + i);
        }
    }
    public static void tuto_43(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(i + "" + j);
            }
        }
    }
    // 배열
    public static void tuto_44(){
        String[] classGroup = { "최진혁", "최유빈", "한이람", "이고잉" };
        System.out.println(classGroup[0]);
        System.out.println(classGroup[1]);
        System.out.println(classGroup[2]);
        System.out.println(classGroup[3]);
        System.out.println(classGroup.length); // 4
    }
    public static void tuto_45(){
        String[] members = { "최진혁", "최유빈", "한이람" };
        for (int i = 0; i < members.length; i++) {
            String member = members[i];
            System.out.println(member + "이 상담을 받았습니다");
        }
    }
    public static void tuto_46(){
        String[] members = { "최진혁", "최유빈", "한이람" };
        for (String e : members) {
            System.out.println(e + "이 상담을 받았습니다");
        }
    }
    // 메소드
    public static int tuto_47(int a , int b){
        return a+b;
    }
    public static void tuto_48(){
        String result = tuto_48_sub(1, 5);
        System.out.println(result);//1234
        try { // 무시
            BufferedWriter out = new BufferedWriter(new FileWriter("tuto_48.txt"));
            out.write(result);
            out.close();
        } catch (IOException e) {
        }
    }
    public static String tuto_48_sub(int init, int limit) {
        int i = init;
        String output = "";
        while (i < limit) {
            output += i;
            i++;
        }
        return output;
    }
    public static String tuto_49(int i){
        if(i==0){
            return "zero";
        } else if(i==1){
            return "one";
        } else if(i==2){
            return "two";
        }
        return "none";
    }
    public static String[] tuto_50(){
        String[] members = { "최진혁", "최유빈", "한이람" };
        return members;
    }
    // 입력과 출력
    public static void tuto_51() {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println(i*1000);
        sc.close();
    }

}
