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
    public static void tuto_52() {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()) {// 계속 입력
            System.out.println(sc.nextInt()*1000);
        }
        sc.close();
    }
    public static void tuto_53() {
        try {
            File file = new File("tuto_48.txt");
            Scanner sc = new Scanner(file);
            while(sc.hasNextInt()) {
                System.out.println(sc.nextInt()*1000);
            }
            sc.close();
        } catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
    // 클래스와 인스턴스 그리고 객체
    public static void tuto_54() {
        tuto_54_sum(3,4);
        tuto_54_avg(3,4);
    }
    public static void tuto_54_avg(int left, int right) {
        System.out.println((left+right)/2.0);
    }
    public static void tuto_54_sum(int left, int right) {
        System.out.println(left+right);
    }

    public static void tuto_55() {
        Tuto_55_Calculator subClass = new Tuto_55_Calculator();
        subClass.setOprands(3,4);
        subClass.sum();
        subClass.avg();
    }
    // 클래스 맴버와 인스턴스 맴버
    public static void tuto_56() {
        Tuto_55_Calculator subClass1 = new Tuto_55_Calculator(3,4);
        Tuto_55_Calculator subClass2 = new Tuto_55_Calculator(4,5);
        subClass1.printArgument();
        subClass2.printArgument();
    }
    // 유효범위
    public static void tuto_57() {
        for (int i = 0; i < 5; i++) {
            tuto_57_sub();
            System.out.println(i);
        }
    }
    public static void tuto_57_sub() {
        int i = 0;
    }
    static int tuto_58_argument;
    public static void tuto_58() {
        int i = 0;
        for (tuto_58_argument = 0; tuto_58_argument < 5; tuto_58_argument++) {
            tuto_58_sub();
            System.out.println(tuto_58_argument);
            i++;
            if ( i == 8 ) break;
        }
    }
    public static void tuto_58_sub() {
        tuto_58_argument = 0;
    }
    static int tuto_59_argument = 5;
    public static void tuto_59() {
        tuto_59_sub1();
    }
    public static void tuto_59_sub1() {
        int tuto_59_argument = 10;
        tuto_59_sub2();
    }
    public static void tuto_59_sub2() {
        System.out.println(tuto_59_argument);
    }
    // 초기화와 생성자
    public static void tuto_60() {
        Tuto_60_Calculator tuto = new Tuto_60_Calculator(1,4,5);
        tuto.printArguments();

    }
    // overriding
    public static void tuto_61() {
        Tuto_61_Calculator tuto = new Tuto_61_Calculator(1,4);
        tuto.printArgument();
    }
    // overloading
    public static void tuto_62() {
        Tuto_55_Calculator tuto = new Tuto_55_Calculator();
        tuto.setOprands(5,3);
        tuto.printArgument();
        tuto.setOprands();
        tuto.printArgument();
    }


}
class Tuto_55_Calculator{
    int left, right;
    Tuto_55_Calculator(){ // overloading
        this.left = 0;
        this.right = 0;
    }

    Tuto_55_Calculator(int left, int right){ // overloading
        this.left = left;
        this.right = right;
    }
    public void setOprands(){ // overloading
        this.left = 0;
        this.right = 0;
    }
    public void setOprands(int left, int right){ // overloading
        this.left = left;
        this.right = right;
    }
    public void sum(){
        System.out.println(this.left+this.right);
    }
    public void avg(){
        System.out.println((this.left+this.right)/2);
    }
    public void printArgument(){
        System.out.println(left + " " + right);
    }
}

class Tuto_60_Calculator extends Tuto_55_Calculator {
    int middle;
    Tuto_60_Calculator(int left, int right, int middle){
        super(left,right);
        this.middle = middle;
    }
    public void printArguments() {
        System.out.println(this.left + " " + this.right + " " +this.middle);
    }
}
class Tuto_61_Calculator extends Tuto_55_Calculator {
    Tuto_61_Calculator(int left, int right){
        super(left,right);
    }
//    error / 자료형 String - > void
//    public String printArgument(){
//        return (left + " " + right);
//    }
    public void printArgument(){
        System.out.println("결과 : "+left + " " + right);
    }

}