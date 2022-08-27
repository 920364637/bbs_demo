package com.example.bbs.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.bbs.mapper.UserMapper;
import com.example.bbs.model.User;

@Repository
public class UserDao {

    @Autowired
    UserMapper userMapper;

    public UserDao() {
    }

    public boolean insert(User user) {
        try {
            user.setUserId(User.generateUserId(userMapper));
            userMapper.insert(user);
            return true;
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
            return false;
        }
    }

    public boolean update(User user){
        try {
            userMapper.update(user);
            return true;
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
            return false;
        }
    }

    public User findUserByUserId(long userId) {
        try {
            User user = userMapper.findUserByUserId(userId);
            return user;
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
            return null;
        }

    }

    public User findUserByName(String name){
        try {
            User user = userMapper.findUserByName(name);
            return user;
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
            return null;
        }
    }

}