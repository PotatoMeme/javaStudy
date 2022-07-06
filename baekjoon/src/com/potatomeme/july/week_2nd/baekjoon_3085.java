package com.potatomeme.july.week_2nd;

import java.io.*;

public class baekjoon_3085 {
    {//사탕 게임
    /*문제
    상근이는 어렸을 적에 "봄보니 (Bomboni)" 게임을 즐겨했다.

    가장 처음에 N×N크기에 사탕을 채워 놓는다. 사탕의 색은 모두 같지 않을 수도 있다. 상근이는 사탕의 색이 다른 인접한 두 칸을 고른다. 그 다음 고른 칸에 들어있는 사탕을 서로 교환한다. 이제, 모두 같은 색으로 이루어져 있는 가장 긴 연속 부분(행 또는 열)을 고른 다음 그 사탕을 모두 먹는다.

    사탕이 채워진 상태가 주어졌을 때, 상근이가 먹을 수 있는 사탕의 최대 개수를 구하는 프로그램을 작성하시오.

    입력
    첫째 줄에 보드의 크기 N이 주어진다. (3 ≤ N ≤ 50)

    다음 N개 줄에는 보드에 채워져 있는 사탕의 색상이 주어진다. 빨간색은 C, 파란색은 P, 초록색은 Z, 노란색은 Y로 주어진다.

    사탕의 색이 다른 인접한 두 칸이 존재하는 입력만 주어진다.

    출력
    첫째 줄에 상근이가 먹을 수 있는 사탕의 최대 개수를 출력한다.

    예제 입력 1
    3
    CCP
    CCP
    PPC
    예제 출력 1
    3
    예제 입력 2
    4
    PPPP
    CYZY
    CCPY
    PPCC
    예제 출력 2
    4
    예제 입력 3
    5
    YCPZY
    CYZZP
    CCPPP
    YCYZC
    CPPZZ
    예제 출력 3
    4*/
    }
    // 고민
    // 색깔을 종류를 알아야하는가?


    // 2*2 일결우 바꾸는 경우는 2*2
    // 3*3 일결우 바꾸는 경우는 6*2
    // 4*4 일경우 바꾸는 경우는 12*2
    // 5*5 일경우 바꾸는 경우는 5*4*2
    // n*n 일경우 바꾸는 경우는 n*(n-1)*2 => 2*n*n - 2*n

    // 1안 인접한 2개의 바꾸고 채크 중 최대인 n이나올경우 스탑하고 출력
    // (n*(n-1)*2)*(2*n*n)
    private static char[][] board;
    private static int size;

    public static void main(String arg[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        size = Integer.parseInt(br.readLine());
        board = new char[size][size];
        for (int i = 0; i < size; i++) board[i] = br.readLine().toCharArray();
        bw.write(String.valueOf(CheckAll()));
        bw.flush();
        bw.close();
        br.close();
    }

    public static int CheckAll() {
        int check = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - 1; j++) {
                if (board[i][j] != board[i][j + 1]) {
                    SwapArr(i, j, i, j + 1);
                    check = Math.max(check, CheckArr());
                    if (check == size) return check;
                    SwapArr(i, j, i, j + 1);
                }
                if (board[j][i] != board[j + 1][i]) {
                    SwapArr(j, i, j + 1, i);
                    check = Math.max(check, CheckArr());
                    if (check == size) return check;
                    SwapArr(j, i, j + 1, i);
                }
            }
        }
        return check;
    }

    public static int CheckArr() {
        int check, checkSave1, checkSave2;
        check = checkSave1 = checkSave2 = 0;
        for (int k = 0; k < size; k++) {
            for (int l = 0; l < size - 1; l++) {
                checkSave1++;
                checkSave2++;
                if (board[k][l] != board[k][l + 1]) {
                    check = checkSave1 > check ? checkSave1 : check;
                    if (check == size) return check;
                    checkSave1 = 0;
                }
                if (board[l][k] != board[l + 1][k]) {
                    check = checkSave2 > check ? checkSave2 : check;
                    if (check == size) return check;
                    checkSave2 = 0;
                }
            }
            checkSave1++;
            checkSave2++;
            check = checkSave1 > check ? checkSave1 : check;
            check = checkSave2 > check ? checkSave2 : check;
            if (check == size) return check;
            checkSave1 = checkSave2 = 0;
        }
        return check;
    }

    public static void SwapArr(int i1, int j1, int i2, int j2) {
        char temp = board[i2][j2];
        board[i2][j2] = board[i1][j1];
        board[i1][j1] = temp;
    }
}
