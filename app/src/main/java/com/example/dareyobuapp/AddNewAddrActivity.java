package com.example.dareyobuapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class AddNewAddrActivity extends AppCompatActivity implements View.OnClickListener {

    private TextInputLayout textInpLayoutStreet, textInpLayoutAddr1, textInpLayoutAddr2;
    private TextInputEditText textInpStreet, textInpAddr1, textInpAddr2;
    private Button btnAddAddr;
    private TextView tvGoMaps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_addr);

        setTitle("Add new address");

        textInpLayoutStreet = (TextInputLayout) findViewById(R.id.textInputLayout_street);
        textInpLayoutAddr1 = (TextInputLayout) findViewById(R.id.textInputLayout_addr1);
        textInpLayoutAddr2 = (TextInputLayout) findViewById(R.id.textInputLayout_addr2);
        textInpStreet = (TextInputEditText) findViewById(R.id.textInputEditText_street);
        textInpAddr1 = (TextInputEditText) findViewById(R.id.textInputEditText_addr1);
        textInpAddr2 =(TextInputEditText) findViewById(R.id.textInputEditText_addr2);
        btnAddAddr = (Button) findViewById(R.id.btn_add_addr);
        tvGoMaps = (TextView) findViewById(R.id.tv_go_to_maps);

        //adding listeners
        btnAddAddr.setOnClickListener(this);
        tvGoMaps.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        switch (id) {
            case R.id.tv_go_to_maps:
                toMaps();
                break;
            case R.id.btn_add_addr:
                addNewAddr();
                break;
        }
    }

    private void addNewAddr() {

    }

    private void toMaps() {

    }

    //functions of intents

}
