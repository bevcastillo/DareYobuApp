package com.example.dareyobuapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dareyobuapp.R;
import com.example.dareyobuapp.models.UserBlacklistObj;
import com.example.dareyobuapp.user_ui.UserBlacklistActivity;

import java.util.List;

public class UserBlacklistAdapter extends RecyclerView.Adapter<UserBlacklistAdapter.ViewHolder> {

    Context context;
    private List<UserBlacklistObj> list;

    public UserBlacklistAdapter(Context context, List<UserBlacklistObj> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v;
        v = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_blacklist_layout, parent, false);
        final ViewHolder viewHolder = new ViewHolder(v);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        UserBlacklistObj data = list.get(position);

        holder.castNameAge.setText(data.getCastName()+", "+data.getCastAge());
        holder.castTalent.setText(data.getCastTalent());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView castNameAge, castTalent;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            castNameAge = (TextView) itemView.findViewById(R.id.tv_user_cast_blacklsit_name);
            castTalent = (TextView) itemView.findViewById(R.id.tv_user_cast_blacklist_talent);

        }
    }
}
