package com.example.dareyobuapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.example.dareyobuapp.adapters.ViewCastProfileAdapter;
import com.example.dareyobuapp.cast_fragments.CastHomeFragment;
import com.example.dareyobuapp.cast_tabs_fragment.CastCouponsTabFragment;
import com.example.dareyobuapp.cast_tabs_fragment.CastMediaTabFragment;
import com.example.dareyobuapp.cast_tabs_fragment.CastPostTabFragment;
import com.example.dareyobuapp.cast_tabs_fragment.CastReviewsTabFragment;
import com.example.dareyobuapp.tabs_fragment.UserCompletedResTabFragment;
import com.example.dareyobuapp.tabs_fragment.UserPendingResTabFragment;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.tabs.TabLayout;

public class ViewCastProfileActivity extends AppCompatActivity {

    private TabLayout tabLayoutViewProfile;
    private ViewPager viewPagerViewProfile;
    private CollapsingToolbarLayout collapsingToolbarLayout;
    private AppBarLayout appBarLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_cast_profile);

//        setTitle("");

        tabLayoutViewProfile = (TabLayout) findViewById(R.id.tabLayout_view_profile);
        viewPagerViewProfile = (ViewPager) findViewById(R.id.vPager_view_profile);
        collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsingToolbar_view_cast_profile);
        appBarLayout = (AppBarLayout) findViewById(R.id.appbarLayout_view_cast_profile);

        ViewCastProfileAdapter adapter = new ViewCastProfileAdapter(getSupportFragmentManager());
        adapter.AddFragment(new CastPostTabFragment(),"Posts");
        adapter.AddFragment(new CastMediaTabFragment(), "Media");
        adapter.AddFragment(new CastCouponsTabFragment(), "Coupons");
        adapter.AddFragment(new CastReviewsTabFragment(), "Reviews");

        viewPagerViewProfile.setAdapter(adapter);
        tabLayoutViewProfile.setupWithViewPager(viewPagerViewProfile);

        //handles the appbar title change when collapsed
        appBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            boolean isShow = true;
            int scrollRange = 1;

            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int i) {
                if (Math.abs(i)-appBarLayout.getTotalScrollRange() == 0) {
                    setTitle("Beverly May Castillo"); //when collapsed
                } else {
                    setTitle(" ");
                }

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.add_favorites, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        return super.onOptionsItemSelected(item);
    }
}
