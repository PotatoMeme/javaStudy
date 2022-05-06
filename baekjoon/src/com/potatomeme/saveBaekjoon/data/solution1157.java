package com.potatomeme.saveBaekjoon.data;

import java.io.*;
import java.util.StringTokenizer;

public class solution1157 {
    //1157
    {/*문제
    알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.

    입력
    첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.

    출력
    첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.

    예제 입력 1
    Mississipi
    예제 출력 1
    ?
    예제 입력 2
    zZa
    예제 출력 2
    Z
    예제 입력 3
    z
    예제 출력 3
    Z
    예제 입력 4
    baaa
    예제 출력 4
    A
    */
    }

    public void solution1157() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine().toLowerCase();
        int[] list = new int['z' - 'a' + 1];
        for (int i = 0; i < str.length(); i++) {
            list[str.charAt(i) - 'a']++;
        }
        int max = -1;
        char c = '?';
        for (int i = 0; i < list.length; i++) {
            if (list[i] > max) {
                max = list[i];
                c = (char) (i + 65);
            } else if (list[i] == max) {
                c = '?';
            }
        }
        bw.write(c + "");
        br.close();
        bw.flush();
        bw.close();
    }
}
