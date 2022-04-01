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

    public void func16() {
        //다음은 Calculator 클래스와 그 사용법을 담은 코드이다.
        /*class Calculator {
            int value;

            Calculator() {
                this.value = 0;
            }

            void add(int val) {
                this.value += val;
            }

            int getValue() {
                return this.value;
            }
        }

        public class Sample {
            public static void main(String[] args) {
                Calculator cal = new Calculator();
                cal.add(10);
                System.out.println(cal.getValue());  // 10 출력
            }
        }*/
        //Calculator 클래스를 상속하는 UpgradeCalculator를 만들고 값을
        //뺄 수 있는 minus 메서드를 추가해 보자. 즉 다음과 같이 동작하는
        // 클래스를 만들어야 한다.
        //UpgradeCalculator cal = new UpgradeCalculator();
        //cal.add(10);
        //cal.minus(3);
        //System.out.println(cal.getValue());  // 10에서 3을 뺀 '7'을 출력
        UpgradeCalculator cal = new UpgradeCalculator();
        cal.add(10);
        cal.minus(3);
        System.out.println(cal.getValue());
    }

    public void func17() {
        //객체변수 value가 100 이상의 값은 가질 수 없도록 제한하는
        // MaxLimitCalculator 클래스를 만들어 보자. 즉 다음과 같이
        // 동작해야 한다.
        /*MaxLimitCalculator cal = new MaxLimitCalculator();
        cal.add(50);  // 50 더하기
        cal.add(60);  // 60 더하기
        System.out.println(cal.getValue());  // 100 출력*/
        // 단 MaxLimitCalculator 클래스는 반드시 다음의 Calculator
        // 클래스를 상속해서 만들어야 한다.
        MaxLimitCalculator cal = new MaxLimitCalculator();
        cal.add(50);  // 50 더하기
        cal.add(60);  // 60 더하기
        System.out.println(cal.getValue());
    }

    public void func18() {
        //다음의 클래스에 주어진 정수가 홀수인지 짝수인지 판별해 주는
        // 메서드(isOdd)를 추가해 보자. (홀수이면 true, 짝수면 false를
        // 리턴해야 한다.)
        Calculator cal = new Calculator();
        System.out.println(cal.isOdd(15));
        System.out.println(cal.isOdd(30));
    }

    public void func19() {
        //다음 클래스에 정수 배열 또는 정수의 리스트 입력시 그 평균값을 구해
        // 정수로 리턴하는 avg 메서드를 추가해 보자.

        //정수 배열을 사용한 예는 다음과 같다.
        /*int[] data = {1, 3, 5, 7, 9};
        Calculator cal = new Calculator();
        int result = cal.avg(data);
        System.out.println(result);  // 5 출력*/

        //정수 리스트를 사용한 예는 다음과 같다.
        /*ArrayList<Integer> data = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
        Calculator cal = new Calculator();
        int result = cal.avg(data);
        System.out.println(result);  // 5 출력*/

        Calculator cal = new Calculator();

        int[] data1 = {1, 3, 5, 7, 9};
        int result = cal.avg(data1);
        System.out.println(result);

        ArrayList<Integer> data2 = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
        result = cal.avg(data2);
        System.out.println(result);
    }

    public void func20() {
        //다음 프로그램의 출력결과를 예측하고 그 이유에 대해서 설명하시오.
        /*ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> b = a;
        a.add(4);
        System.out.println(b.size());*/

        // 결과적으로 4가 출력된다 그이유는 b선언시 a라는 값을 b에게 주었는데 이때
        // a의 요소가아닌 a의 주소값을 주었기때문에 a의 값을 바꿀경우 b도 바뀌게 된다
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> b = a;
        a.add(4);
        System.out.println(b.size());
    }

    public void func21() {
        //다음은 Calculator 객체를 생성하고 값을 더한 후에 그 결과값을 출력하는 예제이다.
        // 하지만 코드를 실행하면 오류가 발생한다. Calculator 클래스를 수정하여 다음의
        // 코드에서 오류가 발생하지 않도록 하시오.
        /*class Calculator {
            Integer value;
            void add(int val) {
                this.value += val;
            }

            public Integer getValue() {
                return this.value;
            }
        }

        public class Sample {
            public static void main(String[] args) {
                Calculator cal = new Calculator();
                cal.add(3);  // 여기서 NullPointerException 이 발생한다.
                System.out.println(cal.getValue());
            }
        }*/
        // value값이 없어서 생기는 오류 생성자를 만들어주면 오류는 해결됩니다.
        Calculator cal = new Calculator();
        cal.add(3);
        System.out.println(cal.getValue());
    }
    public void func22() {
        //다음은 광물의 가치를 계산하는 MineralCalculator 클래스와 그 사용법이
        // 담긴 코드이다. 광물 계산기는 금인 경우 100, 은인 경우 90, 구리의 경우는
        // 80의 가치를 더하는 기능(add 메스드)이 있다.
        /*class Gold {
        }

        class Silver {
        }

        class Bronze {
        }

        class MineralCalculator {
            int value = 0;

            public void add(Gold gold) {
                this.value += 100;
            }

            public void add(Silver silver) {
                this.value += 90;
            }

            public void add(Bronze bronze) {
                this.value += 80;
            }

            public int getValue() {
                return this.value;
            }
        }

        public class Sample {
            public static void main(String[] args) {
                MineralCalculator cal = new MineralCalculator();
                cal.add(new Gold());
                cal.add(new Silver());
                cal.add(new Bronze());
                System.out.println(cal.getValue());  // 270 출력
            }
        }*/
        //하지만 이 광물 계산기는 광물이 추가될 때마다 add 메서드를 추가해야 한다는 단점이 있다.
        // 광물이 추가되더라도 MineralCalculator 클래스를 변경할 필요가 없도록 코드를 수정하시오.
        MineralCalculator cal = new MineralCalculator();
        cal.add(new Gold());
        cal.add(new Silver());
        cal.add(new Bronze());
        System.out.println(cal.getValue());
    }
    public void func23() {
        // 다음의 코드를 보고 1번, 2번, 3번, 4번, 5번 문장 중에서 오류가 발생하는
        // 문장을 모두 찾고 오류의 원인에 대해서 설명하시오.
        /*interface Predator {
        }

        class Animal {
        }

        class Dog extends Animal {
        }

        class Lion extends Animal implements Predator {
        }

        public class Sample {
            public static void main(String[] args) {
                Animal a = new Animal();  // 1번
                Animal b = new Dog();  // 2번
                Animal c = new Lion();  // 3번
                Dog d = new Animal();  // 4번
                Predator e = new Lion();  // 5번
            }
        }*/
        //4번 문장에서 오류가 발생한다. Dog 클래스는 Animal의 자식 클래스로 IS-A 관계가
        // 성립될 수 없기 때문이다. 나머지는 모두 IS-A 관계가 성립한다.
    }
    public void func24() {
        //다음의 코드를 보고 1번, 2번, 3번, 4번, 5번, 6번 문장 중에서 오류가 발생하는
        // 문장을 모두 찾고 오류의 원인에 대해서 설명하시오.
        /*interface Predator {
            String bark();
        }

        abstract class Animal {
            public String hello() {
                return "hello";
            }
        }

        class Dog extends Animal {
        }

        class Lion extends Animal implements Predator {
            public String bark() {
                return "Bark bark!!";
            }
        }

        public class Sample {
            public static void main(String[] args) {
                Animal a = new Lion();
                Lion b = new Lion();
                Predator c = new Lion();

                System.out.println(a.hello());  // 1번
                System.out.println(a.bark());   // 2번
                System.out.println(b.hello());  // 3번
                System.out.println(b.bark());   // 4번
                System.out.println(c.hello());  // 5번
                System.out.println(c.bark());   // 6번
            }
        }*/
        //2번 a 객체가 Animal 타입으로 생성되었기 때문에 Animal 타입의 객체는 hello 메서드만 사용이 가능
        //5번  c 객체가 Predator 타입으로 생성되었기 때문에 Predator 타입의 객체는 bark 메서드만 사용이 가능
    }
}

class Calculator {
    int value;

    Calculator() {
        this.value = 0;
    }

    void add(int val) {
        this.value += val;
    }

    int getValue() {
        return this.value;
    }

    boolean isOdd(int val) {
        return val % 2 == 1 ? true : false;
    }

    int avg(int[] data) {
        return Arrays.stream(data).sum() / data.length;
    }

    int avg(ArrayList<Integer> data) {
        int sum = 0;
        for (int i : data) {
            sum += i;
        }
        return sum / data.size();
    }
}

class UpgradeCalculator extends Calculator {
    void minus(int val) {
        this.value -= val;
    }
}

class MaxLimitCalculator extends Calculator {
    void add(int val) {
        this.value += val;
        value = value > 100 ? 100 : value;
    }
}
interface Mineral {
    int getValue();
}
class Gold implements Mineral{
    public int getValue(){return 100;};
}

class Silver implements Mineral{
    public int getValue(){return 90;};
}

class Bronze implements Mineral{
    public int getValue(){return 80;};
}

class MineralCalculator {
    int value = 0;

    public void add(Mineral mineral) {
        this.value += mineral.getValue();
    }

    public int getValue() {
        return this.value;
    }
}