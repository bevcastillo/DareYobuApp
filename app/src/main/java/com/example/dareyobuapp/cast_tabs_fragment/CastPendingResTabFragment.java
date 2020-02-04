package com.example.dareyobuapp.cast_tabs_fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dareyobuapp.R;

public class CastPendingResTabFragment extends Fragment {

    private RecyclerView rvPendingCastRes;

    public CastPendingResTabFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cast_pending_res_tab, container, false);

        rvPendingCastRes = (RecyclerView) view.findViewById(R.id.rv_pending_cast_res);

        return view;
    }
}
