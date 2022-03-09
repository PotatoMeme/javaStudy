package com.company;

public class BasicFunc {
    // 숫자와 문자
    public static void  tuto_01(){
        System.out.println("Hellow world");
    }
    public static void  tuto_02(){
        System.out.println(1+2);//3
    }
    public static void  tuto_03(){
        System.out.println(1.2+1.3);//2.5
    }
    public static void  tuto_04(){
        System.out.println(6/2);//3
    }
    public static void  tuto_05(){
        System.out.println('생');//생
    }
    public static void  tuto_06(){
        System.out.println("생활코딩");//생활코딩
        //System.out.println('생활코딩');
    }
    public static void  tuto_07(){
        System.out.println("생");//생
    }
    public static void  tuto_08(){
        System.out.println("egoing said \"Welcome programming world\"");
        //egoing said "Welcome programming world"
    }
    public static void  tuto_09(){
        System.out.println("HTML\nCSS\nJavaScript\n");
        //HTML
        //CSS
        //JavaScript
    }
    public static void  tuto_10(){
        System.out.println("생활"+"코딩");//생활코딩
    }
    // 변수
    public static void  tuto_11(){
        int a;
        a = 1;
        System.out.println(a+1); //2

        a = 2;
        System.out.println(a+1); //3
    }
    public static void  tuto_12(){
        double a = 1.1;
        System.out.println(a+1.1); // 2.2

        a = 2.1;
        System.out.println(a+1.1); // 3.2
    }
    public static void  tuto_13(){
        int a = (int) 1.1;
        System.out.println(a+1.1);// 2.1
    }
    public static void  tuto_14(){
        String first = "coding";
        System.out.println(first+" "+"everybody");// coding everybody
    }
    public static void  tuto_15(){
        String a, b;
        a = "coding";
        b = " everybody";
        System.out.println(a+b);// coding everybody
    }
    public static void  tuto_16(){
        System.out.println(100 + 10); // 110
        System.out.println((100 + 10) / 10); // 11
        System.out.println(((100 + 10) / 10) - 10); // 1
        System.out.println((((100 + 10) / 10) - 10) * 10); // 10
    }
    public static void  tuto_17(){
        int a = 100;
        System.out.println(a + 10); // 110
        System.out.println((a+ 10) / 10); // 11
        System.out.println(((a + 10) / 10) - 10); // 1
        System.out.println((((a + 10) / 10) - 10) * 10); // 10
    }
    // 주석과 세미콜론
    public static void  tuto_18(){
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

}
