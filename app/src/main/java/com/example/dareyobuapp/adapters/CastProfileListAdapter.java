package com.example.dareyobuapp.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dareyobuapp.CreateReservationActivity;
import com.example.dareyobuapp.R;
import com.example.dareyobuapp.ViewCastProfileActivity;
import com.example.dareyobuapp.ViewReservationActivity;
import com.example.dareyobuapp.models.CastPerson;

import java.util.ArrayList;

public class CastProfileListAdapter extends RecyclerView.Adapter<CastProfileListAdapter.ViewHolder> {
    private ArrayList<CastPerson> personArrayList;
    private Context context;

    public CastProfileListAdapter(ArrayList<CastPerson> personArrayList, Context context) {
        this.personArrayList = personArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_profile_view, parent, false);
        final ViewHolder viewHolder = new ViewHolder(view);

        viewHolder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String castName = personArrayList.get(viewHolder.getAdapterPosition()).getName();

                Intent createReservationIntent = new Intent(v.getContext(), ViewCastProfileActivity.class);
                createReservationIntent.putExtra("cast_name", castName);
                v.getContext().startActivity(createReservationIntent);
            }
        });
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        CastPerson data = personArrayList.get(position);

        holder.ivImage.setImageResource(data.getImage());
        holder.tvName.setText(data.getName());
        holder.tvRank.setText(data.getLevel());
        holder.tvLocation.setText(data.getPlace());
        holder.tvRate.setText(data.getPrice());

    }

    @Override
    public int getItemCount() {
        return personArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvRank, tvName, tvRating, tvRate, tvLocation;
        ImageView ivImage;
        CardView cardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvRank = (TextView) itemView.findViewById(R.id.tv_cast_rank);
            ivImage = (ImageView) itemView.findViewById(R.id.iv_cast_profile_picture);
            tvName = (TextView) itemView.findViewById(R.id.tv_cast_name);
            tvLocation = (TextView) itemView.findViewById(R.id.tv_cast_location);
            tvRate = (TextView) itemView.findViewById(R.id.tv_cast_rate);
            cardView = (CardView) itemView.findViewById(R.id.card_view_profile);

        }
    }
}
