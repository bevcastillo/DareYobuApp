package com.example.dareyobuapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dareyobuapp.R;
import com.example.dareyobuapp.models.SectionDataModel;

import java.util.ArrayList;
import java.util.List;

public class CastTalentListAdapter extends RecyclerView.Adapter<CastTalentListAdapter.ViewHolder> {
    private List<SectionDataModel> dataModels;
    private Context context;

    public CastTalentListAdapter(ArrayList<SectionDataModel> dataModels, Context context) {
        this.dataModels = dataModels;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_talent_list, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final String sectionName = dataModels.get(position).getHeaderTitle();

        ArrayList singleSectionItems = dataModels.get(position).getPersonlist();
        holder.tvItemTitle.setText(sectionName);

        CastProfileListAdapter itemListDataAdapter = new CastProfileListAdapter(singleSectionItems, context);
        holder.rvList.setHasFixedSize(true);
        holder.rvList.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        holder.rvList.setAdapter(itemListDataAdapter);
    }

    @Override
    public int getItemCount() {
        return dataModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvItemTitle;
        RecyclerView rvList;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvItemTitle = (TextView) itemView.findViewById(R.id.tv_cast_talent_title);
            rvList = (RecyclerView) itemView.findViewById(R.id.rv_cst_talent_list);
        }
    }
}
