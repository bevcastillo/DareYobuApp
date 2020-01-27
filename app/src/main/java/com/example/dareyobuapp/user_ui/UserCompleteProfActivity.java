package com.example.dareyobuapp.user_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.dareyobuapp.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class UserCompleteProfActivity extends AppCompatActivity implements View.OnClickListener {

    private TextInputLayout inputLayoutLname, inputLayoutFname, inputLayoutUname, inputLayoutPassw;
    private TextInputEditText inputEditTextLname, inputEditTextFname, inputEditTextUname, inputEditTextPassw;
    private Button btnUserCreateAcct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_complete_prof);

        setTitle("Create your user account");

        inputLayoutFname = (TextInputLayout) findViewById(R.id.textInputLayout_fname);
        inputLayoutLname = (TextInputLayout) findViewById(R.id.textInputLayout_lname);
        inputLayoutUname = (TextInputLayout) findViewById(R.id.inputLayout_user_username);
        inputLayoutPassw = (TextInputLayout) findViewById(R.id.inputLayout_user_passw);
        inputEditTextFname = (TextInputEditText) findViewById(R.id.inputEditText_fname);
        inputEditTextLname = (TextInputEditText) findViewById(R.id.inputEditText_lname);
        inputEditTextUname = (TextInputEditText) findViewById(R.id.inputedit_user_username);
        inputEditTextPassw = (TextInputEditText) findViewById(R.id.inputedit_user_passw);
        btnUserCreateAcct = (Button) findViewById(R.id.button3);

        btnUserCreateAcct.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        switch (id) {
            case R.id.button3:
                Intent toUserHome = new Intent(UserCompleteProfActivity.this, UserNavigationActivity.class);
                startActivity(toUserHome);
                break;
        }
    }
}
