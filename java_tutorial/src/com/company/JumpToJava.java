package com.company;

public class JumpToJava {
    // 링크
    // https://wikidocs.net/book/31
    public void func01() {
        double d2 = 1.234e2;
        int octal = 023;    // 십진수: 19
        int hex = 0xC;     // 십진수: 12

        System.out.println(d2);
        System.out.println(octal);
        System.out.println(0xC);
    }

    public void func02() {
        char a1 = 'a';  // 문자로 표현
        char a2 = 97;  // 아스키코드로 표현
        char a3 = '\u0061';  // 유니코드로 표현

        System.out.println(a1);  // a 출력
        System.out.println(a2);  // a 출력
        System.out.println(a3);  // a 출력
    }

    public void func03() {
        String a = "Happy Java"; // String a = new String("Happy Java");
        String b = "a"; // String b = new String("a");
        String c = "123"; // String c = new String("123");
        String d = "Happy Java";
        // equals : equals는 두개의 문자열이 동일한지를 비교하여 결과값을 리턴한다.
        System.out.println(a.equals(b)); // false 출력
        System.out.println(a.equals(d)); // true 출력
        // indexOf : indexOf는 문자열에서 특정 문자가 시작되는 위치(인덱스)를 리턴한다.
        System.out.println(a.indexOf("Java"));  // 6 출력
        // contains : contains는 문자열에서 특정 문자열이 포함되어 있는지의 여부를 리턴한다.
        System.out.println(a.contains("Java"));  // true 출력
        // charAt : charAt은 문자열에서 특정 위치의 문자(char)를 리턴한다.
        System.out.println(a.charAt(6));  // "J" 출력
        // replaceAll : replaceAll은 문자열 중 특정 문자열을 다른 문자열로 바꾸고자 할 때 사용한다.
        System.out.println(a.replaceAll("Java", "World"));  // Happy World 출력
        // substring : substring은 문자열 중 특정 부분을 뽑아낼 경우에 사용한다.
        // 시작위치 <= a < 끝위치
        System.out.println(a.substring(0, 4));  // Happ 출력
        // toUpperCase : toUpperCase는 문자열을 모두 대문자로 변경할 때 사용한다. (모두 소문자로 변경할때는 toLowerCase를 사용한다.)
        System.out.println(a.toUpperCase());  // HAPPY JAVA 출력
        // split : split 메소드는 문자열을 특정 구분자로 분리하는 메소드이다.
        String e = "a:b:c:d";
        String[] result = e.split(":");  // result는 {"a", "b", "c", "d"}
    }
    public void func04() {
        System.out.println(String.format("I eat %d apples.", 3));  // "I eat 3 apples." 출력
        System.out.println(String.format("I eat %s apples.", "five"));  // "I eat five apples." 출력
        int number = 10;
        String day = "three";
        // "I ate 10 apples. so I was sick for three days." 출력
        System.out.println(String.format("I ate %d apples. so I was sick for %s days.", number, day));
        // %s	문자열(String)
        // %c	문자 1개(character)
        // %d	정수(Integer)
        // %f	부동소수(floating-point)
        // %o	8진수
        // %x	16진수
        // %%	Literal % (문자 % 자체)
        System.out.println(String.format("I have %s apples",  3));  // "I have 3 apples" 출력
        System.out.println(String.format("rate is %s", 3.234));  // "rate is 3.234" 출력
        System.out.println(String.format("%10s", "hi"));  // "        hi" 출력
        System.out.println(String.format("%-10sjane.", "hi"));  // "hi        jane." 출력
        System.out.println(String.format("%10.4f", 3.42134234));  // '    3.4213' 출력
        System.out.printf("I eat %d apples.\n", 3);  // "I eat 3 apples." 출력
    }
}
