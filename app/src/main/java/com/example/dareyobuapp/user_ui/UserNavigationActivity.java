package com.example.dareyobuapp.user_ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;

import com.example.dareyobuapp.R;
import com.example.dareyobuapp.user_fragments.UserHomeFragment;
import com.example.dareyobuapp.user_fragments.UserMailFragment;
import com.example.dareyobuapp.user_fragments.UserMyPageFragment;
import com.example.dareyobuapp.user_fragments.UserReservationFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class UserNavigationActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    private BottomNavigationView userBottomView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_navigation);

//        if(Build.VERSION.SDK_INT >= 21){
//            Window window  = this.getWindow();
//            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
//            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
//            window.setStatusBarColor(this.getResources().getColor(R.color.colorPrimary));
//        }

        //////
        userBottomView = (BottomNavigationView) findViewById(R.id.navbar_user);

        userBottomView.setOnNavigationItemSelectedListener(this);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.user_content_container, new UserHomeFragment()).commit();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        Fragment selectedUserFragment = null;

        int id = menuItem.getItemId();

        switch (id) {
            case R.id.nav_home:
                selectedUserFragment = new UserHomeFragment();
                break;
            case R.id.nav_reservation:
                selectedUserFragment = new UserReservationFragment();
                break;
            case R.id.nav_mail:
                selectedUserFragment = new UserMailFragment();
                break;
            case R.id.nav_mypage:
                selectedUserFragment = new UserMyPageFragment();
                break;
        }

        getSupportFragmentManager().beginTransaction().replace(R.id.user_content_container, selectedUserFragment).commit();
        return true;
    }
}
