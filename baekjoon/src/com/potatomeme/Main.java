package com.potatomeme;

import java.util.Scanner;

public class Main {
    //백준 제출용 포멧
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] count;
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            count = new int[num + 1<2?2:num+1][2];
            count[0][0] = 1; count[0][1] = 0;
            count[1][0] = 0; count[1][1] = 1;
            if (num <= 1) {
                System.out.println(count[num][0] + " " + count[num][1]);
            }else{
                for (int j = 2; j <= num; j++) {
                    count[j][0] = count[j - 1][0] + count[j - 2][0];
                    count[j][1] = count[j - 1][1] + count[j - 2][1];
                }
                System.out.println(count[num][0] + " " + count[num][1]);
                count = null;
            }
        }

    }
}
