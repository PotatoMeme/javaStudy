package com.potatomeme.pickerdialogexam;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private String str, result;
    private TextView textView;
    private DatePickerDialog.OnDateSetListener callbackMethod1;
    private TimePickerDialog.OnTimeSetListener callbackMethod2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_date).setOnClickListener(this);
        findViewById(R.id.btn_time).setOnClickListener(this);

        str = getString(R.string.app_result_format);
        textView = findViewById(R.id.tv_main);

        callbackMethod1 = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                result = year + "년" + monthOfYear + "월" + dayOfMonth + "일";
                textView.setText(String.format(str, result));
            }
        };

        callbackMethod2 = new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                result = hourOfDay + "시" + minute + "분";
                textView.setText(String.format(str, result));
            }
        };
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_date:
                DatePickerDialog datePickerDialog = new DatePickerDialog(this, callbackMethod1, 2022, 5, 31);
                datePickerDialog.show();
                break;
            case R.id.btn_time:
                TimePickerDialog timePickerDialog = new TimePickerDialog(this, callbackMethod2, 8, 10, true);
                timePickerDialog.show();
                break;
        }
    }
}