package com.example.dareyobuapp.models;

public class UserResObj {
    String cast_name, cast_talent, cast_res_time, cast_res_status;

    public UserResObj() {
    }

    public UserResObj(String cast_name, String cast_talent, String cast_res_time, String cast_res_status) {
        this.cast_name = cast_name;
        this.cast_talent = cast_talent;
        this.cast_res_time = cast_res_time;
        this.cast_res_status = cast_res_status;
    }

    public String getCast_name() {
        return cast_name;
    }

    public void setCast_name(String cast_name) {
        this.cast_name = cast_name;
    }

    public String getCast_talent() {
        return cast_talent;
    }

    public void setCast_talent(String cast_talent) {
        this.cast_talent = cast_talent;
    }

    public String getCast_res_time() {
        return cast_res_time;
    }

    public void setCast_res_time(String cast_res_time) {
        this.cast_res_time = cast_res_time;
    }

    public String getCast_res_status() {
        return cast_res_status;
    }

    public void setCast_res_status(String cast_res_status) {
        this.cast_res_status = cast_res_status;
    }
}
