package com.company;

import java.util.*;

public class PracticeTest {
    // 링크
    // https://wikidocs.net/157658
    public void func01() {
        // 홍길동 씨의 과목별 점수는 다음과 같다.
        // 홍길동 씨의 평균 점수를 구해 보자.

        // 과목	점수
        // 국어	80
        // 영어	75
        // 수학	55
        System.out.println(((double) 80 + 75 + 55) / 3);
    }

    public void func02() {
        // 자연수 13이 홀수인지 짝수인지 판별할 수 있는 방법에 대해 말해 보자.
        String result = 13 % 2 == 1 ? "홀수" : "짝수";
        System.out.println(result);

    }

    public void func03() {
        // 홍길동 씨의 주민등록번호는 881120-1068234이다. 홍길동 씨의 주민등록번호를
        // 연월일(YYYYMMDD) 부분과 그 뒤의 숫자 부분으로 나누어 출력해 보자.
        // ※ 문자열의 substring을 사용해 보자.
        System.out.println("881120-1068234".substring(0, 6));
        System.out.println("881120-1068234".substring(7, 14));
    }

    public void func04() {
        // 주민등록번호 뒷자리의 맨 첫 번째 숫자는 성별을 나타낸다.
        // 주민등록번호에서 성별을 나타내는 숫자를 출력해 보자.
        String pin = "881120-1068234";
        String sex = pin.substring(7, 8).equals("1") ? "남자" : "여자";
        System.out.println(sex);
    }

    public void func05() {
        // 다음과 같은 문자열 a:b:c:d가 있다. 문자열의 replace 함수를 사용하여 a#b#c#d로 바꿔서 출력해 보자.
        String a = "a:b:c:d".replace(":", "#");
        System.out.println(a);
    }

    public void func06() {
        // 다음과 같은 [1, 3, 5, 4, 2] 리스트를 [5, 4, 3, 2, 1]로 만들어 보자.
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1, 3, 5, 4, 2));
        System.out.println(myList); // [1, 3, 5, 4, 2] 출력
        myList.sort(Comparator.reverseOrder());
        System.out.println(myList);
    }

    public void func07() {
        // 다음과 같은 ['Life', 'is', 'too', 'short'] 리스트를 "Life is too short" 문자열로 만들어 출력해 보자.
        ArrayList<String> myList = new ArrayList<>(Arrays.asList("Life", "is", "too", "short"));
        System.out.println(myList); // [Life, is, too, short] 출력
        System.out.println(String.join(" ", myList));
    }

    public void func08() {
        // 다음의 맵 grade에서 "B'에 해당되는 값을 추출해 보자. (추출하고 나면 grade에는 "B"에 해당하는 아이템이 사라져야 한다.)
        HashMap<String, Integer> grade = new HashMap<>();
        grade.put("A", 90);
        grade.put("B", 80);
        grade.put("C", 70);
        System.out.println(grade.remove("B"));
    }

    public void func09() {
        // 다음의 numbers 리스트에서 중복 숫자를 제거해 보자.
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5));
        System.out.println(numbers);  // [1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5] 출력
        HashSet<Integer> set = new HashSet<>(numbers);
        numbers = new ArrayList<>(set);
        System.out.println(numbers);
    }

    enum CoffeeType {
        AMERICANO,
        ICE_AMERICANO,
        CAFE_LATTE
    }

    ;

    static void printCoffeePrice(CoffeeType type) {
        HashMap<CoffeeType, Integer> priceMap = new HashMap<>();
        priceMap.put(CoffeeType.AMERICANO, 3000);  // 1: 아메리카노
        priceMap.put(CoffeeType.ICE_AMERICANO, 4000);  // 2: 아이스 아메리카노
        priceMap.put(CoffeeType.CAFE_LATTE, 5000);  // 3: 카페라떼
        int price = priceMap.get(type);
        System.out.println(String.format("가격은 %d원 입니다.", price));
    }

    public void func10() {
        // 다음은 커피의 종류(1: 아메리카노, 2:아이스 아메리카노, 3:카페라떼)를
        // 입력하면 커피의 가격을 알려주는 프로그램이다.
        // 위 메소드에서 1, 2, 3과 같은 매직넘버를 제거하여 프로그램을 개선해보자.

        printCoffeePrice(CoffeeType.AMERICANO);  // "가격은 3000원 입니
    }

    public void func11() {
        String a = "write once, run anywhere";
        if (a.contains("wife")) {
            System.out.println("wife");
        } else if (a.contains("once") && !a.contains("run")) {
            System.out.println("once");
        } else if (!a.contains("everywhere")) {
            System.out.println("everywhere");//  출력
        } else if (a.contains("anywhere")) {
            System.out.println("anywhere");
        } else {
            System.out.println("none");
        }
    }

    public void func12() {
        // while문을 사용해 1부터 1000까지의 자연수 중 3의 배수의 합을 구해 보자.
        int i = 1;
        int sum = 0;
        while (i <= 1000) {
            sum += i % 3 == 0 ? i : 0;
            i++;
        }
        System.out.println(sum);
    }

    public void func13() {
        // while문 또는 for 문을 사용하여 다음과 같이 별(*)을 표시하는 프로그램을 작성해 보자.

        // *
        // **
        // ***
        // ****
        // *****
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) System.out.print('*');
            System.out.println();
        }
    }

    public void func14() {
        // for문을 사용해 1부터 100까지의 숫자를 출력해 보자.
        for (int i = 1; i <= 100; i++) System.out.println(i);
    }

    public void func15() {
        // A 학급에 총 10명의 학생이 있다. 이 학생들의 중간고사 점수는 다음과 같다.
        int[] marks = {70, 60, 55, 75, 95, 90, 80, 80, 85, 100};
        // for each 문을 사용하여 A 학급의 평균 점수를 구해 보자.
        int sum = 0;
        for (int i : marks) sum += i;
        System.out.println((double) sum / marks.length);
    }
}
