package com.potatomeme.popupexam;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_01).setOnClickListener(this);
        findViewById(R.id.btn_02).setOnClickListener(this);
        findViewById(R.id.btn_03).setOnClickListener(this);
        findViewById(R.id.btn_04).setOnClickListener(this);
        findViewById(R.id.btn_05).setOnClickListener(this);
        findViewById(R.id.btn_06).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String[] textArr = {"Android","Java","C/C++"};

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        AlertDialog alertDialog;

        switch (view.getId()){
            case R.id.btn_01://snackbar 이용
                Snackbar mySnackbar = Snackbar.make(findViewById(R.id.mainLayout),
                        "testMassage", Snackbar.LENGTH_SHORT);
                mySnackbar.setAction("확인", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mySnackbar.dismiss();
                    }
                });
                /*
                * Snackbar.make(findViewById(R.id.mainLayout),"testMassage", Snackbar.LENGTH_SHORT)
                        .setAction("확인", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {

                            }
                        }).show();
                * */
                mySnackbar.show();
                break;
            case R.id.btn_02:// AlertDialog (Title,Message)
                builder.setTitle("인사말").setMessage("반갑습니다");

                builder.setPositiveButton("OK", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog, int id)
                    {
                        Toast.makeText(getApplicationContext(), "OK Click", Toast.LENGTH_SHORT).show();
                    }
                });

                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog, int id)
                    {
                        Toast.makeText(getApplicationContext(), "Cancel Click", Toast.LENGTH_SHORT).show();
                    }
                });

                builder.setNeutralButton("Neutral", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog, int id)
                    {
                        Toast.makeText(getApplicationContext(), "Neutral Click", Toast.LENGTH_SHORT).show();
                    }
                });

                alertDialog = builder.create();
                alertDialog.show();
                break;
            case R.id.btn_03:// AlertDialog (Title,Items)
                builder.setTitle("리스트 추가 예제");

                builder.setItems(textArr, new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog, int pos)
                    {
                        //String[] items = getResources().getStringArray(R.array.LAN);
                        Toast.makeText(getApplicationContext(),textArr[pos],Toast.LENGTH_LONG).show();
                    }
                });
                alertDialog = builder.create();
                alertDialog.show();
                break;
            case R.id.btn_04:// AlertDialog (Title,ChoiceItems)
                builder.setTitle("리스트 추가 예제");
                final ArrayList<String> selectedItems = new ArrayList<String>();
                builder.setMultiChoiceItems(textArr, null, new DialogInterface.OnMultiChoiceClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog, int pos, boolean isChecked)
                    {
                        if(isChecked == true) // Checked 상태일 때 추가
                        {
                            selectedItems.add(textArr[pos]);
                        }
                        else				  // Check 해제 되었을 때 제거
                        {
                            selectedItems.remove(pos);
                        }
                    }
                });

                builder.setPositiveButton("OK", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog, int pos)
                    {
                        String SeletedItemsString = "";

                        for(int i =0; i<selectedItems.size();i++)
                        {
                            SeletedItemsString =  SeletedItemsString + "," + selectedItems.get(i);
                        }

                        Toast toast = Toast.makeText(getApplicationContext(), "선택 된 항목은 :" + SeletedItemsString,Toast.LENGTH_LONG);
                        toast.setGravity(Gravity.CENTER, 0, 0);
                        toast.show();
                    }
                });
                alertDialog = builder.create();
                alertDialog.show();
                break;
            case R.id.btn_05:// AlertDialog (Title,SingleChoiceItems)
                final ArrayList<String> selectedItem  = new ArrayList<String>();
                selectedItem.add(textArr[0]);

                builder.setTitle("리스트 추가 예제");

                builder.setSingleChoiceItems(textArr, 0, new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog, int pos)
                    {
                        selectedItem.clear();
                        selectedItem.add(textArr[pos]);
                    }
                });

                builder.setPositiveButton("OK", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog, int pos)
                    {
                        Toast toast = Toast.makeText(getApplicationContext(), "선택된 항목 : " + selectedItem.get(0), Toast.LENGTH_LONG);
                        toast.setGravity(Gravity.CENTER, 0, 0);
                        toast.show();
                    }
                });
                alertDialog = builder.create();
                alertDialog.show();
                break;
            case R.id.btn_06:// AlertDialog (View)
                View dialogView = getLayoutInflater().inflate(R.layout.activity_sub, null);
                final EditText nameEditText = (EditText)dialogView.findViewById(R.id.name);
                final EditText NicknameEditText = (EditText)dialogView.findViewById(R.id.nickname);
                builder.setTitle("뷰 추가 예제");
                builder.setView(dialogView);

                builder.setPositiveButton("OK", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int pos)
                    {
                        String name = "이름은 : " + nameEditText.getText().toString();
                        String nickname = "별명은 : " + NicknameEditText.getText().toString();

                        Toast.makeText(getApplicationContext(),name + "\n" + nickname, Toast.LENGTH_LONG).show();
                    }
                });
                alertDialog = builder.create();
                alertDialog.show();
                break;
        }
    }
}
