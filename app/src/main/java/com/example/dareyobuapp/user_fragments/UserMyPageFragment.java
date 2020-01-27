package com.example.dareyobuapp.user_fragments;


import android.os.Build;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;

import com.example.dareyobuapp.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class UserMyPageFragment extends Fragment {


    public UserMyPageFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_user_my_page, container, false);

        return view;
    }

}
