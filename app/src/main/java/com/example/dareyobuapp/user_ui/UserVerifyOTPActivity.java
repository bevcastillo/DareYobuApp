package com.example.dareyobuapp.user_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.dareyobuapp.R;

public class UserVerifyOTPActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnVerifyCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_verify_otp);

        setTitle("Create your user account");

        btnVerifyCode = (Button) findViewById(R.id.btn_phone_verify);

        btnVerifyCode.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        switch (id) {
            case R.id.btn_phone_verify:
                Intent toCompleteIntent = new Intent(UserVerifyOTPActivity.this, UserCompleteProfActivity.class);
                startActivity(toCompleteIntent);
                break;
        }
    }
}
