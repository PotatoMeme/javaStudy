package com.potatomeme.fragmentexam;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    // Fragment
    // 액티비티 내에서 화면 UI의 일부를 나타냄
    // 여러 개의 프래그먼트를 조합하여 액티비티가 출력하는 한 화면의 UI를 표현할 수 있으며 하나의 프래그먼트를 다른 액티비티에 재사용할 수 있음
    // 액티비티(Activity)처럼 하나의 독립된 모듈처럼 실행되기 때문에 액티비티와 연관된 생명주기를 가지고 있음
    // 액티비티 실행 중에도 화면에 동적으로 추가되거나 다른 Fragment로 교체가 가능
    // 한 개의 액티비티에 들어가는 화면 요소를 Fragment 단위로 나누어 관리하기 때문에 레이아웃을 분리 관리할 수 있고,
    // 액티비티의 화면 구성을 위한 레이아웃의 복잡도도 줄일 수 있음

    // FragmentManager
    // 프래그먼트를 추가, 삭제 또는 교체하고 백스택에 추가하는 등의 작업을 실행하는 클래스
    // 프래그먼트의 변경사항 집합을 트랜잭션이라고 함
    private FragmentManager fragmentManager;

    private AFragment fragmentA;
    private BFragment fragmentB;

    // FragmentTransaction
    // 각 트랜잭션은 수행하고자 하는 변경사항의 집합
    // 변경사항을 설정하려면 add(), remove(), replace()와 같은 메서드를 사용해야함
    private FragmentTransaction transaction;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager = getSupportFragmentManager();

        fragmentA = new AFragment();
        fragmentB = new BFragment();

        // FragmentManager의 beginTransaction() 함수를 통해 FragmentTrasaction 참조 객체를얻음
        transaction = fragmentManager.beginTransaction();
        // replace 의 첫 번째 인자는 액티비티의 레이아웃 상에서 교체되는 프래그먼트가 배치될 최상위 ViewGroup
        // 두 번째 인자는 교체하고자 하는 Fragment 객체
        // 변경 내용이 적용되기 위해서는 commit 관련된 함수를 호출을 해야 변경 내용이 적용
        transaction.replace(R.id.frameLayout, fragmentA).commitAllowingStateLoss();

        Log.e(this.getClass().getName(),"onCreate 실행");
    }

    public void clickHandler(View view)
    {
        transaction = fragmentManager.beginTransaction();

        switch(view.getId())
        {
            case R.id.btn_fragmentA:
                transaction.replace(R.id.frameLayout, fragmentA).commitAllowingStateLoss();
                break;
            case R.id.btn_fragmentB:
                transaction.replace(R.id.frameLayout, fragmentB).commitAllowingStateLoss();
                break;
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(this.getClass().getName(),"onStart 실행");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(this.getClass().getName(),"onResume 실행");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(this.getClass().getName(),"onPause 실행");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(this.getClass().getName(),"onStop 실행");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(this.getClass().getName(),"onDestroy 실행");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(this.getClass().getName(),"onRestart 실행");
    }


}