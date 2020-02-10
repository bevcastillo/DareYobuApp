package com.example.dareyobuapp.models;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dareyobuapp.R;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class SectionListAdapter extends RecyclerView.Adapter<SectionListAdapter.ViewHolder> {
    private ArrayList<CastPerson> personArrayList;
    private Context context;

    public SectionListAdapter(ArrayList<CastPerson> personArrayList, Context context) {
        this.personArrayList = personArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_profile_view, parent, false);
        final ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        CastPerson data = personArrayList.get(position);

        holder.ivImage.setImageResource(data.getImage());
        holder.tvName.setText(data.getName());
        holder.tvRank.setText(data.getLevel());
        holder.tvLocation.setText(data.getPlace());
//        holder.tvRate.setText(data.getPrice());

    }

    @Override
    public int getItemCount() {
        return personArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvRank, tvName, tvRating, tvRate, tvLocation;
        ImageView ivImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvRank = (TextView) itemView.findViewById(R.id.tv_cast_rank);
            ivImage = (ImageView) itemView.findViewById(R.id.iv_cast_profile_picture);
            tvName = (TextView) itemView.findViewById(R.id.tv_cast_name);
            tvLocation = (TextView) itemView.findViewById(R.id.tv_cast_location);
            tvRank = (TextView) itemView.findViewById(R.id.tv_cast_rate);
        }
    }
}
