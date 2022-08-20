package com.potatomeme.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {
    private final static String TAG = "MainActivity";
    private FirebaseAuth mAuth;
    String email,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAuth = FirebaseAuth.getInstance();
        email = "testemail02@test.com";
        password = "password";


        findViewById(R.id.btn1).setOnClickListener(view -> {
            startActivity(new Intent(getApplicationContext(),GoogleLogin.class));
        });

        //신규 사용자 가입
        /*
        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            Log.d(TAG, "createUserWithEmail:success");
                            FirebaseUser user = mAuth.getCurrentUser();
                        } else {
                            // If sign in fails, display a message to the user.
                            Log.w(TAG, "createUserWithEmail:failure", task.getException());
                        }
                    }
                });
        */
    }


    @Override
    protected void onResume() {
        super.onResume();
        //활동을 초기화할 때 사용자가 현재 로그인되어 있는지 확인
        /*mAuth.signInWithEmailAndPassword(email,password)
                .addOnCompleteListener(MainActivity.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(MainActivity.this,"로그인 성공",Toast.LENGTH_SHORT).show();
                        }else{
                            Toast.makeText(MainActivity.this,"로그인 오류",Toast.LENGTH_SHORT).show();
                        }
                    }
                });*/

        FirebaseUser currentUser = mAuth.getCurrentUser();
        //현재 사용자를 가져올 때 권장하는 방법은 getCurrentUser 메서드를 호출하는 것입니다.
        //로그인한 사용자가 없으면 getCurrentUser는 null을 반환
        //mAuth.signOut();
        if (currentUser != null){
            //reload();
            Log.d(TAG,"currentUser is not null");
            Log.d(TAG,"currentUser\'s Email : "+currentUser.getEmail());
            Log.d(TAG,"currentUser\'s Uid : "+currentUser.getUid());
        } else {
            Log.d(TAG,"currentUser is null");
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

    }
}