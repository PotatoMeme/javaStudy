package com.potatomeme.may.week_2nd;

import java.io.*;

public class solution2744 {
    //대소문자 바꾸기
    {//문제
    /*영어 소문자와 대문자로 이루어진 단어를 입력받은 뒤, 대문자는 소문자로, 소문자는 대문자로 바꾸어 출력하는 프로그램을 작성하시오.

    입력
    첫째 줄에 영어 소문자와 대문자로만 이루어진 단어가 주어진다. 단어의 길이는 최대 100이다.

    출력
    첫째 줄에 입력으로 주어진 단어에서 대문자는 소문자로, 소문자는 대문자로 바꾼 단어를 출력한다.

    예제 입력 1
    WrongAnswer
    예제 출력 1
    wRONGaNSWER
    */
    }

    public void solution2744() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] word = br.readLine().toCharArray();
        for (char i : word) {
            if (i > 96) {
                bw.write(i - 32);
            } else {
                bw.write(i + 32);
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

}
