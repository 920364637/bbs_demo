package com.example.bbs.model;

import java.util.Random;

import com.example.bbs.mapper.UserMapper;

import lombok.Data;

@Data
public class User {
    private long id;
    private long userId;
    private String name;
    private String password;
    private String avatarUrl;
    private String registerTime;

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
}