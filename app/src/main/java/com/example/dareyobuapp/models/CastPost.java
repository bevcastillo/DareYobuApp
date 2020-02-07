package com.example.dareyobuapp.models;

public class CastPost {
    String castName, postDateTime, postContent;

    public CastPost() {
    }

    public CastPost(String castName, String postDateTime, String postContent) {
        this.castName = castName;
        this.postDateTime = postDateTime;
        this.postContent = postContent;
    }

    public String getCastName() {
        return castName;
    }

    public void setCastName(String castName) {
        this.castName = castName;
    }

    public String getPostDateTime() {
        return postDateTime;
    }

    public void setPostDateTime(String postDateTime) {
        this.postDateTime = postDateTime;
    }

    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }
}
