package com.example.dareyobuapp.tabs_fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dareyobuapp.R;
import com.example.dareyobuapp.adapters.UserReservationAdapter;
import com.example.dareyobuapp.models.UserResObj;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class UserCompletedResTabFragment extends Fragment {

    private RecyclerView rvCompUserRes;
    List<UserResObj> list;


    public UserCompletedResTabFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_user_completed_res_tab, container, false);

        rvCompUserRes = (RecyclerView) view.findViewById(R.id.rv_completed_user_res);

        return view;
    }

    @Override
    public void onStart() {
        list = new ArrayList<>();

        list.add(
                new UserResObj(
                        "Tokuma Shigeki", "Singer", "26 Jan", "Completed"
                )
        );
        list.add(
                new UserResObj(
                        "Shishido Korechika", "Singer", "23 Jan", "Completed"
                )
        );
        list.add(
                new UserResObj(
                        "Yabūchi Manzo", "Dancer", "18 Jan", "Completed"
                )
        );
        list.add(
                new UserResObj(
                        "Yamamoto Yoriyuki", "Singer", "12 Jan", "Completed"
                )
        );
        list.add(
                new UserResObj(
                        "Yuhara Kunimichi", "Programmer", "08 Jan", "Completed"
                )
        );

        UserReservationAdapter adapter = new UserReservationAdapter(getActivity(), list);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        rvCompUserRes.setLayoutManager(layoutManager);
        rvCompUserRes.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
        rvCompUserRes.setItemAnimator(new DefaultItemAnimator());

        rvCompUserRes.setAdapter(adapter);
        super.onStart();
    }
}
