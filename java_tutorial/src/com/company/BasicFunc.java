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
    // 접근 제어자
    public static void tuto_63() {
        Tuto_62_Calculator tuto = new Tuto_62_Calculator(3);
        //System.out.println("private/age : "+tuto.age);
        System.out.println("public/getAge : "+ tuto.getAge() );
        System.out.println("public/sex" + tuto.sex);
    }
    // abstract : 추상
    public static void tuto_64() {
        Tuto_64_Calculator_Sub tuto1 = new Tuto_64_Calculator_Sub();
        //Tuto_64_Calculator tuto2 = new Tuto_64_Calculator();
        System.out.println(tuto1.abFun());
        tuto1.basicFun();
    }
    // final : 상속/변경을 금지하는 규제
    public static void tuto_65() {
        Tuto_65_Calculator tuto = new Tuto_65_Calculator();
        tuto.setOprands(3,4);
        tuto.sum();
        tuto.avg();
        System.out.println(tuto.getPi());
    }
    // interface : abstract, final와 함께 대표적인 규제, 짜임세? 형식?
    public static void tuto_66() {
        Tuto_66_Calculator tuto = new Tuto_66_Calculator();
        tuto.print("이것은 inteface 예제,");
        tuto.println("인터페이스의 맴버는 반드시 public이다.");
    }
    //    abstract vs interface
    //    인터페이스와 추상 클래스는 서로 비슷한 듯 다른 기능이다. 인터페이스는 클래스가 아닌 인터페이스라는 고유한 형태를 가지고 있는 반면
    //    추상 클래스는 일반적인 클래스다. 또 인터페이스는 구체적인 로직이나 상태를 가지고 있을 수 없고, 추상 클래스는 구체적인 로직이나 상태를
    //    가지고 있을 수 있다.

    // Polymorphism ( 다형성이란 하나의 메소드나 클래스가 있을 때 이것들이 다양한 방법으로 동작하는 것을 의미
    public static void tuto_67() {
        tuto_67_sub(5);tuto_67_sub(3.14);
        Tuto_67_Calculator_sub tuto1 = new Tuto_67_Calculator();
        tuto1.print();//Calculator_print
        //tuto1.test();// 실행 안됨
        Tuto_67_Interface tuto2 = new Tuto_67_Calculator();
        //tuto2.print();//실행 안됨
        tuto2.test();// test
    }
    public static void tuto_67_sub(int a) {
        System.out.println("정수형 매개변수 출력" + a);
    }
    public static void tuto_67_sub(double a) {
        System.out.println("실수형 매개변수 출력" + a);
    }
    //  Exception , 예외
    public static void tuto_68() {
        tuto_68_sub1(3,0);
        tuto_68_sub1(1,0);
        tuto_68_sub1(2,1);
        //--------------------------
        try {
            tuto_68_sub2("tuto_47");
        } catch (FileNotFoundException e) {
            System.out.println("tuto_48.txt 파일은 설정 파일 입니다. 이 파일이 프로잭트 루트 디렉토리에 존재해야 합니다.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //--------------------------
        int a,b;
        a = 10;
        b = 0;
        if (b==0){throw new ArithmeticException("0으로 나누는 것은 허용되지 않습니다.");}
        tuto_68_sub1(a,b);

    }
    public static void tuto_68_sub1(int a , int b) {
        int[] arr = new int[3];
        arr[0]=0;
        arr[1]=10;
        arr[2]=20;
        try {
            System.out.print("계산결과는 ");
            System.out.print(arr[a]/arr[b]);
            System.out.print(" 입니다.");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch(ArithmeticException e){
            System.out.println("ArithmeticException");
        } catch(Exception e){
            System.out.println("\n\ne.getMessage()\n"+e.getMessage());
            System.out.println("\n\ne.toString()\n"+e.toString());
            System.out.println("\n\ne.printStackTrace()");
            e.printStackTrace();
        } finally {
            //예외와 상관없이 실행되는 로직
            System.out.println("finally");
            //예외와 상관없이 try 내의 구문이 실행되면 finally가 실행된다
        }
    }
    public static void tuto_68_sub2(String name) throws IOException, FileNotFoundException {
        //예외가 발생하면 이에 대한 처리를 최종 사용자에게 위임함
        BufferedReader bReader = null;
        String input = null;
        bReader = new BufferedReader(new FileReader(name+".txt"));
        input = bReader.readLine();
        System.out.println(input);
    }
    public static void tuto_69(){
        try {
            throw new IOException();
        } catch (IOException e) {
            System.out.println("test");
            e.printStackTrace();
        }
    }
    public static void tuto_70(){

        try {
            throw new Tuto_70_Calculator("test");
        } catch (Tuto_70_Calculator e) {
            System.out.println("test");
            e.printStackTrace();
        }
    }
    // 상속
    // class O {} == class O extends Object {}
    public static void tuto_71(){
        Tuto_55_Calculator tuto1 = new Tuto_55_Calculator();
        Tuto_55_Calculator tuto2 = new Tuto_55_Calculator();
        tuto1.setOprands(3,5);
        tuto2.setOprands(3,5);
        System.out.println(tuto1.toString());
        System.out.println(tuto2.toString());
        System.out.println(tuto1 == tuto2);
        System.out.println(tuto1.equals(tuto2));
        Tuto_71_Calculator tuto3 = new Tuto_71_Calculator();
        Tuto_71_Calculator tuto4 = new Tuto_71_Calculator();
        tuto3.setOprands(3,5);
        tuto4.setOprands(3,5);
        System.out.println(tuto3.toString());
        System.out.println(tuto4.toString());
        System.out.println(tuto3 == tuto4);
        System.out.println(tuto3.equals(tuto4));
    }
    // finalize 객체가 소멸될 때 호출되기로 약속된 메소드 , 자동으로 해준다
    // clone
    public static void tuto_72(){
        Tuto_72_Calculator tuto1 = new Tuto_72_Calculator("default_name");
        try {
            Tuto_72_Calculator tuto2 = (Tuto_72_Calculator)tuto1.clone();
            System.out.println(tuto1.name);
            System.out.println(tuto2.name);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
    // 상수
    interface I_FRUIT{
        int APPLE=1, PEACH=2, BANANA=3;
    }
    interface I_COMPANY{
        int GOOGLE=1, APPLE=2, ORACLE=3;
    }
    public static void tuto_73(){
        int type = I_FRUIT.APPLE;
        switch(type){
            case I_FRUIT.APPLE:
                System.out.println(57+" kcal");
                break;
            case I_FRUIT.PEACH:
                System.out.println(34+" kcal");
                break;
            case I_FRUIT.BANANA:
                System.out.println(93+" kcal");
                break;
        }
//        if(C_Fruit.APPLE == C_Company.APPLE){
//            System.out.println("과일 애플과 회사 애플이 같다.");
//        }// 오류 발생  서로 다른 카테고리의 상수에 대해서는 비교조차 금지
    }
    enum E_Fruit{
        APPLE("red"), PEACH("pink"), BANANA("yellow");
        //public String color; //가능
        private String color;
        E_Fruit(String color){
            System.out.println("Call Constructor "+this);
            this.color = color;
        }
        String getColor(){
            return this.color;
        }
    }
    enum E_Company{
        GOOGLE, APPLE, ORACLE;
    }
    public static void tuto_74(){
        E_Fruit type = E_Fruit.APPLE;
        switch(type){
            case APPLE:
                //System.out.println(57+" kcal, "+E_Fruit.APPLE.color);
                System.out.println(57+" kcal, "+E_Fruit.APPLE.getColor());
                break;
            case PEACH:
                //System.out.println(34+" kcal"+E_Fruit.PEACH.color);
                System.out.println(34+" kcal"+E_Fruit.PEACH.getColor());
                break;
            case BANANA:
                //System.out.println(93+" kcal"+E_Fruit.BANANA.color);
                System.out.println(93+" kcal"+E_Fruit.BANANA.getColor());
                break;
        }
        for(E_Fruit f : E_Fruit.values()){
            System.out.println(f+", "+f.getColor());
        }
    }

}
class C_Fruit{
    public static final C_Fruit APPLE  = new C_Fruit();
    public static final C_Fruit PEACH  = new C_Fruit();
    public static final C_Fruit BANANA = new C_Fruit();
}
class C_Company{
    public static final C_Company GOOGLE = new C_Company();
    public static final C_Company APPLE = new C_Company();
    public static final C_Company ORACLE = new C_Company();
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
class Tuto_62_Calculator {
    private int age;
    public Boolean sex = true;
    Tuto_62_Calculator(int age){this.age = age;}
    public int getAge(){return age;}
}
abstract class Tuto_64_Calculator{
    public abstract int abFun();
    public void basicFun(){
        System.out.println("world");
    }
}
class Tuto_64_Calculator_Sub extends Tuto_64_Calculator{
    public int abFun(){return 1;}
}
final class Tuto_65_Calculator{
    static final double PI = 3.14;
    int left, right;
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
        //Tuto_65_Calculator.PI = 6;
    }
    public void sum() {
        System.out.println(this.left + this.right);
    }
    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
    final public double getPi(){return Tuto_65_Calculator.PI;}
}
//class Tuto_65_Calculator_Sub extends Tuto_65_Calculator{
//  double getPi(){return Tuto_65_Calculator.PI+3;}
//}
interface Tuto_66_Interface_1{
    public void print(String txt);
}
interface Tuto_66_Interface_2{
    public void println(String txt);
}
interface Tuto_66_Interface_3 extends Tuto_66_Interface_2{
    public void printA();
}
class Tuto_66_Calculator implements Tuto_66_Interface_1,Tuto_66_Interface_3{
    public void print(String txt){
        System.out.print(txt);
    }
    public void println(String txt){
        System.out.println(txt);
    }
    public void printA(){
        System.out.println('A');
    }
}
class Tuto_67_Calculator_sub {
    public void print(){System.out.println("sub_print");}
}

interface Tuto_67_Interface{
    public void test();
}
class Tuto_67_Calculator extends Tuto_67_Calculator_sub implements Tuto_67_Interface{
    public void print(){System.out.println("Calculator_print");}
    public void test(){System.out.println("test");}
}
class Tuto_70_Calculator extends RuntimeException {
    Tuto_70_Calculator(){
        super();
    }
    Tuto_70_Calculator(String message){
        super(message);
    }
}
class Tuto_71_Calculator extends Tuto_55_Calculator {
    public String toString(){
        return "left : " + this.left + ", right : "+ this.right;
    }
    public boolean equals(Object obj) {
        Tuto_71_Calculator _obj = (Tuto_71_Calculator)obj;
        return (left == _obj.left)&&(right == _obj.right);
    }
}
class Tuto_72_Calculator implements Cloneable {
    String name;
    Tuto_72_Calculator(String name){
        this.name = name;
    }
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}