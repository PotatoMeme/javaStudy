package com.company;

import java.util.HashMap;
import java.util.Map;

public class TestingApi {
    public void split_exam() {
        String test1 = "this is a word";
        String test2 = "한글 test";
        char[] test_arr = new char[test1.length()];
        String[] test1_arr = test1.split("");
        String[] test2_arr = test2.split("");

        for(int i=0;i<test1.length();i++){
            test_arr[i]=test1.charAt(i);
        }
        for(String i : test1_arr){
            System.out.print(i+" ");
        }
        System.out.println("\n");
        for(String i : test2_arr){
            System.out.print(i+" ");
        }

    }

    public void hashmap_exam() {
        //참고 : https://coding-factory.tistory.com/556
        //import java.util.HashMap;
        //HashMap 선언
        HashMap<Integer,String> map = new HashMap<>();//new에서 타입 파라미터 생략가능
        HashMap<String, String> map1 = new HashMap<String, String>();//HashMap생성
        HashMap<String, String> map2 = new HashMap<>();//new에서 타입 파라미터 생략가능
        HashMap<String, String> map3 = new HashMap<>(map1);//map1의 모든 값을 가진 HashMap생성
        HashMap<String, String> map4 = new HashMap<>(10);//초기 용량(capacity)지정
        HashMap<String, String> map5 = new HashMap<>(10, 0.7f);//초기 capacity,load factor지정
        HashMap<String, String> map6 = new HashMap<String, String>() {{//초기값 지정
            put("a", "b");
        }};

        //HashMap 값 추가
        map.put(1,"사과"); //값 추가
        map.put(2,"바나나");
        map.put(3,"포도");

        //HashMap 값 삭제
        map.remove(1); //key값 1 제거
        map.clear(); //모든 값 제거

        //HashMap 값 출력
        System.out.println(map); //전체 출력 : {1=사과, 2=바나나, 3=포도}
        System.out.println(map.get(1));//key값 1의 value얻기 : 사과

        //entrySet() 활용
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("[Key]:" + entry.getKey() + " [Value]:" + entry.getValue());
        }
        //[Key]:1 [Value]:사과
        //[Key]:2 [Value]:바나나
        //[Key]:3 [Value]:포도

        //KeySet() 활용
        for(Integer i : map.keySet()){ //저장된 key값 확인
            System.out.println("[Key]:" + i + " [Value]:" + map.get(i));
        }
        //[Key]:1 [Value]:사과
        //[Key]:2 [Value]:바나나
        //[Key]:3 [Value]:포도
    }
}
