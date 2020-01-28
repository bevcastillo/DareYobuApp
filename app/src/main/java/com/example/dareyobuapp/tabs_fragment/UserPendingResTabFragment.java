package com.example.dareyobuapp.tabs_fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

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
public class UserPendingResTabFragment extends Fragment {

    private RecyclerView rvPendingUserRes;
    private List<UserResObj> list;

    public UserPendingResTabFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_user_pending_res_tab, container, false);

        rvPendingUserRes = (RecyclerView) view.findViewById(R.id.rv_pending_user_res);

        return view;
    }

    @Override
    public void onStart() {
        list = new ArrayList<>();

        list.add(
                new UserResObj(
                        "Hayashida Tanak", "Magician", "24 Jan", "Pending"
                )
        );
        list.add(
                new UserResObj(
                        "Oye Iesada", "Dancer", "23 Jan", "Pending"
                )
        );
        list.add(
                new UserResObj(
                        "Koga Saionji", "Singer", "19 Jan", "Pending"
                )
        );
        list.add(
                new UserResObj(
                        "Tagawa Tsutomu", "Dancer", "14 Jan", "Pending"
                )
        );
        list.add(
                new UserResObj(
                        "Sakakibara Tarozaemon", "Dancer", "09 Jan", "Pending"
                )
        );

        UserReservationAdapter adapter = new UserReservationAdapter(getActivity(), list);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        rvPendingUserRes.setLayoutManager(layoutManager);
        rvPendingUserRes.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
        rvPendingUserRes.setItemAnimator(new DefaultItemAnimator());

        rvPendingUserRes.setAdapter(adapter);

        super.onStart();
    }
}
