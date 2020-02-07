package com.example.dareyobuapp.adapters;

import android.content.Context;
import android.location.Address;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dareyobuapp.R;
import com.example.dareyobuapp.models.AddressObj;

import java.util.List;

public class AddressAdapter extends RecyclerView.Adapter<AddressAdapter.ViewHolder> {
    Context context;
    List<AddressObj> list;

    public AddressAdapter(Context context, List<AddressObj> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_address_layout, parent, false);
        final ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        AddressObj data = list.get(position);

        //To add 1 to an address to remove 0 from the start e.g. Address 0 to Address 1
        int addressCount = position + 1;

        holder.tvAddrNum.setText("Address "+ addressCount);
        holder.tvAddr.setText(data.getAddress());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvAddrNum, tvAddr;
        ImageView ivEditAddr;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvAddrNum = (TextView) itemView.findViewById(R.id.tv_addr_num);
            tvAddr = (TextView) itemView.findViewById(R.id.tv_address);
            ivEditAddr = (ImageView) itemView.findViewById(R.id.iv_edit_addr);
        }
    }
}
