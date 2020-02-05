package com.example.dareyobuapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dareyobuapp.R;
import com.example.dareyobuapp.models.CastPost;

import java.util.List;

public class CastPostAdapter extends RecyclerView.Adapter<CastPostAdapter.ViewHolder> {
    Context context;
    List<CastPost> list;

    public CastPostAdapter(Context context, List<CastPost> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;
        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_post_layout, parent, false);
        final ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        CastPost data = list.get(position);

        holder.tvCastName.setText(data.getCastName());
        holder.tvPostDateTime.setText(data.getPostDateTime());
        holder.tvPostContent.setText(data.getPostContent());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvCastName, tvPostDateTime, tvPostContent;
        ImageView ivMore;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvCastName = (TextView) itemView.findViewById(R.id.tv_post_name);
            tvPostDateTime = (TextView) itemView.findViewById(R.id.tv_post_date_time);
            tvPostContent = (TextView) itemView.findViewById(R.id.tv_cast_post_content);
            ivMore = (ImageView) itemView.findViewById(R.id.iv_more_details);
        }
    }
}
