package com.example.dareyobuapp.models;

public class UserBlacklistObj {

    int castImage;
    String castName, castTalent;
    int castAge;

    public UserBlacklistObj() {
    }

    public UserBlacklistObj(String castName, String castTalent, int castAge) {
        this.castName = castName;
        this.castTalent = castTalent;
        this.castAge = castAge;
    }

    public int getCastImage() {
        return castImage;
    }

    public void setCastImage(int castImage) {
        this.castImage = castImage;
    }

    public String getCastName() {
        return castName;
    }

    public void setCastName(String castName) {
        this.castName = castName;
    }

    public int getCastAge() {
        return castAge;
    }

    public void setCastAge(int castAge) {
        this.castAge = castAge;
    }

    public String getCastTalent() {
        return castTalent;
    }

    public void setCastTalent(String castTalent) {
        this.castTalent = castTalent;
    }
}
