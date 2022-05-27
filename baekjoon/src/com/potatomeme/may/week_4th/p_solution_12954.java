package com.potatomeme.may.week_4th;

public class p_solution_12954 {
    public long[] solution(int x, int n) {
        long[] answer = {};
        for (int i = 0; i < n; i++) {
            answer[i] = (long) x * (i + 1);
        }
        return answer;
    }
}
