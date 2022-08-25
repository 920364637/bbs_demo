package com.example.bbs.model;

public class User {
    private long userId;
    private String name;
    private String password;
    private String avatarUrl;

    public User() {
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public long getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

}