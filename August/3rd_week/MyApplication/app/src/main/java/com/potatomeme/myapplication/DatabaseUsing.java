package com.potatomeme.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
//https://firebase.google.com/docs/database/android/read-and-write?hl=ko#java_5
public class DatabaseUsing extends AppCompatActivity {
    private FirebaseAuth mAuth;
    private FirebaseUser mUser;

    DatabaseReference mDatabase;
    int num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database_using);
        mAuth = FirebaseAuth.getInstance();
        mUser = mAuth.getCurrentUser();
        Toast.makeText(getApplicationContext(),mUser.getEmail(),Toast.LENGTH_SHORT).show();

        TextView textView = findViewById(R.id.textView);
        num = 0;
        mDatabase = FirebaseDatabase.getInstance().getReference();

        findViewById(R.id.transport_button).setOnClickListener(view -> {
            User user = new User(mUser.getDisplayName(), mUser.getEmail());
            mDatabase.child("users Test").child(mUser.getUid()).setValue(user)
                    .addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            // 저장 성공 시 처리
                            num++;
                            Toast.makeText(getApplicationContext(), "저장 성공.", Toast.LENGTH_SHORT).show();
                        }
                    })
                    .addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            // 저장 실패 시 처리
                            Toast.makeText(getApplicationContext(), "저장 실패.", Toast.LENGTH_SHORT).show();
                        }
                    });
        });

        findViewById(R.id.receive_button).setOnClickListener(view -> {
            mDatabase.child("users").child(mUser.getUid()).get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
                @Override
                public void onComplete(@NonNull Task<DataSnapshot> task) {
                    if (!task.isSuccessful()) {
                        Log.e("firebase", "Error getting data", task.getException());
                    }
                    else {
                        textView.setText(String.valueOf(task.getResult().getValue())+"\n");
                    }
                }
            });
            mDatabase.get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
                @Override
                public void onComplete(@NonNull Task<DataSnapshot> task) {
                    if (!task.isSuccessful()) {
                        Log.e("firebase", "Error getting data", task.getException());
                    }
                    else {
                        textView.append(String.valueOf(task.getResult().getValue()));
                    }
                }
            });
        });
    }

    public void writeNewUser(String userId, String name, String email) {

    }
}