package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

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
        System.out.println(String.format("I have %s apples", 3));  // "I have 3 apples" 출력
        System.out.println(String.format("rate is %s", 3.234));  // "rate is 3.234" 출력
        System.out.println(String.format("%10s", "hi"));  // "        hi" 출력
        System.out.println(String.format("%-10sjane.", "hi"));  // "hi        jane." 출력
        System.out.println(String.format("%10.4f", 3.42134234));  // '    3.4213' 출력
        System.out.printf("I eat %d apples.\n", 3);  // "I eat 3 apples." 출력
    }

    public void func05() {
        // StringBuffer는 문자열을 추가하거나 변경 할 때 주로 사용하는 자료형
        // append
        StringBuffer sb = new StringBuffer();  // StringBuffer 객체 sb 생성
        sb.append("hello");
        sb.append(" ");
        sb.append("jump to java");
        String result = sb.toString();
        System.out.println(sb);
        System.out.println(result);
        // 문자열 추가나 변경등의 작업이 많을 경우에는 StringBuffer를, 문자열 변경 작업이 거의 없는 경우에는 그냥 String을 사용하는 것이 유리하다.
        // StringBuffer는 멀티 스레드 환경에서 안전하다는 장점이 있고 StringBuilder는 StringBuffer보다 성능이 우수한 장점이 있다.
        // 따라서 동기화를 고려할 필요가 없는 상황에서는 StringBuffer 보다는 StringBuilder를 사용하는 것이 유리하다.
        // insert : 특정 위치에 원하는 문자열을 삽입할 수 있음
        sb.insert(0, "hello ");
        System.out.println(sb.toString());
        // substring 메소드는 String 자료형의 substring 메소드와 동일하게 사용된다.
        System.out.println(sb.substring(0, 4)); // hell
    }

    public void func06() {
        int[] odds = {1, 3, 5, 7, 9};
        String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};
        // String[] weeks = new String[7];
        // weeks[0] = "월";
        // weeks[1] = "화";
        // weeks[2] = "수";
        // weeks[3] = "목";
        // weeks[4] = "금";
        // weeks[5] = "토";
        // weeks[6] = "일";
        //String[] weeks = new String[];    // 길이에 대한 숫자값이 없으므로 컴파일 오류가 발생한다.
        for (int i = 0; i < weeks.length; i++) {
            System.out.println(weeks[i]);
        }
        // ArrayIndexOutOfBoundsException
        // 범위 바깥의 인덱스값을 불러오려 할때
    }

    public void func07() {
        ArrayList pitches = new ArrayList();
        pitches.add("138");
        pitches.add("129");
        pitches.add("142");
        for (int i = 0; i < pitches.size(); i++) {
            System.out.println(pitches.get(i));
        }
        pitches.add(0, "133");    // 첫번째 위치에 133 삽입.
        System.out.println(pitches.get(0));
        System.out.println(pitches.contains("142"));
        System.out.println(pitches.remove("129"));//System.out.println(pitches.remove(1));
        for (int i = 0; i < pitches.size(); i++) {
            System.out.println(pitches.get(i));
        }
        System.out.println(pitches);
        System.out.println(pitches.toString().substring(0, 4));
    }

    public void func08() {
        ArrayList<String> pitches = new ArrayList<>();  // ArrayList<String> pitches = new ArrayList<String>();
        // ArrayList 안에 담을 수 있는 자료형은 String 타입 뿐이다
        // => 제네릭스 사용시 어떤 자료형도 사용할 수 있다.
        //  제네릭스를 사용하지 않을 경우에는 ArrayList
        //  안에 추가되는 객체는 Object 자료형으로 인식된다.
        ArrayList aList = new ArrayList();
        aList.add("138");
        aList.add("129");
        String one = (String) aList.get(0);
        // String one = aList.get(0); // 형변환 안하면 에러 발생
        pitches.add("138");
        pitches.add("129");
        one = pitches.get(0);  // 형 변환이 필요없다.
        String two = pitches.get(1);  // 형 변환이 필요없다.
        System.out.println(aList);  // [138, 129] 출력
        System.out.println(pitches);  // [138, 129] 출력
    }

    public void func09() {
        // 다양한 방법으로 ArrayList 만들기
        // 1 . ArrayList 객체에 요소를 추가
        // 2 . 이미 데이터가 존재할 경우
        String[] data = {"138", "129", "142"};  // 이미 투구수 데이터 배열이 있다.
        ArrayList<String> pitches = new ArrayList<>(Arrays.asList(data));
        // ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138", "129", "142"));
        System.out.println(pitches);  // [138, 129, 142] 출력

        // "138", "129", "142" 만들기
        // 방법1 무지성 반복문
        String result = "";
        for (int i = 0; i < pitches.size(); i++) {
            result += pitches.get(i);
            result += ",";  // 콤마를 추가한다.
        }
        result = result.substring(0, result.length() - 1);  // 마지막 콤마는 제거한다.
        System.out.println(result);  // 138,129,142 출력
        // 방법2 String.join 사용
        String result1 = String.join(",", pitches);
        System.out.println(result1);  // 138,129,142 출력
        // 문자열 배열에도 사용할 수 있다.
        String result2 = String.join(",", data);
        System.out.println(result2);  // 138,129,142 출력

        // 정렬하기 / Java 8 버전부터 가능 / 안드로이드 스튜디오도 가능
        // import java.util.Comparator; 선언
        pitches.sort(Comparator.naturalOrder());  // 오름차순(순)으로 정렬
        System.out.println(pitches);  // [129, 138, 142] 출력
        pitches.sort(Comparator.reverseOrder());  // 내림차순(역)으로 정렬
        System.out.println(pitches);  // [142, 138, 129] 출력
    }
    public void func10() {
        // Map은 리스트나 배열처럼 순차적으로(sequential) 해당 요소 값을
        // 구하지 않고 key를 통해 value를 얻는다. 맵(Map)의 가장 큰 특징
        // 이라면 key로 value를 얻어낸다는 점이다.

        // Map 역시 List와 마찬가지로 인터페이스이다. Map 인터페이스를 구현한
        // Map자료형에는 HashMap, LinkedHashMap, TreeMap등이 있다

        // HashMap
        HashMap<String, String> map = new HashMap<>();
        map.put("people", "사람");
        map.put("baseball", "야구");
        System.out.println(map.get("people"));
        // 맵의 key에 해당하는 value가 없을 경우에 get 메소드를 사용하면 다음처럼 null이 리턴된다
        System.out.println(map.get("java"));  // null 출력
        System.out.println(map.getOrDefault("java", "자바"));  // "자바" 출력
        System.out.println(map.containsKey("people"));  // true 출력
        // containsKey : 해당되는 아이템(key, value)을 삭제한 후 그 value 값을 리턴
        System.out.println(map.remove("people"));  // "사람" 출력
        System.out.println(map.size());
        map.put("people", "사람");

        System.out.println(map.keySet());  // [baseball, people] 출력
        ArrayList<String> keyList = new ArrayList<>(map.keySet());
        System.out.println(keyList);
    }
}
