package com.potatomeme;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        int result = 0;
        if (A == B & A == C) {
            result = A * 1000 + 10000;
        } else if (A == B || A == C) {
            result = A * 100 + 1000;
        } else if (B == C) {
            result = B * 100 + 1000;
        } else {
            result = (A > B && A > C ? A : B > A && B > C ? B : C )* 100;
        }
        System.out.println(result);
    }
}


