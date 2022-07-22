package com.potatomeme.intenttest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    String data = null;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        intent = getIntent();
        processIntent();
        init();
    }



    private void processIntent() {

        data = intent.getStringExtra("test");
        if (data != null){
            Log.d("data : ",data);
            Toast.makeText(getApplicationContext(), data+"MainActivity2", Toast.LENGTH_SHORT).show();
        }else{
            Log.d("data : ","null");
        }

        ArrayList<String> names = (ArrayList<String>) intent.getSerializableExtra("names");
        if(names != null){
            for (String str : names){
                Log.d("Names: ",str);
            }
        }
        Man man = (Man) intent.getSerializableExtra("kim");
        if(man != null){
            Log.d("Names: ",man.toString());
        }

    }
    private void init() {

        findViewById(R.id.button1).setOnClickListener(view -> {
            Intent finish_intent = new Intent(getApplicationContext(), MainActivity.class);
            finish_intent.putExtra("test", data);
            setResult(1999, finish_intent);
            finish();
        });

    }
}