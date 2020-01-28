package com.example.dareyobuapp.user_fragments;


import android.os.Build;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;

import com.example.dareyobuapp.R;
import com.example.dareyobuapp.adapters.UserMailAdapter;
import com.example.dareyobuapp.adapters.UserReservationAdapter;
import com.example.dareyobuapp.models.UserMailObj;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class UserMailFragment extends Fragment {

    private RecyclerView rvAllUserMail;
    private List<UserMailObj> list;

    public UserMailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_user_mail, container, false);

//        if(Build.VERSION.SDK_INT >= 21){
//            Window window  = getActivity().getWindow();
//            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
//            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
////            window.setStatusBarColor(this.getResources().getColor(R.color.colorPrimary));
//        }

        rvAllUserMail = (RecyclerView) view.findViewById(R.id.rv_all_user_mail);

        return view;
    }

    @Override
    public void onStart() {
        list = new ArrayList<>();

        list.add(
                new UserMailObj(
                       "Yukiyama Wakiko", "Getting sincere about something; applying oneself seriously to a job.", "28 Jan", "Unread"
                )
        );
        list.add(
                new UserMailObj(
                        "Momoi Chiharu", "Having confidence in a specific outcome; being almost sure about something.", "20 Jan", "Unread"
                )
        );
        list.add(
                new UserMailObj(
                        "Serizawa Rie", "Falling deeply in love with another person.", "20 Jan", "Unread"
                )
        );
        list.add(
                new UserMailObj(
                        "Nara Kame", "When something is about to begin, get serious, or put to the test.", "20 Jan", "Unread"
                )
        );

        UserMailAdapter adapter = new UserMailAdapter(getActivity(), list);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        rvAllUserMail.setLayoutManager(layoutManager);
        rvAllUserMail.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
        rvAllUserMail.setItemAnimator(new DefaultItemAnimator());

        rvAllUserMail.setAdapter(adapter);

        super.onStart();
    }
}
