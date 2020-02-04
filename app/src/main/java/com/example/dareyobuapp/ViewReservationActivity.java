package com.example.dareyobuapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.dareyobuapp.splash_screen.MainActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ViewReservationActivity extends AppCompatActivity {

//    @BindView(R2.id.btn_resv_confirm) Button btnConfirm;
//    @BindView(R.id.btn_resv_confirm) Button btnConfirm;

    Dialog mDialog;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_reservation);

        setTitle("View Reservation");

//        @BindView(R2.id.user) EditText username;

        ButterKnife.bind(this);

        //
        mDialog = new Dialog(ViewReservationActivity.this);

    }

    @OnClick(R.id.btn_resv_confirm)
    public void submit() {
        mDialog.setContentView(R.layout.custom_success_mssg);
        mDialog.show();
    }


}
