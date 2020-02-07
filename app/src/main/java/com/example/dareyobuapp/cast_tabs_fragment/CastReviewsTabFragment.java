package com.example.dareyobuapp.cast_tabs_fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dareyobuapp.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class CastReviewsTabFragment extends Fragment {

    private RecyclerView rvAllCastReviews;

    public CastReviewsTabFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cast_reviews_tab, container, false);

        rvAllCastReviews = (RecyclerView) view.findViewById(R.id.rv_all_cast_reviews);

        return view;
    }

}
