package com.example.dareyobuapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ChatActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText etTextMssgArea;
    private TextView tvSendMssg;
    private String chatName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        etTextMssgArea = (EditText) findViewById(R.id.editText2);
        tvSendMssg = (TextView) findViewById(R.id.tv_send_mssg);

        //listeners
        tvSendMssg.setOnClickListener(this);

        etTextMssgArea.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.toString().trim().length() > 0) {
                    tvSendMssg.setEnabled(true);
                    tvSendMssg.setTextColor(Color.RED);
                } else {
                    tvSendMssg.setEnabled(false);
                    tvSendMssg.setTextColor(Color.GRAY);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        getDataFromIntent();
    }

    public void getDataFromIntent() {
        Bundle bundle = this.getIntent().getExtras();
        if (bundle != null) {
            chatName = bundle.getString("chat_name");

            setTitle(chatName);
        }
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        switch (id) {
            case R.id.tv_send_mssg:
                break;
        }
    }
}
