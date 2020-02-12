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
import android.widget.TextView;
import android.widget.Toast;

import com.example.dareyobuapp.splash_screen.MainActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ViewReservationActivity extends AppCompatActivity {

    private Dialog mDialog;
    private Context context;
    private String strCastName, strReservStatus;
    private TextView tvCastName, tvReservStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_reservation);

        tvCastName = (TextView) findViewById(R.id.tv_res_cast_name);
        tvReservStatus = (TextView) findViewById(R.id.tv_res_status);

        setTitle("View Reservation");

        ButterKnife.bind(this);

        //
        mDialog = new Dialog(ViewReservationActivity.this);

        //
        getDataFromIntent();

    }

    @OnClick(R.id.btn_resv_confirm)
    public void submit() {
        mDialog.setContentView(R.layout.custom_success_mssg);
        mDialog.show();
    }

    public void getDataFromIntent() {
        Bundle bundle = this.getIntent().getExtras();

        if (bundle != null) {
            strCastName = bundle.getString("cast_name");
            strReservStatus = bundle.getString("res_status");

            tvCastName.setText(strCastName);
            tvReservStatus.setText(strReservStatus);
        }
    }

}
