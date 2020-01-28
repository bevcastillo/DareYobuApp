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
import com.example.dareyobuapp.adapters.UserReviewsAdapter;
import com.example.dareyobuapp.models.UserReviewsObj;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class UserReviewHistoryTabFragment extends Fragment {

    private RecyclerView rvUserRevHistory;
    private List<UserReviewsObj> list;

    public UserReviewHistoryTabFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_user_review_history, container, false);

        rvUserRevHistory = (RecyclerView) view.findViewById(R.id.rv_history_user_review);

        return view;
    }

    @Override
    public void onStart() {
        list = new ArrayList<>();

        list.add(
            new UserReviewsObj(
                "Yashiro Kannon", "Singer", "When something is about to begin, get serious, or put to the test.", "20 Jan", 4
            )
        );
        list.add(
                new UserReviewsObj(
                        "Hatake Tsunayoshi", "Singer", "Being angry about something that happened in the past.", "20 Jan", 4
                )
        );
        list.add(
                new UserReviewsObj(
                        "Uegaki Yoshitoki", "Singer", "Something that occurs too early before preparations are ready. Starting too soon..", "20 Jan", 4
                )
        );
        list.add(
                new UserReviewsObj(
                        "Hara Hirokichi", "Singer", "To keep going, pressing forward; never stopping.", "20 Jan", 4
                )
        );
        list.add(
                new UserReviewsObj(
                        "Kuroda Sozui", "Singer", "To be taken by surprise.", "20 Jan", 4
                )
        );
        list.add(
                new UserReviewsObj(
                        "Kawamoto Haruki", "Singer", "High quality, exceptional; something that's very valuable..", "20 Jan", 4
                )
        );

        UserReviewsAdapter adapter = new UserReviewsAdapter(getActivity(), list);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        rvUserRevHistory.setLayoutManager(layoutManager);
        rvUserRevHistory.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
        rvUserRevHistory.setItemAnimator(new DefaultItemAnimator());

        rvUserRevHistory.setAdapter(adapter);

        super.onStart();
    }

}
