package com.example.dareyobuapp.tabs_fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dareyobuapp.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class UserAllReviewTabFragment extends Fragment {


    public UserAllReviewTabFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_user_all_review, container, false);
    }

}
