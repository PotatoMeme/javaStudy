package com.potatomeme.explicitimplicitexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    // 명시적(Explicit) 방법과 암시적( Implicit) 방법



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnClickHandler01(View view) {
        // 명시적(Explicit) 방법
        // 명시적 인텐트는 실행할 컴포넌트의 이름과 클래스명을 말 그대로 명시적으로 작성하여
        // 실행하고자 하는 컴포넌트가 명확할 때 사용하는 방식입니다.
        Intent intent = new Intent();
        ComponentName componentName = new ComponentName("com.potatomeme.explicitimplicitexam"// 첫 번째는 실행하는 컴포넌트 패키지명
                ,"com.potatomeme.explicitimplicitexam.SubActivity"); // 두 번째 인자는 클래스명
        // 실행하고자 하는 컴포넌트를 명확하게 지정을 한 뒤 setComponent() 함수를 통해 해당 컴포넌트를 등록하고 액티비티를 실행해주는 것
        intent.setComponent(componentName);
        startActivity(intent);
    }
    public void OnClickHandler02(View view) {
        // 암시적(Implicit) 방법
        // 어떤 의도만으로 원하는 컴포넌트를 실행할 수 있음

        // 1. 특정 의도에 대한 정보를 포함하는 Intent 객체를 생성
        // 2. startActivity() 함수를 호출
        // 3. 액티비티 매니저가 해당 의도에 적합한 액티비티 정보를 패키지 매니저에게 요청
        // (패키지 매니저는 단말기에 설치된 모든 앱에 대한 정보를 가지고 있음)
        // 4. 액비티 매니저가 요청한 의도에 적합한 앱에 대한 정보를 다시 액티비티 매니저에 전달
        // 5. 액티비티 매니저는 전달받은 앱의 정보를 통해 원하는 액티비티를 실행
        Intent intent = new Intent();

        intent.setAction(Intent.ACTION_MAIN);
        // 액션(Action)
        // 동작을 실행하는 미리 정의된 문자열을 의미합 Intent 클래스의 static String Type으로 이미 정의되어 있음
        intent.addCategory(Intent.CATEGORY_APP_GALLERY);
        // 카테고리
        // 해당 액티비티의 분류에 해당
        // 액션(Action)과 마찬가지로 Intent 클래스에 미리 정의되어 있음
                
        startActivity(intent);
    }
}