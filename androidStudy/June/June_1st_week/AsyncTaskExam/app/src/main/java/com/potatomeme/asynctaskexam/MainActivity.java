package com.potatomeme.asynctaskexam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // 현재 deprecated됨 이제는 RxJava를 공부
    // AsyncTask 클래스
    // 안드로이드에서 요구하는 메인 스레드(Main Thread)와 작업 스레드의 분리 구조를 보다 쉽게 구현하도록 도와주는 추상 클래스
    // AsyncTask 생명주기 관리는 다섯 가지의 생명주기 함수들을 재정의함으로써 관리할 수 있음
    // doInBackground() 함수를 제외한 나머지 4개의 함수는 전부 Main Thread에서 실행되는 함수들

    // AsyncTask를 실행하면 가장 먼저 onPreExecute() 함수가 호출
    // 일반적으로 해당 함수에서는 사용자 UI에 ProgressBar를 표시하여 본격적인 작업 스레드에 들어가기 전에 작업 진행줄을 표시하는 구현이 들어감
    // doInBackground() 함수는
    // 작업 스레드를 실행하는 함수로 메인 스레드와는 별개로 오래 걸리는 작업을 처리
    // onProgressUpdate() 함수는 doInBackground() 함수에서 publishProgress() 함수를 호출하면 호출되는 함수
    // 일반적으로 작업 진행 정도를 표시하는 용도로 사용
    // doInBackground() 실행 도중 작업이 중단되는 경우에 onCancelled() 함수가 실행
    // 반대로 정상적으로 처리가 완료되는 경우에는 onPostExecute() 함수가 호출

    // 구현방법
    // 1. extends 키워드를 통해 해당 클래스가 AsyncTask 클래스를 상속
    // 2. AsyncTask 생명주기 관리를 위해 재정의 해야 할 함수를 추가
    // 3-1.  첫 번째는 doInBackground() 함수 호출 시 전달 시 전달되는 인자의 자료형과 매칭
    // 3-2.  두 번째는 onProgressUpdate() 함수 호출 시 전달되는 인자의 자료형과 매칭
    // 3-3.  세 번째 인자는 onPostExecute()와 onCancelled() 함수 인자의 자료형과 매칭
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyAsyncTask myAsyncTask = new MyAsyncTask((TextView) findViewById(R.id.textView));
        myAsyncTask.execute();
    }
}