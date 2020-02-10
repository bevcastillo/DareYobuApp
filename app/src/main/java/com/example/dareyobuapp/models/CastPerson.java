package com.example.dareyobuapp.models;

public class CastPerson {
    private int image;
    private String level, name, place, price;

    public CastPerson() {
    }

    public CastPerson(int image, String level, String name, String place, String price) {
        this.image = image;
        this.level = level;
        this.name = name;
        this.place = place;
        this.price = price;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
