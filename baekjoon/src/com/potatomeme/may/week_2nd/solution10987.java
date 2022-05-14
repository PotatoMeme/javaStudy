package com.potatomeme.may.week_2nd;

import java.io.*;
import java.util.StringTokenizer;

public class solution10987 {
    //모음의 개수
    {//문제
    /*알파벳 소문자로만 이루어진 단어가 주어진다. 이때, 모음(a, e, i, o, u)의 개수를 출력하는 프로그램을 작성하시오.

    입력
    첫째 줄에 단어가 주어진다. 단어의 길이는 1보다 크거나 같고, 100보다 작거나 같으며, 알파벳 소문자로만 이루어져 있다.

    출력
    첫째 줄에 모음의 개수를 출력한다.

    예제 입력 1
    baekjoon
    예제 출력 1
    4
    */
    }

    public void solution10987() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] word = br.readLine().toCharArray();
        int cnt = 0;
        for (char c : word) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                cnt++;
            }
        }
        bw.write(cnt + "");
        br.close();
        bw.flush();
        bw.close();
    }
}
