package com.potatomeme.appdesiginformat.ui;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.potatomeme.appdesiginformat.DetailActivity;
import com.potatomeme.appdesiginformat.R;
import com.potatomeme.appdesiginformat.UpdateActivity;

public class TodoUpdateFragment extends Fragment {

    ViewGroup rootView;
    UpdateActivity updateActivity;
    String date;
    String time;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        updateActivity = (UpdateActivity) getActivity();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        rootView = (ViewGroup) inflater.inflate(R.layout.fragment_todo_update, container, false);
        Log.d("todoUpdateFragment", "onCreateView");
        EditText title_edit = rootView.findViewById(R.id.todo_title_edit);
        EditText date_edit = rootView.findViewById(R.id.todo_date_edit);
        EditText time_edit = rootView.findViewById(R.id.todo_time_edit);
        EditText content_edit = rootView.findViewById(R.id.todo_content_edit);


        //dateDialog
        Dialog dateDialog = new Dialog(container.getContext());
        dateDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dateDialog.setContentView(R.layout.popup_date);
        dateDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        Button date_select_button = rootView.findViewById(R.id.select_date_button);

        date_select_button.setOnClickListener((view) -> {

            dateDialog.show();
            DatePicker datePicker = dateDialog.findViewById(R.id.date_picker);
            Button button_cancel = dateDialog.findViewById(R.id.cancel_button);
            button_cancel.setOnClickListener(view1 -> {
                dateDialog.dismiss();
            });
            Button button_ok = dateDialog.findViewById(R.id.ok_button);
            button_ok.setOnClickListener(view1 -> {
                date = datePicker.getYear() + "년" + datePicker.getMonth() + "월" + datePicker.getDayOfMonth() + "일";
                date_edit.setText(date);
                dateDialog.dismiss();
            });
        });

        //timeDialog
        Dialog timeDialog = new Dialog(container.getContext());
        timeDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        timeDialog.setContentView(R.layout.popup_time);
        timeDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));


        Button time_select_button = rootView.findViewById(R.id.select_time_button);
        time_select_button.setOnClickListener(view -> {
            timeDialog.show();
            TimePicker timePicker = timeDialog.findViewById(R.id.time_picker);
            Button button_cancel = timeDialog.findViewById(R.id.cancel_button);
            button_cancel.setOnClickListener(view1 -> {
                timeDialog.dismiss();
            });
            Button button_ok = timeDialog.findViewById(R.id.ok_button);
            button_ok.setOnClickListener(view1 -> {
                time = timePicker.getHour()+"시"+timePicker.getMinute()+"분";
                time_edit.setText(time);
                timeDialog.dismiss();
            });

        });

        return rootView;
    }



    @Override
    public void onDetach() {
        super.onDetach();
        updateActivity = null;
    }
}
