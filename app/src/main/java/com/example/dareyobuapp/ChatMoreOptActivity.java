package com.example.dareyobuapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ChatMoreOptActivity extends AppCompatActivity {

    private String strChatName;
    private TextView tvChatName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_more_opt);

        tvChatName = (TextView) findViewById(R.id.tv_useracct_name);

        setTitle("More Options");

        //called functions
        getDataIntent();
    }

    public void getDataIntent() {
        Bundle bundle = this.getIntent().getExtras();

        if (bundle != null) {
            strChatName = bundle.getString("chat_name");
            tvChatName.setText(strChatName);
        }

    }
}
