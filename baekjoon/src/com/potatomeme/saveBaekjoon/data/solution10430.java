package com.potatomeme.saveBaekjoon.data;

import java.util.Scanner;

public class solution10430 {
    //10430
    {/*문제
    (A+B)%C는 ((A%C) + (B%C))%C 와 같을까?

    (A×B)%C는 ((A%C) × (B%C))%C 와 같을까?

    세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.

    입력
    첫째 줄에 A, B, C가 순서대로 주어진다. (2 ≤ A, B, C ≤ 10000)

    출력
    첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C, 셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.

    예제 입력 1
    5 8 4
    예제 출력 1
    1
    1
    0
    0*/
    }

    public void solution10430() {
        Scanner in = new Scanner(System.in);
        int A, B, C;
        A = in.nextInt();
        B = in.nextInt();
        C = in.nextInt();
        System.out.println((A + B) % C);
        System.out.println(((A % C) + (B % C)) % C);
        System.out.println((A * B) % C);
        System.out.println(((A % C) * (B % C)) % C);
    }
}
