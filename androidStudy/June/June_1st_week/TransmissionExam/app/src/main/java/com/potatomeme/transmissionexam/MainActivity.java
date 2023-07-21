package com.potatomeme.transmissionexam;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText editText1;
    private EditText editText2;
    private String savesStr1;
    private String savesStr2;
    private String[] savesStrArr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.et_basic_1);
        editText2 = findViewById(R.id.et_basic_2);

        findViewById(R.id.btn_basic_1).setOnClickListener(this);
        findViewById(R.id.btn_basic_2).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        savesStr1 = String.valueOf(editText1.getText());
        savesStr2 = String.valueOf(editText2.getText());

        Intent intent = null;

        switch (view.getId()) {
            case R.id.btn_basic_1:
                intent = new Intent(this, MainActivity2.class);
                savesStrArr = new String[2];
                savesStrArr[0] = savesStr1;
                savesStrArr[1] = savesStr2;

                intent.putExtra("saveStr1", savesStr1);
                intent.putExtra("saveStr2", savesStr2);
                intent.putExtra("saveStrList", savesStrArr);
                startActivity(intent);
                break;
            case R.id.btn_basic_2:
                intent = new Intent(this, MainActivity3.class);
                Person person = new Person();
                person.setAge(Integer.parseInt(savesStr1));
                person.setName(savesStr2);
                intent.putExtra("Person", person);
                launcher.launch(intent);
                break;

        }


    }

    ActivityResultLauncher<Intent> launcher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult data) {
                    Log.d("TAG", "data : " + data);
                    if (data.getResultCode() == Activity.RESULT_OK) {
                        Intent intent = data.getData();
                        Person person = (Person) intent.getSerializableExtra("Person");
                        Toast.makeText(MainActivity.this, person.getAge() + " " + person.getName(), Toast.LENGTH_SHORT).show();
                    }
                }
            });
}