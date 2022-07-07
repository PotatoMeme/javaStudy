package com.potatomeme.july.week_2nd;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class baekjoon_1107 {
    {//리모컨
    /*문제
    수빈이는 TV를 보고 있다. 수빈이는 채널을 돌리려고 했지만, 버튼을 너무 세게 누르는 바람에, 일부 숫자 버튼이 고장났다.

    리모컨에는 버튼이 0부터 9까지 숫자, +와 -가 있다. +를 누르면 현재 보고있는 채널에서 +1된 채널로 이동하고, -를 누르면 -1된 채널로 이동한다. 채널 0에서 -를 누른 경우에는 채널이 변하지 않고, 채널은 무한대 만큼 있다.

    수빈이가 지금 이동하려고 하는 채널은 N이다. 어떤 버튼이 고장났는지 주어졌을 때, 채널 N으로 이동하기 위해서 버튼을 최소 몇 번 눌러야하는지 구하는 프로그램을 작성하시오.

    수빈이가 지금 보고 있는 채널은 100번이다.

    입력
    첫째 줄에 수빈이가 이동하려고 하는 채널 N (0 ≤ N ≤ 500,000)이 주어진다.  둘째 줄에는 고장난 버튼의 개수 M (0 ≤ M ≤ 10)이 주어진다. 고장난 버튼이 있는 경우에는 셋째 줄에는 고장난 버튼이 주어지며, 같은 버튼이 여러 번 주어지는 경우는 없다.

    출력
    첫째 줄에 채널 N으로 이동하기 위해 버튼을 최소 몇 번 눌러야 하는지를 출력한다.

    예제 입력 1
    5457
    3
    6 7 8
    예제 출력 1
    6
    예제 입력 2
    100
    5
    0 1 2 3 4
    예제 출력 2
    0
    예제 입력 3
    500000
    8
    0 2 3 4 6 7 8 9
    예제 출력 3
    11117
    예제 입력 4
    100
    3
    1 0 5
    예제 출력 4
    0
    예제 입력 5
    14124
    0
    예제 출력 5
    5
    예제 입력 6
    1
    9
    1 2 3 4 5 6 7 8 9
    예제 출력 6
    2
    예제 입력 7
    80000
    2
    8 9
    예제 출력 7
    2228*/
    }
    // 고민
    // 버튼의 종류
    // 0부터 9까지 숫자, +와 -
    // +를 누르면 현재 보고있는 채널에서 +1된 채널로 이동하고, -를 누르면 -1된 채널로 이동한다
    // 0에서 -를 누른 경우에는 채널이 변하지 않고, 채널은 무한대 만큼
    // 이동하려고 하는 채널은 N이다. 어떤 버튼이 고장났는지 주어졌을 때, 채널 N으로 이동하기 위해서 버튼을 최소 몇 번 눌러야하는지 구하는 프로그램을 작성
    // 현재 채널은 100번
    // N (0 ≤ N ≤ 500,000)
    // 고장난 버튼의 개수 M (0 ≤ M ≤ 10)이 주어진다
    // 셋째 줄에는 고장난 버튼이 주어지며, 같은 버튼이 여러 번 주어지는 경우는 없다.(일부 숫자 버튼이 고장)

    // case 1
    // 현재 값이랑 같은 경우
    // 0 을 리턴

    // case 2
    // 기존에 다있을경우
    // 숫자버튼을 이용 했을때( N의자릿수 )와 + - 버튼을 이용했을때( |N - 100| )를 비교하여 더 적은 값을 리턴

    // case 3
    // 버튼이 망가진 경우
    //  + - 버튼을 이용했을때를구하고( |N - 100| )
    // 숫자버튼을 온저히 이용했을때 ( N의자릿수 )
    // N을 비교하여 만들수있는 가장가깝고 그중 버튼이가장적게드는 경우인 num에서 + - 버튼을 이용했을때( |N - num| )
    // 왜 틀려다는 거지? 값은 다나오는데
    /*
    public static void main(String arg[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int result;
        if (M != 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            if (N < 104 && N > 97) {
                result = Math.abs(N - 100);
            } else {
                boolean[] btn = new boolean[10];// 0~9, 초기값  false
                for (int i = 0; i < M; i++) {
                    btn[Integer.parseInt(st.nextToken())] = true;
                }
                result = Math.abs(N - 100);
                for (int i = 0; i <= 999999; i++) {
                    String str = String.valueOf(i);
                    int len = str.length();

                    boolean isBreak = false;
                    for (int j = 0; j < len; j++) {
                        if (btn[str.charAt(j) - '0']) {
                            isBreak = true;
                            break;
                        }
                    }
                    if (!isBreak) {
                        int min = Math.abs(N - i) + len;
                        result = Math.min(min, result);
                    }
                }
            }
        } else if (N < 104 && N > 97) {
            result = Math.abs(N - 100);
        } else {
            result = (int) (Math.log10(N) + 1);
        }
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }
    */
    public static void main(String arg[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N =  sc.nextInt();
        int M = sc.nextInt();
        boolean[] btn = new boolean[10];// 0~9, 초기값  false
        for (int i = 0; i < M; i++) {
            btn[sc.nextInt()] = true;
        }
        int result = Math.abs(N - 100);
        for (int i = 0; i <= 999999; i++) {
            String str = String.valueOf(i);
            int len = str.length();

            boolean isBreak = false;
            for (int j = 0; j < len; j++) {
                if (btn[str.charAt(j) - '0']) {
                    isBreak = true;
                    break;
                }
            }
            if (!isBreak) {
                int min = Math.abs(N - i) + len;
                result = Math.min(min, result);
            }
        }
        System.out.println(result);
    }


}
