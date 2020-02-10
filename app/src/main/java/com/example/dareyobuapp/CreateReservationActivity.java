package com.example.dareyobuapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.dareyobuapp.user_fragments.CreateRes1Fragment;
import com.example.dareyobuapp.user_fragments.CreateRes2Fragment;
import com.example.dareyobuapp.user_fragments.CreateRes3Fragment;

public class CreateReservationActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnNext;
    private int count = 0;
    private Dialog mDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_reservation);

        btnNext = (Button) findViewById(R.id.create_res_btn);

        mDialog = new Dialog(CreateReservationActivity.this);


        //listeners
        btnNext.setOnClickListener(this);

        setTitle("Let's choose an address");
        showFragment1(); //call this function to show the fragment layout

    }

    private void showFragment1() {
        FragmentManager fm1 = getSupportFragmentManager();
        FragmentTransaction ft1 = fm1.beginTransaction();
        ft1.add(R.id.fragment_holder, new CreateRes1Fragment());
        ft1.commit();
    }

    private void showFragment2() {
        FragmentManager fm2 = getSupportFragmentManager();
        FragmentTransaction ft2 = fm2.beginTransaction();
        ft2.replace(R.id.fragment_holder, new CreateRes2Fragment());
        ft2.commit();
    }

    private void showFragment3() {
        FragmentManager fm3 = getSupportFragmentManager();
        FragmentTransaction ft3 = fm3.beginTransaction();
        ft3.replace(R.id.fragment_holder, new CreateRes3Fragment());
        ft3.commit();
    }

    public void showSuccess() {
        mDialog.setContentView(R.layout.custom_success_mssg);

        TextView textView = (TextView) mDialog.findViewById(R.id.tv_mssg_content);
        Button button = (Button) mDialog.findViewById(R.id.btn_send_mssg);

        textView.setText("Reservation request has been sent to the cast. Please wait for confirmation.");
        button.setText("Go back to search");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        mDialog.show();
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        switch (id) {
            case R.id.create_res_btn:
                count++;
                if (count == 1) {
                    showFragment2();
                    setTitle("Let's add date and time");
                }
                if (count == 2) {
                    showFragment3();
                    setTitle("Reservation Details");
                    btnNext.setText("Reserve now");
                } if (count == 3) {
                    showSuccess();
                }
                break;
        }
    }

}
