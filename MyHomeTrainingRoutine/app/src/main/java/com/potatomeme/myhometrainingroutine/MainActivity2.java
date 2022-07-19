package com.potatomeme.myhometrainingroutine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;

public class MainActivity2 extends AppCompatActivity {

    private TextView today_routine_text;
    private String[] today_routine_text_arr = {
            "상체","하체","전신","휴식","상체","하체","전신"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        long now = System.currentTimeMillis();
        Date date = new Date(now);

        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int dayWeek = cal.get(Calendar.DAY_OF_WEEK);
        today_routine_text = findViewById(R.id.today_routine_text);
        today_routine_text.setText(String.format("오늘은 %s다",today_routine_text_arr[dayWeek-1]));

        findViewById(R.id.history).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity2.this,MainActivity3.class));
            }
        });
        /*switch (dayWeek){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
        }*/
    }
}