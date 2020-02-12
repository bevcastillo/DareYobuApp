package com.example.dareyobuapp.cast_fragments;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.dareyobuapp.CreatePostActivity;
import com.example.dareyobuapp.R;
import com.example.dareyobuapp.adapters.CastPostAdapter;
import com.example.dareyobuapp.models.CastPost;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class CastHomeFragment extends Fragment implements View.OnClickListener {

    private RecyclerView rvAllPost;
    private List<CastPost> list;
    private FloatingActionButton fabWritePost;

    public CastHomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cast_home, container, false);

        rvAllPost = (RecyclerView) view.findViewById(R.id.rv_cast_all_post);
        fabWritePost = (FloatingActionButton) view.findViewById(R.id.fab_write_post);

        fabWritePost.setOnClickListener(this);

        return view;
    }

    @Override
    public void onStart() {
        list = new ArrayList<>();

        list.add(
                new CastPost(
                        "Beverly May Castillo", "today",
                        "As she contemplated the situation she found herself in, she knew she'd gotten herself in a little more than she bargained for. "
                )
        );
        list.add(
                new CastPost(
                        "Beverly May Castillo", "today",
                        "It wasn't often that she found herself in a tree staring down at a pack of wolves that were looking to make her their next meal."
                )
        );
        list.add(
                new CastPost(
                        "Beverly May Castillo", "today",
                        "I recollect that my first exploit in squirrel-shooting was in a grove of tall walnut-trees that shades one side of the valley."
                )
        );
        list.add(
                new CastPost(
                        "Beverly May Castillo", "today",
                        "I had wandered into it at noontime, when all nature is peculiarly quiet, and was startled by the roar of my own gun, as it broke the Sabbath stillness around and was prolonged and reverberated by the angry echoes."
                )
        );

        CastPostAdapter adapter = new CastPostAdapter(getActivity(), list);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        rvAllPost.setLayoutManager(layoutManager);
        rvAllPost.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, true));
        rvAllPost.setItemAnimator(new DefaultItemAnimator());

        rvAllPost.setAdapter(adapter);

        super.onStart();
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        switch (id) {
            case R.id.fab_write_post:
                Intent toCreatePostIntent = new Intent(getActivity(), CreatePostActivity.class);
                startActivity(toCreatePostIntent);
                break;
        }
    }
}
