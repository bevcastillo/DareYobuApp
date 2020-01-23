package com.example.dareyobuapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class UserConnectActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnUserLogin, btnCastLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_connect);

        //for image to fit windows/screen
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Window w = getWindow();
            w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }

        btnUserLogin = (Button) findViewById(R.id.btn_user);
        btnCastLogin = (Button) findViewById(R.id.btn_cast);

        btnUserLogin.setOnClickListener(this);
        btnCastLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        switch (id) {
            case R.id.btn_user:
                Intent userIntent = new Intent(UserConnectActivity.this, UserLoginActivity.class);
                startActivity(userIntent);
                break;
            case R.id.btn_cast:
                break;
        }
    }
}
