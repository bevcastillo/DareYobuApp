package com.example.dareyobuapp.user_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dareyobuapp.R;
import com.example.dareyobuapp.ViewCastProfileActivity;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class UserLoginActivity extends AppCompatActivity implements View.OnClickListener {

    private TextInputLayout inputLayoutUname, inputLayoutPassw;
    private TextInputEditText inputEditTextUname, inputEditTextPassw;
    private TextView tvForgotPassw, tvUserSignup;
    private ImageView ivFacebook, ivLine;
    private Button btnUserLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_login);

        setTitle("Sign in to your user account");

        inputLayoutUname = (TextInputLayout) findViewById(R.id.textInputLayout);
        inputLayoutPassw = (TextInputLayout) findViewById(R.id.textInputLayout2);
        inputEditTextUname = (TextInputEditText) findViewById(R.id.inputEditText_username);
        inputEditTextPassw = (TextInputEditText) findViewById(R.id.inputEditText_passw);
        tvForgotPassw = (TextView) findViewById(R.id.textView14);
        tvUserSignup = (TextView) findViewById(R.id.textView_user_signup);
        btnUserLogin = (Button) findViewById(R.id.button_user_signin);
        ivFacebook = (ImageView) findViewById(R.id.imageView_facebook);
        ivLine = (ImageView) findViewById(R.id.imageViewLine);

        btnUserLogin.setOnClickListener(this);
        tvUserSignup.setOnClickListener(this);
        tvForgotPassw.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        switch (id){
            case R.id.button_user_signin:
                Intent toHomeIntent = new Intent(UserLoginActivity.this, UserNavigationActivity.class);
                startActivity(toHomeIntent);
//                Intent sampleIntent = new Intent(this, ViewCastProfileActivity.class);
//                startActivity(sampleIntent);
                break;
            case R.id.textView_user_signup:
                Intent addLocationIntent = new Intent(UserLoginActivity.this, UserAddLocationActivity.class);
                startActivity(addLocationIntent);
                break;
            case R.id.textView14:
                break;
        }
    }
}
