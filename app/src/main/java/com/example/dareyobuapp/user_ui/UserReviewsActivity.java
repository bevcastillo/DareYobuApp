package com.example.dareyobuapp.user_ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.dareyobuapp.R;
import com.example.dareyobuapp.adapters.UserMailAdapter;
import com.example.dareyobuapp.adapters.UserMailPagerAdapter;
import com.example.dareyobuapp.adapters.UserReviewsAdapter;
import com.example.dareyobuapp.models.UserMailObj;
import com.example.dareyobuapp.models.UserReviewsObj;
import com.example.dareyobuapp.tabs_fragment.UserAllReviewTabFragment;
import com.example.dareyobuapp.tabs_fragment.UserReviewHistoryTabFragment;
import com.example.dareyobuapp.tabs_fragment.UserToReviewTabFragment;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class UserReviewsActivity extends AppCompatActivity {

    private TabLayout tabLayoutUserReview;
    private ViewPager viewPagerUserReview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_reviews);

        setTitle("Reviews");

        tabLayoutUserReview = (TabLayout) findViewById(R.id.tabLayout_user_reviews);
        viewPagerUserReview = (ViewPager) findViewById(R.id.vPager_user_review);

        getSupportActionBar().setElevation(0);

        UserMailPagerAdapter adapter = new UserMailPagerAdapter(getSupportFragmentManager());
        adapter.AddFragment(new UserAllReviewTabFragment(), "All");
        adapter.AddFragment(new UserToReviewTabFragment(), "To Review");
        adapter.AddFragment(new UserReviewHistoryTabFragment(), "History");

        viewPagerUserReview.setAdapter(adapter);
        tabLayoutUserReview.setupWithViewPager(viewPagerUserReview);
    }
}
