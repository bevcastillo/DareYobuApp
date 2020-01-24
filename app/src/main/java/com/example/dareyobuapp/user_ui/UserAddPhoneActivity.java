package com.example.dareyobuapp.user_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.dareyobuapp.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class UserAddPhoneActivity extends AppCompatActivity implements View.OnClickListener {

    private TextInputLayout inputLayoutPhone;
    private TextInputEditText inputEditTextPhone;
    private TextView tvSkip;
    private Button btnSendOtp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_add_phone);

        setTitle("Create your user account");

        inputLayoutPhone = (TextInputLayout) findViewById(R.id.textInputLayout_housenumber);
        inputEditTextPhone = (TextInputEditText) findViewById(R.id.inputEditText_username);
        tvSkip = (TextView) findViewById(R.id.tv_add_phone_skip);
        btnSendOtp = (Button) findViewById(R.id.btn_send_otp);

        tvSkip.setOnClickListener(this);
        btnSendOtp.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        switch (id) {
            case R.id.tv_add_phone_skip:
                break;
            case R.id.btn_send_otp:
                Intent toVerifyIntent = new Intent(UserAddPhoneActivity.this, UserVerifyOTPActivity.class);
                startActivity(toVerifyIntent);
                break;
        }
    }
}
