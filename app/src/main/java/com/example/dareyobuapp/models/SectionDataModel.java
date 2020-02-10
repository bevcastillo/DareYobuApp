package com.example.dareyobuapp.models;

import android.app.Person;

import java.util.ArrayList;

public class SectionDataModel {
    private String headerTitle;
//    private ArrayList<Person> personList;
    private ArrayList<CastPerson> personlist;

    public SectionDataModel() {
    }

    public SectionDataModel(String headerTitle, ArrayList<CastPerson> personlist) {
        this.headerTitle = headerTitle;
        this.personlist = personlist;
    }

    public SectionDataModel(String headerTitle) {
        this.headerTitle = headerTitle;
    }

    public String getHeaderTitle() {
        return headerTitle;
    }

    public void setHeaderTitle(String headerTitle) {
        this.headerTitle = headerTitle;
    }

    public ArrayList<CastPerson> getPersonlist() {
        return personlist;
    }

    public void setPersonlist(ArrayList<CastPerson> personlist) {
        this.personlist = personlist;
    }
}
