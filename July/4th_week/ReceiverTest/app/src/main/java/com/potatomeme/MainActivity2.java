package com.potatomeme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    EditText editText1, editText2, editText3;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        init();


    }

    private void init() {
        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        editText3 = findViewById(R.id.editText3);
        button = findViewById(R.id.button);
        button.setOnClickListener(v ->{
            finish();
        });
        Intent passedIntent = getIntent();
        processCommand(passedIntent);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        processCommand(intent);
        super.onNewIntent(intent);
    }

    private void processCommand(Intent passedIntent) {
        if(passedIntent != null){
            String sender =  passedIntent.getStringExtra("sender");
            String contents =  passedIntent.getStringExtra("contents");
            String receivedDate =  passedIntent.getStringExtra("receivedDate");
            editText1.setText(sender);
            editText2.setText(contents);
            editText3.setText(receivedDate);
        }
    }
}