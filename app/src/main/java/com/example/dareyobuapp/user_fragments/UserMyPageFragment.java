package com.example.dareyobuapp.user_fragments;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.dareyobuapp.R;
import com.example.dareyobuapp.user_ui.UserCouponsActivity;
import com.example.dareyobuapp.user_ui.UserSettingsActivity;
import com.example.dareyobuapp.user_ui.UserBlacklistActivity;
import com.example.dareyobuapp.user_ui.UserLikesFavActivity;
import com.example.dareyobuapp.user_ui.UserReviewsActivity;


/**
 * A simple {@link Fragment} subclass.
 */
public class UserMyPageFragment extends Fragment implements View.OnClickListener {

    private ImageView ivUserSettings;
    private LinearLayout layoutPending, layoutOnGoing, layoutCompleted, layoutToReview,
            layoutCancelled, layoutCoupons, layoutReviews, layoutLikes, layoutBlacklist;


    public UserMyPageFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_user_my_page, container, false);

        //
        ivUserSettings = (ImageView) view.findViewById(R.id.imageView2);
        layoutPending = (LinearLayout) view.findViewById(R.id.layout_user_prof_pending);
        layoutOnGoing = (LinearLayout) view.findViewById(R.id.layout_user_prof_ongoing);
        layoutCompleted = (LinearLayout) view.findViewById(R.id.linearLayout3);
        layoutToReview = (LinearLayout) view.findViewById(R.id.linearLayout4);
        layoutCancelled = (LinearLayout) view.findViewById(R.id.layout_user_prof_cancelled);
        layoutCoupons = (LinearLayout) view.findViewById(R.id.layout_user_coupons);
        layoutReviews = (LinearLayout) view.findViewById(R.id.layout_user_reviews);
        layoutLikes = (LinearLayout) view.findViewById(R.id.layout_user_likes);
        layoutBlacklist = (LinearLayout) view.findViewById(R.id.linearLayout8);

        ivUserSettings.setOnClickListener(this);
        layoutPending.setOnClickListener(this);
        layoutOnGoing.setOnClickListener(this);
        layoutCompleted.setOnClickListener(this);
        layoutToReview.setOnClickListener(this);
        layoutCancelled.setOnClickListener(this);
        layoutCoupons.setOnClickListener(this);
        layoutReviews.setOnClickListener(this);
        layoutLikes.setOnClickListener(this);
        layoutBlacklist.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        switch (id) {
            case R.id.imageView2: // to settings
                Intent toSettingsIntent = new Intent(getActivity(), UserSettingsActivity.class);
                startActivity(toSettingsIntent);
                break;
            case R.id.layout_user_prof_pending:
                break;
            case R.id.layout_user_prof_ongoing:
                break;
            case R.id.linearLayout3: // to completed user-cast reservations
                break;
            case R.id.linearLayout4: //toReview items
                break;
            case R.id.layout_user_prof_cancelled:
                break;
            case R.id.layout_user_coupons:
                Intent toCouponsIntent = new Intent(getActivity(), UserCouponsActivity.class);
                startActivity(toCouponsIntent);
                break;
            case R.id.layout_user_reviews:
                Intent toReviewsIntent = new Intent(getActivity(), UserReviewsActivity.class);
                startActivity(toReviewsIntent);
                break;
            case R.id.layout_user_likes:
                Intent toLikesIntent = new Intent(getActivity(), UserLikesFavActivity.class);
                startActivity(toLikesIntent);
                break;
            case R.id.linearLayout8: // to blacklisted casts
                Intent toBlacklistIntent = new Intent(getActivity(), UserBlacklistActivity.class);
                startActivity(toBlacklistIntent);
                break;
        }
    }
}
