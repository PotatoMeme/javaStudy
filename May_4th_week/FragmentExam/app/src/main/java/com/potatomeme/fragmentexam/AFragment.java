package com.potatomeme.fragmentexam;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class AFragment extends Fragment {
    // Fragment Lifecycle : CREATED
    @Override
    public void onAttach(@NonNull Context context) {
        //액티비티에서 프래그먼트가 호출될 때 최초 한번 호출되는 함수
        super.onAttach(context);
        Log.e(this.getClass().getName(),"onAttach 실행");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        // 프래그먼트가 생성될 떄 호출되는 함수
        // 이 시점에는 아직 Fragment View 가 생성되지 않았기 때문에 Fragment 의 View 와 관련된 작업을 두기에 적절하지 않음
        // Bundle 타입으로 savedInstanceState : onSaveInstanceState() 콜백 함수에 의에 저장된 Bundle 값
        // 프래그먼트가 처음 생성 됐을 때만 null 로 넘어오며
        // onSaveInstanceState() 함수를 재정의하지 않았더라도 그 이후 재생성부터는 non-null 값으로 넘어옴
        super.onCreate(savedInstanceState);
        Log.e(this.getClass().getName(),"onCreate 실행");
    }
    // View Lifecycle : INITIALIZED
    @Nullable//null을 허용할 경우 반대 @NonNull(null을 허용하지 않을 경우)
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // 프래그먼트의 뷰를 생성하는 함수
        // onCreateView() 의 반환값으로 정상적인 Fragment View 객체를 제공했을 때만 Fragment View 의 Lifecycle 이 생성됨
        Log.e(this.getClass().getName(),"onCreateView 실행");
        return inflater.inflate(R.layout.fragment_a, container, false);
    }

    /*@Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        // deprecated 됨
        // 액티비티에서 onCreate()가 호출 된 프래그먼트에서 호출되는 함수
        super.onActivityCreated(savedInstanceState);
        Log.e(this.getClass().getName(),"onActivityCreated 실행");
    }*/

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        // onCreateView() 를 통해 반환된 View 객체는 onViewCreated() 의 파라미터로 전달됨
        // 이 시점부터 Fragment View 의 Lifecycle 이 INITIALIZED 상태로 업데이트됨
        super.onViewCreated(view, savedInstanceState);
        Log.e(this.getClass().getName(),"onViewCreated 실행");
    }
    // View Lifecycle : CREATED
    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        // onViewStateRestored() 함수는 저장해둔 모든 state 값이 Fragment 의 View 계층구조에 복원 됐을 때 호출됨
        // 체크박스 위젯이 현재 체크 되어있는지 등 "각 뷰의 상태값" 을 체크할 수 있음
        // View lifecycle owner 는 이때 INITIALIZED 상태에서 CREATED 상태로 변경됐음을 알림
        super.onViewStateRestored(savedInstanceState);
        Log.e(this.getClass().getName(),"onViewStateRestored 실행");
    }

    // Fragment Lifecycle : STARTED
    // View Lifecycle : STARTED
    @Override
    public void onStart() {
        // 프래그먼트가 사용자한테 보여지기 직전 호출되는 함수
        // Fragment 의 child FragmentManager 통해 FragmentTransaction 을 안전하게 수행할 수 있습
        // Fragment 의 Lifecycle 이 STARTED 로 이동한 후에 Fragment View 의 Lifecycle 또한 STARTED 로 변환됨
        super.onStart();
        Log.e(this.getClass().getName(),"onStart 실행");
    }
    // Fragment Lifecycle : RESUMED
    // View Lifecycle : RESUMED
    @Override
    public void onResume() {
        // 프래그먼트가 사용자와 상호작용할 수 있는 상태
        // onResume() 이 호출되지 않은 시점에서는 입력을 시도하거나 포커스를 설정하는 등의 작업을 임의로 하면 안된다는 것을 의미
        super.onResume();
        Log.e(this.getClass().getName(),"onResume 실행");
    }
    // Fragment Lifecycle : STARTED
    // View Lifecycle : STARTED
    @Override
    public void onPause() {
        // 사용자가 Fragment 를 떠나기 시작했지만 Fragment 는 여전히 visible 일 때 onPause() 가 호출
        // Fragment 와 View 의 Lifecycle 이 PAUSED 가 아닌 STARTED 가 됨
        super.onPause();
        Log.e(this.getClass().getName(),"onPause 실행");
    }
    // Fragment Lifecycle : CREATED
    // View Lifecycle : CREATED
    @Override
    public void onStop() {
        // 프래그먼트가 화면에 사라졌을 때 호출
        // 부모 액티비티나 프래그먼트가 중단됐을 때 뿐만 아니라, 부모 액티비티나 프래그먼트의 상태가 저장될 때도 호출
        // onStop() 이 FragmentTransaction 을 안전하게 수행할 수 있는 마지막 지점
        super.onStop();
        Log.e(this.getClass().getName(),"onStop 실행");
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.e(this.getClass().getName(),"onSaveInstanceState 실행");
    }
    // View Lifecycle : DESTROYED
    @Override
    public void onDestroyView() {
        // 프래그먼트의 View가 사라질때 호출되는 함수
        // 이시점부터는 getViewLifecycleOwnerLiveData() 의 리턴값으로 null 이 반환
        //  해당 시점에서는 가비지 컬렉터에 의해 수거될 수 있도록 Fragment View 에 대한 모든 참조가 제거되어야 함
        super.onDestroyView();
        Log.e(this.getClass().getName(),"onDestroyView 실행");
    }
    // Fragment Lifecycle : DESTROYED
    @Override
    public void onDestroy() {
        // 프래그먼트가 제거될 때 호출되는 함수
        super.onDestroy();
        Log.e(this.getClass().getName(),"onDestroy 실행");
    }

    @Override
    public void onDetach() {
        // 프래그먼트가 액티비티와 연결이 종료될 때 호출되는 함수
        super.onDetach();
        Log.e(this.getClass().getName(),"onDetach 실행");
    }
}