package com.example.bbs.model;

import java.util.Random;

import com.example.bbs.mapper.UserMapper;

public class User {
    private long id;
    private long userId;
    private String name;
    private String password;
    private String avatarUrl;
    private String registerTime;

    public User() {
    }

    public static long generateUserId(UserMapper userMapper) {
        Random r = new Random();
        long id;
        User user;
        do {
            id = (long) (r.nextInt(899999999) + 100000000);
            user = userMapper.findUserByUserId(id);
        } while (user != null);

        return id;
    }

    @Override
    public String toString() {
        return String.format("%s, %s", name, password);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(String registerTime) {
        this.registerTime = registerTime;
    }

}