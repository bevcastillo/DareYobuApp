package com.example.dareyobuapp.models;

public class UserReviewsObj {
    String castName, castTalent, castReviewContent, reviewDate;
    int reviewScore;

    public UserReviewsObj() {
    }

    public UserReviewsObj(String castName, String castTalent, String castReviewContent, String reviewDate, int reviewScore) {
        this.castName = castName;
        this.castTalent = castTalent;
        this.castReviewContent = castReviewContent;
        this.reviewDate = reviewDate;
        this.reviewScore = reviewScore;
    }

    public String getCastName() {
        return castName;
    }

    public void setCastName(String castName) {
        this.castName = castName;
    }

    public String getCastTalent() {
        return castTalent;
    }

    public void setCastTalent(String castTalent) {
        this.castTalent = castTalent;
    }

    public String getCastReviewContent() {
        return castReviewContent;
    }

    public void setCastReviewContent(String castReviewContent) {
        this.castReviewContent = castReviewContent;
    }

    public String getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(String reviewDate) {
        this.reviewDate = reviewDate;
    }

    public int getReviewScore() {
        return reviewScore;
    }

    public void setReviewScore(int reviewScore) {
        this.reviewScore = reviewScore;
    }
}
