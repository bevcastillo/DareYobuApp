package com.example.dareyobuapp.user_fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dareyobuapp.R;
import com.example.dareyobuapp.tabs_fragment.UserAllResTabFragment;
import com.example.dareyobuapp.tabs_fragment.UserCompletedResTabFragment;
import com.example.dareyobuapp.tabs_fragment.UserPendingResTabFragment;
import com.example.dareyobuapp.adapters.UserResPagerAdapter;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class UserReservationFragment extends Fragment {

    private AppBarLayout appBarLayout;
    private TabLayout tabLayoutUserRes;
    private ViewPager viewPagerUserRes;

    public UserReservationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_user_reservation, container, false);

        appBarLayout = (AppBarLayout) view.findViewById(R.id.appbar_user_reservation);
        tabLayoutUserRes = (TabLayout) view.findViewById(R.id.tabLayout_user_reservation);
        viewPagerUserRes = (ViewPager) view.findViewById(R.id.vPager_user_reservation);

        UserResPagerAdapter adapter = new UserResPagerAdapter(getFragmentManager());
        adapter.AddFragment(new UserAllResTabFragment(),"All");
        adapter.AddFragment(new UserPendingResTabFragment(), "Pending");
        adapter.AddFragment(new UserCompletedResTabFragment(), "Completed");

        viewPagerUserRes.setAdapter(adapter);
        tabLayoutUserRes.setupWithViewPager(viewPagerUserRes);

        return view;
    }



}
