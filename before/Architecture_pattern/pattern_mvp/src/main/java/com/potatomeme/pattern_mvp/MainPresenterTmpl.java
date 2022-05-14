package com.potatomeme.pattern_mvp;

import android.app.Activity;

public class MainPresenterTmpl implements MainPresenter {
    private Activity activity;
    private MainModel mainModel;
    private MainPresenter.View view;

    public MainPresenterTmpl(Activity activity) {
        this.activity = activity;
        this.mainModel = new MainModel();
    }

    @Override
    public void setView(View view) {
        this.view = view;
    }

    @Override
    public void onConfirm() {
        if(view!=null) {
            view.setConfirmText(mainModel.getClickedText());
        }
    }
}