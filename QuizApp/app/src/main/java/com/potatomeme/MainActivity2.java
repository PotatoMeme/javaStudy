package com.potatomeme;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    private String[] questions;
    private String[] results;
    private int length;
    private int stage;

    private TextView stages_tv,stage_tv,question_tv;
    private EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Resources resources = getResources();
        questions = resources.getStringArray(R.array.question_array);
        results = resources.getStringArray(R.array.result_array);
        length = questions.length;
        stage = 0;

        stages_tv = findViewById(R.id.stages_tv);
        stages_tv.setText(String.valueOf(length));
        stage_tv = findViewById(R.id.stage_tv);
        stage_tv.setText(String.valueOf(stage+1));
        question_tv = findViewById(R.id.question_tv);
        question_tv.setText(questions[stage]);
        editText = findViewById(R.id.result_et);
        findViewById(R.id.currect_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String client_result = String.valueOf(editText.getText());
                Boolean currect = client_result.equals(results[stage]);
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity2.this);
                builder.setTitle(currect?"맞았습니다.":"틀렸습니다")
                        .setCancelable(false)
                        .setPositiveButton(getString(R.string.act2_btn_text), new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                if(currect){
                                    stage++;
                                    if (stage == length){
                                        Toast.makeText(getApplicationContext(),"모든문제를 다푸셨습니다.",Toast.LENGTH_SHORT).show();;
                                        try {
                                            Thread.sleep(3*1000);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                        finish();
                                    }
                                    stage_tv.setText(String.valueOf(stage+1));
                                    question_tv.setText(questions[stage]);
                                    editText.setText("");

                                }
                                dialogInterface.cancel();
                            }
                        });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();

            }
        });
    }
}