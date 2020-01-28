package com.example.dareyobuapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dareyobuapp.R;
import com.example.dareyobuapp.models.UserReviewsObj;
import com.example.dareyobuapp.user_ui.UserReviewsActivity;

import java.util.List;

public class UserReviewsAdapter extends RecyclerView.Adapter<UserReviewsAdapter.ViewHolder> {

    Context context;
    List<UserReviewsObj> list;

    public UserReviewsAdapter(Context context, List<UserReviewsObj> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_review_layout, parent, false);
        final ViewHolder viewHolder = new ViewHolder(v);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        UserReviewsObj data = list.get(position);

        holder.rCastName.setText(data.getCastName());
        holder.rCastTalent.setText(data.getCastTalent());
        holder.rContent.setText(data.getCastReviewContent());
        holder.rDate.setText(data.getReviewDate());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView rCastName, rCastTalent, rDate, rContent;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            rCastName = (TextView) itemView.findViewById(R.id.tv_user_review_name);
            rCastTalent = (TextView) itemView.findViewById(R.id.tv_user_review_talent);
            rDate = (TextView) itemView.findViewById(R.id.textView6);
            rContent = (TextView) itemView.findViewById(R.id.textView5);
        }
    }
}
