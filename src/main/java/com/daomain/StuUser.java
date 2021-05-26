package com.daomain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StuUser {

    @JsonProperty(value = "SUser")
    private String suser;

    @JsonProperty(value = "SPass")
    private String spass;

    public StuUser() {
    }

    public StuUser(String suser, String spass) {
        this.suser = suser;
        this.spass = spass;
    }

    public String getSuser() {
        return suser;
    }

    public void setSuser(String suser) {
        this.suser = suser;
    }

    public String getSpass() {
        return spass;
    }

    public void setSpass(String spass) {
        this.spass = spass;
    }

    @Override
    public String toString() {
        return "StuUser{" +
                "suser='" + suser + '\'' +
                ", spass='" + spass + '\'' +
                '}';
    }
}
