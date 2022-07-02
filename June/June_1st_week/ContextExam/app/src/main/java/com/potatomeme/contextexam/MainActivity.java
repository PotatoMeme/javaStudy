package com.potatomeme.contextexam;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // 컨텍스트 메뉴(Context  Menu)는 특정 뷰(View)에 대한 메뉴를 제공
    // 뷰(View)를 길게 눌렀을 때 활성화

    // * 컨텍스트 메뉴(Context Menu) 구현 과정
    // 특정 뷰(View)가 컨텍스트 메뉴(Context Menu)가 동작하는 뷰(View)로 등록하기 위해서는 액티비티의 registerForContextMenu(View view) 함수를 사용
    // * onCreateContextMenu()는 Context Menu가 활성화될 때마다 가장 먼저 호출되는 함수로 Context Menu의 Menu Item을 생성하거나 추가하는 작업을 진행
    // * ontextMenu가 활성화되고 사용자가 특정 MenuItem을 클릭하였을 때 onContextItemSelected() 함수가 호출 , 사용자가 선택한 메뉴에 대한 처리를 진행
    // * ConntextMenu가 활성화되고 사용자가 이전 버튼을 클릭하거나 화면상의 다른 뷰(View)에 포커스가 가는 경우에 onContextMenuClosed() 함수가 호출
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.tv_main);
        registerForContextMenu(textView);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.context_menu,menu);
        Toast.makeText(this, String.valueOf(v.getId()), Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.red:
                textView.setTextColor(getColor(R.color.RED));
                break;
            case R.id.blue:
                textView.setTextColor(getColor(R.color.BLUE));
                break;
            case R.id.green:
                textView.setTextColor(getColor(R.color.GREEN));
                break;
        }
        return true;
    }
}