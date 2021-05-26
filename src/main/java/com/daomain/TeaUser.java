package com.daomain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TeaUser {

    @JsonProperty(value = "TUSER")
    private String tUser;
    @JsonProperty(value = "TPASS")
    private String tPass;

    public TeaUser(String tUser, String tPass) {
        this.tUser = tUser;
        this.tPass = tPass;
    }

    public TeaUser() {
    }

    public String gettUser() {
        return tUser;
    }

    public void settUser(String tUser) {
        this.tUser = tUser;
    }

    public String gettPass() {
        return tPass;
    }

    public void settPass(String tPass) {
        this.tPass = tPass;
    }
}
