package com.example.dareyobuapp.user_fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.dareyobuapp.R;
import com.example.dareyobuapp.adapters.CastTalentListAdapter;
import com.example.dareyobuapp.models.CastPerson;
import com.example.dareyobuapp.models.SectionDataModel;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class UserHomeFragment extends Fragment {
    private RecyclerView mRecyclerview;
    ArrayList<SectionDataModel> allSampleData = new ArrayList<>();

    public UserHomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view = inflater.inflate(R.layout.fragment_user_home, container, false);

       populateDataModels();
       mRecyclerview = (RecyclerView) view.findViewById(R.id.rv_all_profile_hor_list);
        mRecyclerview.setHasFixedSize(true);
        CastTalentListAdapter adapter = new CastTalentListAdapter(allSampleData, getContext());
        mRecyclerview.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        mRecyclerview.setAdapter(adapter);

       return view;
    }

    private void populateDataModels() {
        ArrayList<SectionDataModel> sectionDataModels = new ArrayList<SectionDataModel>();
        sectionDataModels.add(new SectionDataModel("Singer"));
        sectionDataModels.add(new SectionDataModel("Dancer"));
        sectionDataModels.add(new SectionDataModel("Magician"));
        sectionDataModels.add(new SectionDataModel("Male"));
        sectionDataModels.add(new SectionDataModel("Female"));
        sectionDataModels.add(new SectionDataModel("Programmer"));

        for (int i = 0; i < sectionDataModels.size(); i++) {
            SectionDataModel dm = new SectionDataModel();
            dm.setHeaderTitle(sectionDataModels.get(i).getHeaderTitle());

            ArrayList<CastPerson> singleItem = new ArrayList<CastPerson>();
            for (int j = 0; j <= 5; j++) {
                singleItem.add(new CastPerson(R.drawable.ic_bev, "Legend", "Beverly May Castillo", "Minglanilla Cebu", "500"));
                singleItem.add(new CastPerson(R.drawable.ic_matias, "Legend", "Matias Enad", "Carcar Cebu", "150"));
                singleItem.add(new CastPerson(R.drawable.ic_june, "Legend", "June Aragoncillo", "Cebu City", "450"));
                singleItem.add(new CastPerson(R.drawable.ic_karl, "Legend", "Karl Jasen Tapangan", "Mandaue Cebu", "850"));
            }

            dm.setPersonlist(singleItem);
            allSampleData.add(dm);
        }
    }

}
