package com.example.dareyobuapp.adapters;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dareyobuapp.R;
import com.example.dareyobuapp.models.UserResObj;

import java.util.List;

public class UserReservationAdapter extends RecyclerView.Adapter<UserReservationAdapter.ViewHolder> {

    Context context;
    List<UserResObj> list;

    public UserReservationAdapter(Context context, List<UserResObj> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_user_res_layout, parent, false);
        final ViewHolder viewHolder = new ViewHolder(v);

        return viewHolder;
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        UserResObj data = list.get(position);

        holder.tvCastName.setText(data.getCast_name());
        holder.tvCastTalent.setText(data.getCast_talent());
        holder.tvResTime.setText(data.getCast_res_time());
        holder.btnResStat.setText(data.getCast_res_status());

        if (data.getCast_res_status().equals("Pending")) {
//            holder.btnResStat.getResources().getColor(R.color.colorWarning);
            holder.btnResStat.setBackgroundTintList(context.getResources().getColorStateList(R.color.colorWarning));
        }else if (data.getCast_res_status().equals("Completed")) {
//            holder.btnResStat.getResources().getColor(R.color.colorSuccess);
            holder.btnResStat.setBackgroundTintList(context.getResources().getColorStateList(R.color.colorSuccess));

        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvCastName, tvCastTalent, tvResTime;
        Button btnResStat;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvCastName = (TextView) itemView.findViewById(R.id.tv_user_cast_res_name);
            tvCastTalent = (TextView) itemView.findViewById(R.id.tv_user_cast_res_talent);
            tvResTime = (TextView) itemView.findViewById(R.id.tv_user_cast_res_time);
            btnResStat = (Button) itemView.findViewById(R.id.btn_user_cast_res_status);
        }
    }
}
