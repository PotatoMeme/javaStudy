package com.potatomeme.intent_and_intentfilter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void dialPhone(View view) {
        EditText editText = findViewById(R.id.et_phone);
        dialPhonenNumber(editText.getText().toString());
    }

    private void dialPhonenNumber(String phoneNum) {
       /*Intent intent = new Intent(Intent.ACTION_DIAL);//ACTION_DIAL로 지정
       intent.setData(Uri.parse("tel:"+phoneNum));

        if(intent.resolveActivity(getPackageManager()) != null) {// 전화기능이 있는지확인
            Toast.makeText(getApplicationContext(), "성공", Toast.LENGTH_SHORT).show();
            startActivity(intent);
        } else {
            Toast.makeText(getApplicationContext(), "실패", Toast.LENGTH_SHORT).show();
            startActivity(intent);
        }*/
        Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("tel:"+phoneNum));
        startActivity(intent);
    }
}