package com.potatomeme.pattern_mvp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements MainPresenter.View{
    private MainPresenter mainPresenter;
    private Button confirmButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainPresenter = new MainPresenterTmpl(MainActivity.this);
        mainPresenter.setView(this);

        confirmButton = (Button) findViewById(R.id.btn_confirm);
        confirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainPresenter.onConfirm();
            }
        });
    }

    @Override
    public void setConfirmText(String text) {
        confirmButton.setText(text);
    }
}