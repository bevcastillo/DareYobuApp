package com.example.dareyobuapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;

public class ReportUserActivity extends AppCompatActivity implements View.OnClickListener {

    private ConstraintLayout constraintDisrespectful, constraintHarras, constraintThreat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report_user);

        setTitle("Report this user");

        constraintDisrespectful = (ConstraintLayout) findViewById(R.id.constraint_disrespectful);
        constraintHarras = (ConstraintLayout) findViewById(R.id.constraint_harras);
        constraintThreat = (ConstraintLayout) findViewById(R.id.constraint_threat);

        constraintDisrespectful.setOnClickListener(this);
        constraintHarras.setOnClickListener(this);
        constraintThreat.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        switch (id) {
            case R.id.constraint_disrespectful:
                break;
            case R.id.constraint_harras:
                break;
            case R.id.constraint_threat:
                break;
        }
    }
}
