package com.example.bbs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bbs.dao.UserDao;
import com.example.bbs.model.User;
import com.example.bbs.response.user.LoginResponse;
import com.example.bbs.util.Context;

@Service
public class UserService {
    @Autowired
    UserDao dao;

    public void Login(Context context) {
        long userId = Long.parseLong((String) context.request.get("user_id"));
        String password = (String) context.request.get("password");
        User user = dao.findUserByUserId(userId);
        if (user == null) {
            context.code = 1;
            context.message = "用户不存在";
            context.response = null;
            return;
        }

        if (!password.equals(user.getPassword())) {
            context.code = 1;
            context.message = "密码错误";
            context.response = null;
            return;
        }

        ((LoginResponse) context.response).user_id = user.getUserId();
    }

}
