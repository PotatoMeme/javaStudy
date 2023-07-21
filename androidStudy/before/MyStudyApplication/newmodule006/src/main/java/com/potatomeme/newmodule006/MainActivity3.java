package com.potatomeme.newmodule006;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    static boolean o;
    Button btn1,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        o = true;

        btn1 = findViewById(R.id.btn_id1);
        btn2 = findViewById(R.id.btn_id2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity3.this,"up",Toast.LENGTH_LONG).show();
            }
        });

        Listener lis = new Listener();
        btn2.setOnClickListener(lis);


    }

    class Listener implements View.OnClickListener{
        @Override
        public void onClick(View v){
            Toast.makeText(MainActivity3.this,"down",Toast.LENGTH_LONG).show();
        }
    }

    public void onClicked(View view) {
        //o = !o;
        //view.setSelected(o);

        Intent i  = new Intent(MainActivity3.this,MainActivity4.class);
        startActivity(i);
        finish();
    }
}