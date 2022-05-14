package com.potatomeme.pattern_mvp;

public interface MainPresenter {
    void setView(MainPresenter.View view);

    void onConfirm();

    public interface View {
        void setConfirmText(String text);
    }
}
