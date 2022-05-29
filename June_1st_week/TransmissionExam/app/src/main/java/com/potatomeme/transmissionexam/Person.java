package com.potatomeme.transmissionexam;

import java.io.Serializable;

public class Person implements Serializable {
    // 데이터 객체를 넘겨주기 위해서는 값이 변경될 수 있는 멤버 변수들을 연속된 메모리에 할당된 형태인 직렬화 형태로 변경해야함
    // Serializable 인터페이스는 마커 인터페이스(Marker Interface)로 단순히 시스템에 내부의 멤버 변수들을 직렬화하여 객체를 생성해야 한다고 알리는 용도

    private static final long serialVersionUID = 1L;// 직렬화된 클래스의 버전
    // 객체를 전달하는 측과 해당 객체를 수신하는 측에서 사용하는 클래스 파일이 동일한지 체크하는 용도

    private String name;
    private int age;

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getName()
    {
        return this.name;
    }

    public int getAge()
    {
        return this.age;
    }
}
