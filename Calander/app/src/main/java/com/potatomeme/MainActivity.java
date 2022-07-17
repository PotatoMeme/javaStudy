package com.potatomeme;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class MainActivity extends AppCompatActivity {
    TextView monthYearText; //년월 텍스트뷰

    LocalDate selectedDate; //년월 변수

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //초기화
        monthYearText = findViewById(R.id.monthYearText);
        ImageButton prevBtn = findViewById(R.id.pre_btn);
        ImageButton nextBtn = findViewById(R.id.next_btn);

        //현재 날짜
        selectedDate = LocalDate.now();

        //화면 설정
        setMonthView();

        //이전달 버튼 이벤트
        prevBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //현재 월-1 변수에 담기
                selectedDate = selectedDate.minusMonths(1);
                setMonthView();
            }
        });

        //다음달 버튼 이벤트
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //현재 월+1 변수에 담기
                selectedDate = selectedDate.plusMonths(1);
                setMonthView();
            }
        });
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    private String monthYearFromDate(LocalDate date){

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM월 yyyy");
        return date.format(formatter);
    }


    @RequiresApi(api = Build.VERSION_CODES.O)
    private void setMonthView() {

        //년월 텍스트뷰 셋팅
        monthYearText.setText(monthYearFromDate(selectedDate));
    }
}