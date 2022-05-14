package com.potatomeme.room_exam;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText mTodoEditText;
    private TextView mResultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTodoEditText = (EditText) findViewById(R.id.todo_edit);
        mResultTextView = (TextView) findViewById(R.id.result_text);

        final AppDatabase db = Room.databaseBuilder(this,AppDatabase.class,"todo-db")
                .allowMainThreadQueries()// 메인스레드에서 db 조작 가능 , 실무에서는 백그라운드 스레드로 동작
                .build();

        mResultTextView.setText(db.todoDao().getAll().toString());
        findViewById(R.id.add_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                db.todoDao().insert(new Todo(mTodoEditText.getText().toString()));
                mResultTextView.setText(db.todoDao().getAll().toString());
            }
        });
    }
}