package com.example.dareyobuapp.models;

public class UserMailObj {
    String castName, castMessage, mailTime, mailStat;

    public UserMailObj() {
    }

    public UserMailObj(String castName, String castMessage, String mailTime, String mailStat) {
        this.castName = castName;
        this.castMessage = castMessage;
        this.mailTime = mailTime;
        this.mailStat = mailStat;
    }

    public String getCastName() {
        return castName;
    }

    public void setCastName(String castName) {
        this.castName = castName;
    }

    public String getCastMessage() {
        return castMessage;
    }

    public void setCastMessage(String castMessage) {
        this.castMessage = castMessage;
    }

    public String getMailTime() {
        return mailTime;
    }

    public void setMailTime(String mailTime) {
        this.mailTime = mailTime;
    }

    public String getMailStat() {
        return mailStat;
    }

    public void setMailStat(String mailStat) {
        this.mailStat = mailStat;
    }
}
