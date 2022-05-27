package com.potatomeme.may.week_4th;

import java.util.Scanner;

public class p_solution_12969 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String str = "";
        for(int i = 0;i<a;i++){
            str += "*";
        }
        for(int i = 0;i<b;i++){
            System.out.println(str);
        }
    }
}
