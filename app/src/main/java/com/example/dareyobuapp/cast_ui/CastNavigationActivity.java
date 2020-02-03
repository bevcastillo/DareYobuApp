package com.example.dareyobuapp.cast_ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.dareyobuapp.cast_fragments.CastHomeFragment;
import com.example.dareyobuapp.cast_fragments.CastMyPageFragment;
import com.example.dareyobuapp.cast_fragments.CastReservationFragment;
import com.example.dareyobuapp.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class CastNavigationActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    private BottomNavigationView castBottomView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cast_navigation);

        castBottomView = (BottomNavigationView) findViewById(R.id.navbar_cast);

        castBottomView.setOnNavigationItemSelectedListener(this);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.cast_content_container, new CastHomeFragment()).commit();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        Fragment selectedCastFragment = null;

        int id = menuItem.getItemId();

        switch (id) {
            case R.id.nav_cast_home:
                selectedCastFragment = new CastHomeFragment();
                break;
            case R.id.nav_cast_reservation:
                selectedCastFragment = new CastReservationFragment();
                break;
            case R.id.nav_cast_mypage:
                selectedCastFragment = new CastMyPageFragment();
                break;
        }

        getSupportFragmentManager().beginTransaction().replace(R.id.cast_content_container, selectedCastFragment).commit();

        return true;
    }
}
