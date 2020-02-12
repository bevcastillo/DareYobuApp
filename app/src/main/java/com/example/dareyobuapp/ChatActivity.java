package com.example.dareyobuapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ChatActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.tv_chat_cast_name) TextView castName;

    private EditText etTextMssgArea;
    private TextView tvSendMssg;
    private String chatName;

    private Dialog emptyDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        etTextMssgArea = (EditText) findViewById(R.id.editText2);
        tvSendMssg = (TextView) findViewById(R.id.tv_send_mssg);

        //listeners
        tvSendMssg.setOnClickListener(this);

        ButterKnife.bind(this);
        emptyDialog = new Dialog(ChatActivity.this);

        toEnableSend();
        getDataFromIntent();
    }

    public void getDataFromIntent() {
        Bundle bundle = this.getIntent().getExtras();
        if (bundle != null) {
            chatName = bundle.getString("chat_name");

            setTitle(chatName);
            castName.setText(chatName); //setting the name from included layout
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_chat, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        switch (id) {
            case R.id.action_call:
                return true;
            case R.id.action_video_call:
                return true;
            case R.id.action_info:
                passIntentData();
                return true;
                default:
                    return super.onOptionsItemSelected(item);
        }
    }

    public void toEnableSend() {
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
    }

    public void passIntentData() {
        Intent intent = new Intent(ChatActivity.this, ChatMoreOptActivity.class);
        intent.putExtra("chat_name", chatName);
        startActivity(intent);
    }

    //functions for intent
}
