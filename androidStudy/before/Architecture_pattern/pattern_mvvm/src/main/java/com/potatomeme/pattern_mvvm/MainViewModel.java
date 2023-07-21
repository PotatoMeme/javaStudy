package com.potatomeme.pattern_mvvm;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;

public class MainViewModel {
    private Activity activity;
    private MainModel mainModel;
    private TextView textView;


    public MainViewModel(Activity activity) {
        this.activity = activity;
        this.mainModel = new MainModel();
        initView(activity);
    }

    private void initView(Activity activity) {
        textView = (TextView) activity.findViewById(R.id.btn_confirm);
        textView.setText("Non-Clicked");

        activity.findViewById(R.id.btn_confirm)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String text = mainModel.getClickedText();
                        textView.setText(text);
                    }
                });
    }
}