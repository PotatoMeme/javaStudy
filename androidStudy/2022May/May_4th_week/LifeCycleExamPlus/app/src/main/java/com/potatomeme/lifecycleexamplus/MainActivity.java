package com.potatomeme.lifecycleexamplus;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // 필수적으로 구현해야함
        // LifeCycle 동안 한번만 발생
        // XML, 멤버 변수 정의, 일부 UI구성 등을 설정
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(this.getClass().getName(),"onCreate 실행");

        findViewById(R.id.next_act_btn1).setOnClickListener(this);
        findViewById(R.id.next_act_btn2).setOnClickListener(this);
    }

    @Override
    protected void onStart() {
        // 활성상태(사용자한테 보여지기 직전)에 들어가면 호출
        // 포그라운드에 보내 상호작용을 할 수 있도록 준비
        // UI를 관리하는 코드를 초기화
        // 완료되고 바로 onResume을 호출
        super.onStart();
        Log.e(this.getClass().getName(),"onStart 실행");
    }

    @Override
    protected void onResume() {
        // 사용자한테 화면에 보여지고 상호작용하는 메서드
        // 어떤 이벤트가 발생하여 앱에서 포커스가 떠날 때까지 이 상태 유지
        // 생명주기 구성요소가 포그라운드에서 사용자에게 보이는 동안 실행해야 하는 모든 기능을 구현
        // 방해가 되는 이벤트가 발생하면 일시중지 상태에 들어가고, 시스템이 onPause()를 호출
        super.onResume();
        Log.e(this.getClass().getName(),"onResume 실행");
    }

    @Override
    protected void onPause() {
        // 사용자가 화면을 떠날 때 시스템이 첫 번째로 이 메서드를 호출  -> 상태가 포그라운드에 있지 않게 되었다는 것을 나타냄
        // 포그라운드에 있지 않을 때 실행할 필요가 없는 기능을 모두 정지할 수 있음
        // 시스템 리소스, 센서 핸들(GPS), 사용자가 필요로 하지 않을 때 배터리 수명에 영향을 미칠 수 있는 모든 리소스를 해제할 수도 있다
        super.onPause();
        Log.e(this.getClass().getName(),"onPause 실행");
    }

    @Override
    protected void onStop() {
        // 포커스가 완전히 빠졌을 때 시스템은 이 콜백 메서드를 호출
        // 앱이 사용자에게 보이지 않는 동안 앱이 필요하지 않는 리소스를 해제하거나 조정
        // ex ) 애니메이션 중지, 세밀한 위치 업데이트에서 대략적인 위치 업데이트로 전환
        // 정보를 데이터베이스에 저장해야하는데 적절한 위치를 찾지 못했다면 이 메서드에서 저장할 수 있음.
        // (하지만 이 함수는 항상 호출되는 것은 아니며 메모리가 부족할 경우 호출이 안될 수도 있다)
        super.onStop();
        Log.e(this.getClass().getName(),"onStop 실행");
    }

    @Override
    protected void onDestroy() {
        // Activity가 소멸되기 전에 호출
        // 활동이 종료되는 경우 (스택에서 날리거나 finish()를 호출)
        // 구성 변경(예: 기기회전 또는 멀티 윈도우모드)으로 인해 시스템이 일시적으로 활동을 소멸시키는 경우
        super.onDestroy();
        Log.e(this.getClass().getName(),"onDestroy 실행");
    }

    @Override
    protected void onRestart() {
        // onStop()상태에 있던 화면이 다시 접근 했을 때 호출되는 콜백함수
        super.onRestart();
        Log.e(this.getClass().getName(),"onRestart 실행");
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()){
            case R.id.next_act_btn1:
                intent = new Intent(this,MainActivity2.class);
                startActivity(intent);
                break;
            case R.id.next_act_btn2:
                intent = new Intent(this,MainActivity3.class);
                startActivity(intent);
                finish();
                break;
        }
    }
}