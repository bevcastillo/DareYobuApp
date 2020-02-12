package com.example.dareyobuapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class ChatMoreOptActivity extends AppCompatActivity implements View.OnClickListener {

    private String strChatName;
    private TextView tvChatName;
    private CardView cvBlockUser;
    private ConstraintLayout constraintLogs, constraintCalls, constraintNotifs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_more_opt);

        tvChatName = (TextView) findViewById(R.id.tv_useracct_name);
        cvBlockUser = (CardView) findViewById(R.id.cv_block_user);
        constraintLogs = (ConstraintLayout) findViewById(R.id.constraint_logs);
        constraintCalls = (ConstraintLayout) findViewById(R.id.constraint_call);

        setTitle("More Options");

        //called functions
        getDataIntent();


        //listeners
        cvBlockUser.setOnClickListener(this);
        constraintLogs.setOnClickListener(this);
        constraintCalls.setOnClickListener(this);
    }

    public void getDataIntent() {
        Bundle bundle = this.getIntent().getExtras();

        if (bundle != null) {
            strChatName = bundle.getString("chat_name");
            tvChatName.setText(strChatName);
        }

    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        switch (id) {
            case R.id.cv_block_user:
                showBlockDialog();
                break;
            case R.id.constraint_logs:
                break;
            case R.id.constraint_call:
                break;
        }
    }

    public void showBlockDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(ChatMoreOptActivity.this);

        builder.setTitle("Block "+strChatName+"?");
        builder.setMessage("You will no longer receive messages and calls from this contact.");
        builder.setPositiveButton("BlOCK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        builder.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    private void showDeleteDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(ChatMoreOptActivity.this);

        builder.setTitle("Delete this conversation?");
        builder.setMessage("Once you delete this conversation, it cannot be undone.");
        builder.setPositiveButton("DELETE", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        builder.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_more, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        switch (id) {
            case R.id.action_delete:
                showDeleteDialog();
                return true;
            case R.id.action_report:
                Intent intent = new Intent(ChatMoreOptActivity.this, ReportUserActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }
    }

}
