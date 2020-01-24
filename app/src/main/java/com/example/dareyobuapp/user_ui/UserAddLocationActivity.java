package com.example.dareyobuapp.user_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.dareyobuapp.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class UserAddLocationActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView tvSkip;
    private TextInputLayout inputLayoutAddr;
    private TextInputEditText inputEditTextAddr;
    private Spinner spinnerProv, spinnerCity;
    private Button btnNext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_add_location);

        setTitle("Create your user account");

        tvSkip = (TextView) findViewById(R.id.tv_add_loc_skip);
        inputLayoutAddr = (TextInputLayout) findViewById(R.id.textInputLayout_housenumber);
        inputEditTextAddr = (TextInputEditText) findViewById(R.id.inputEditText_username);
        spinnerProv = (Spinner) findViewById(R.id.spinner_province);
        spinnerCity = (Spinner) findViewById(R.id.spinner_city);
        btnNext = (Button) findViewById(R.id.btn_location_next);

        tvSkip.setOnClickListener(this);
        btnNext.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        switch (id) {
            case R.id.tv_add_loc_skip:

                break;
            case R.id.btn_location_next:
                Intent toAddPhoneIntent = new Intent(UserAddLocationActivity.this, UserAddPhoneActivity.class);
                startActivity(toAddPhoneIntent);
                break;
        }
    }
}
