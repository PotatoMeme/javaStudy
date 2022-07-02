package com.potatomeme.progressbarexam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // 프로그레스 바(ProgressBar)는 애플리케이션 안에서 특정 작업을 수행 중일 때 사용자에게 작업이 정상적으로 진행되고 있음을 시각적으로 표현할 때 사용되는 뷰(View)
    // 안드로이드의 ProgressBar는 작업 종류에 따라 두 가지 Style을 지원
    // 첫 번째는 style="? android:attr/progressBarStyleHorizontal" - 작업 진행 정도를 수치값으로 표현할 수 있고 작업 완료 시점을 예상할 수 있을 때 사용
    // 두 번째 Style은 style="? android:attr/progressBarStyle" - 작업을 수행하는데 있어 완료 시점을 명확하게 알 수 없고 수치 값으로 진행상태를 표시할 수 없을 때 사용

    ProgressBar myProgressBar;
    EditText myEditText;
    TextView myTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myProgressBar = (ProgressBar)findViewById(R.id.h_progressbar);
        myEditText = (EditText)findViewById(R.id.editText);
        myTextView = (TextView)findViewById(R.id.cureentValue);
    }

    public void ClickHandler(View view) {
        int value = Integer.parseInt(myEditText.getText().toString());
        MyAsyncTask asyncTask = new MyAsyncTask(value, myTextView, myProgressBar);
        asyncTask.execute();

    }
}