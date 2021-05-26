package com.daomain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SysUser {
    @JsonProperty(value = "USERNAME")
    private String userName;
    @JsonProperty(value = "USERPWD")
    private String userPwd;

    public SysUser() {
    }

    public SysUser(String userName, String userPwd) {
        this.userName = userName;
        this.userPwd = userPwd;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    @Override
    public String toString() {
        return "SysUser{" +
                "userName='" + userName + '\'' +
                ", userPwd='" + userPwd + '\'' +
                '}';
    }
}
