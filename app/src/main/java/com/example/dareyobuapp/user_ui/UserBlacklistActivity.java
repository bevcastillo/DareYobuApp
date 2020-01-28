package com.example.dareyobuapp.user_ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.dareyobuapp.R;
import com.example.dareyobuapp.adapters.UserBlacklistAdapter;
import com.example.dareyobuapp.models.UserBlacklistObj;

import java.util.ArrayList;
import java.util.List;

public class UserBlacklistActivity extends AppCompatActivity {

    private RecyclerView rvUserBlacklist;
    List<UserBlacklistObj> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_blacklist);

        setTitle("Blacklist");

        rvUserBlacklist = (RecyclerView) findViewById(R.id.recyclerView_user_blacklist);
    }

    @Override
    protected void onStart() {

        list = new ArrayList<>();

        list.add(
            new UserBlacklistObj(
                    "Iha Mokuami", "Singer", 23
            )
        );
        list.add(
                new UserBlacklistObj(
                        "Nobusawa Kan", "Dancer", 24
                )
        );
        list.add(
                new UserBlacklistObj(
                        "Enatsu Amane", "Magician", 24
                )
        );
        list.add(
                new UserBlacklistObj(
                        "Matsuoka Junichiro", "Singer", 24
                )
        );
        list.add(
                new UserBlacklistObj(
                        "Ige Yasushi", "Dancer", 24
                )
        );
        list.add(
                new UserBlacklistObj(
                        "Togoshi Marise", "Singer", 24
                )
        );

        UserBlacklistAdapter adapter = new UserBlacklistAdapter(this, list);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        rvUserBlacklist.setLayoutManager(layoutManager);
        rvUserBlacklist.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));
        rvUserBlacklist.setItemAnimator(new DefaultItemAnimator());

        rvUserBlacklist.setAdapter(adapter);

        super.onStart();
    }
}
