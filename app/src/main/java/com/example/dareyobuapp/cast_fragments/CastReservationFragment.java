package com.example.dareyobuapp.cast_fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dareyobuapp.R;
import com.example.dareyobuapp.adapters.CastResPagerAdapter;
import com.example.dareyobuapp.cast_tabs_fragment.CastAllResTabFragment;
import com.example.dareyobuapp.cast_tabs_fragment.CastCompletedResTabFragment;
import com.example.dareyobuapp.cast_tabs_fragment.CastPendingResTabFragment;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class CastReservationFragment extends Fragment {

    private AppBarLayout appBarLayoutCast;
    private TabLayout tabLayoutCastRes;
    private ViewPager viewPagerCast;

    public CastReservationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cast_reservation, container, false);

        appBarLayoutCast = (AppBarLayout) view.findViewById(R.id.appbar_cast_reservation);
        tabLayoutCastRes = (TabLayout) view.findViewById(R.id.tabLayout_cast_reservation);
        viewPagerCast = (ViewPager) view.findViewById(R.id.vPager_cast_reservation);

        CastResPagerAdapter adapter = new CastResPagerAdapter(getFragmentManager());
        adapter.AddFragment(new CastAllResTabFragment(), "All");
        adapter.AddFragment(new CastPendingResTabFragment(), "Pending");
        adapter.AddFragment(new CastCompletedResTabFragment(), "Completed");

        viewPagerCast.setAdapter(adapter);
        tabLayoutCastRes.setupWithViewPager(viewPagerCast);

        return view;
    }

}
