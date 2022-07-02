package com.potatomeme.optionexam;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // 옵션 메뉴(Option Menu)를 추가하는 과정
    // 1-1. /res/menu/ 경로에  Menu Resource를 위해 XML 파일을 생성
    // 1-2. res/ 경로 밑에 menu Directory가 존재하지 않으면 추가를 하여 해당 Directory 하위에 XML 파일을 생성
    // 2. Activity의 onCreateOptionsMenu() 함수를 오버라이딩
    // ,액티비티(Activity)가 시작될 때 호출 Life Cycle 내에서 단 한 번만 호출
    // (MenuItem 생성과 초기화) Menu Inflater를 통하여 XML Menu 리소스에 정의된 내용을 파싱 하여 Menu 객체를 생성하고 추가
    // 3. Activity의 onPrepareOptionsMenu() 함수를 오버라이딩
    // ,추가 한 옵션 메뉴(Option Menu)를 클릭할 때마다 호출추가 한 옵션 메뉴(Option Menu)를 클릭할 때마다 호출
    // 4. Activity의 onOptionsItemSelected() 함수를 오버라이딩
    // 옵션 메뉴(Option Menu)에서 특정 Menu Item을 선택하였을 때 호출되는 함수입니다.
    // 매개변수로 선택 된 MenuItem의 객체가 넘어옵니다.
    // 5. Activity의 onOptionsMenuClosed() 함수를 오버라이딩
    // 옵션 메뉴(Option Menu)를 클릭하여 활성화 된 상태에서 이전 버튼을 클릭하거나 액티비티의 다른 영역을 클릭하여 옵션 메뉴를 닫을 때 호출되는 함수


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        String toastMsg = "";
        switch (item.getItemId()){
            case R.id.menu1:
                toastMsg = "menu1 Selected";
                break;
            case R.id.menu2:
                toastMsg = "menu2 Selected";
                break;
            case R.id.menu3:
                toastMsg = "menu3 Selected";
                break;
            case R.id.menu4:
                toastMsg = "menu4 Selected";
                break;
        }
        Toast.makeText(this, toastMsg, Toast.LENGTH_SHORT).show();
        return true;
    }
}