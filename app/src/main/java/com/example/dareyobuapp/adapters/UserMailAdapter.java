package com.example.dareyobuapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dareyobuapp.R;
import com.example.dareyobuapp.models.UserMailObj;

import java.util.List;

public class UserMailAdapter extends RecyclerView.Adapter<UserMailAdapter.ViewHolder> {

    Context context;
    List<UserMailObj> list;

    public UserMailAdapter(Context context, List<UserMailObj> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_user_mail_layout, parent, false);
        final ViewHolder viewHolder = new ViewHolder(v);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        UserMailObj data = list.get(position);

        holder.tvCastName.setText(data.getCastName());
        holder.tvMailMssg.setText(data.getCastMessage());
        holder.tvMailTime.setText(data.getMailTime());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvCastName, tvMailMssg, tvMailTime;
        Button btnMailStat;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvCastName = (TextView) itemView.findViewById(R.id.tv_user_cast_mail_name);
            tvMailMssg = (TextView) itemView.findViewById(R.id.tv_user_cast_mail_mssg);
            tvMailTime = (TextView) itemView.findViewById(R.id.tv_user_cast_mail_time);
            btnMailStat = (Button) itemView.findViewById(R.id.btn_user_cast_mail_status);
        }
    }
}
