package com.potatomeme.newmodule005;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Debug;
import android.view.View;
import android.widget.TextView;

import java.util.LinkedList;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
    TextView tv_id;
    String text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_id = findViewById(R.id.tv_id);
    }

    public void func1(View view) {
        tv_id.setText(tv_id.getText().toString()+'1');
    }
    public void func2(View view) {
        tv_id.setText(tv_id.getText().toString()+'2');
    }
    public void func3(View view) {
        tv_id.setText(tv_id.getText().toString()+'3');
    }
    public void func4(View view) {
        tv_id.setText(tv_id.getText().toString()+'4');
    }
    public void func5(View view) {
        tv_id.setText(tv_id.getText().toString()+'5');
    }
    public void func6(View view) {
        tv_id.setText(tv_id.getText().toString()+'6');
    }
    public void func7(View view) {
        tv_id.setText(tv_id.getText().toString()+'7');
    }
    public void func8(View view) {
        tv_id.setText(tv_id.getText().toString()+'8');
    }
    public void func9(View view) {
        tv_id.setText(tv_id.getText().toString()+'9');
    }
    public void func0(View view) {
        tv_id.setText(tv_id.getText().toString()+'0');
    }
    public void funcPluse(View view) {
        tv_id.setText(tv_id.getText().toString()+'+');
    }
    public void funcMinuse(View view) {
        tv_id.setText(tv_id.getText().toString()+'-');
    }
    public void funcAstric(View view) {
        tv_id.setText(tv_id.getText().toString()+'*');
    }

    public void funcPer(View view) {
        tv_id.setText(tv_id.getText().toString() + '%');
    }

    public void funcDiv(View view) {
        tv_id.setText(tv_id.getText().toString()+'/');
    }

    public void funcClear(View view) {
        tv_id.setText("");
    }
    public void funcEqual(View view) {
        text = tv_id.getText().toString();
        tv_id.setText(String.valueOf(Change(text)));
    }
    public int Change(String s) {
        LinkedList<Integer> numList = new LinkedList<Integer>(); //숫자관련
        LinkedList<Character> opList = new LinkedList<Character>(); //연산자 관련

        String num = ""; //연사자 외에 숫자들을 임시 저장할 곳

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i); //string을 char 타입 단위로 나눔

            if(ch == '+' || ch =='-' || ch == '*' || ch == '/') {
                numList.add(Integer.parseInt(num)); //숫자로 바꿔서 숫자배열에 추가
                opList.add(ch); //연산자를 연산자배열에 추가
                num = ""; //임시로 저장된 숫자를 비워준다
                continue; //제일 가까운 명령문으로 이동
            }
            num += ch; //연산자 앞까지의 숫자를 임시로 넣어 놓음
        }
        numList.add(Integer.parseInt(num)); //마지막 숫자

        while(!opList.isEmpty()) { //연산자배열이 빌 때까지
            int prevNum = numList.poll(); //poll : 앞부터 완전히 뺀다
            int nextNum = numList.poll();
            char op = opList.poll();

            if(op == '+') {
                numList.addFirst(prevNum + nextNum); //addFirst 배열 제일 앞에 넣는다
            } else if(op == '-') {
                numList.addFirst(prevNum - nextNum);
            } else if(op == '*') {
                numList.addFirst(prevNum * nextNum);
            } else if(op == '/') {
                numList.addFirst(prevNum / nextNum);
            }
        }
        return numList.poll();
    }
}