package com.example.dareyobuapp.user_fragments;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dareyobuapp.AddNewAddrActivity;
import com.example.dareyobuapp.R;
import com.example.dareyobuapp.adapters.AddressAdapter;
import com.example.dareyobuapp.models.AddressObj;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class CreateRes1Fragment extends Fragment implements View.OnClickListener {

    private RecyclerView rvAllUserAddr;
    private TextView tvBtnAddNewAddr;
    private List<AddressObj> list;

    public CreateRes1Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_create_res1, container, false);

        rvAllUserAddr = (RecyclerView) view.findViewById(R.id.rv_all_user_addr);
        tvBtnAddNewAddr = (TextView) view.findViewById(R.id.tv_add_new_user_addr);

        //adding listners
        tvBtnAddNewAddr.setOnClickListener(this);

        return view;
    }

    @Override
    public void onStart() {
        super.onStart();

        displayAllUserAddr();
    }

    private void displayAllUserAddr() {
        list = new ArrayList<>();

        list.add(
                new AddressObj("3-7, Shiba Daimon 1-chome, Minato-ku, Tokyo")
        );
        list.add(
                new AddressObj("472-1134, Nakagoku Miyanohara, Joetsu-shi, Niigata")
        );
        list.add(
                new AddressObj("3-20, Toranomon 4-chome, Minato-ku, Tokyo")
        );

        AddressAdapter adapter = new AddressAdapter(getActivity(), list);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        rvAllUserAddr.setLayoutManager(layoutManager);
        rvAllUserAddr.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
        rvAllUserAddr.setItemAnimator(new DefaultItemAnimator());

        rvAllUserAddr.setAdapter(adapter);

    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        switch (id) {
            case R.id.tv_add_new_user_addr:
                Intent toAddNewAddr = new Intent(getActivity(), AddNewAddrActivity.class);
                startActivity(toAddNewAddr);
                break;
        }
    }
}
