package com.example.dareyobuapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class UserLoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_login);

        setTitle("Sign in to your user account");
    }
}
