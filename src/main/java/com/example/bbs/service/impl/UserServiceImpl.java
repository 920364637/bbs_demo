package com.example.bbs.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bbs.context.Context;
import com.example.bbs.dao.UserDao;
import com.example.bbs.model.User;
import com.example.bbs.response.Response;
import com.example.bbs.response.user.LoginResponse;
import com.example.bbs.response.user.RegisterResponse;
import com.example.bbs.service.UserService;

@Service("UserService")
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao dao;

    @Override
    public void register(Context context) {
        String name = (String) context.request.get("name");
        String password = (String) context.request.get("password");
        String avatarUrl = (String) context.request.get("avatar_url");
        if (name == null || password == null) {
            context.code = 1;
            context.message = "missing argument";
            context.data = null;
            return;
        }
        User user = dao.findUserByName(name);
        if (user != null) {
            context.code = Response.CODE_ERROR;
            context.message = "用户名已存在";
            context.data = null;
            return;
        }
        user = new User();
        user.setName(name);
        user.setPassword(password);
        user.setAvatarUrl(avatarUrl);

        if (!dao.insert(user)) {
            context.code = Response.CODE_ERROR;
            context.message = "注册失败";
            context.data = null;
            return;
        }
        ((RegisterResponse) context.data).userId = user.getUserId();

    }

    @Override
    public void login(Context context) {
        String name = (String) context.request.get("name");
        String password = (String) context.request.get("password");
        if (name == null || password == null) {
            context.code = Response.CODE_ERROR;
            context.message = "missing argument";
            context.data = null;
            return;
        }

        User user = dao.findUserByName(name);
        if (user == null) {
            context.code = Response.CODE_ERROR;
            context.message = "用户不存在";
            context.data = null;
            return;
        }

        if (!password.equals(user.getPassword())) {
            context.code = Response.CODE_ERROR;
            context.message = "密码错误";
            context.data = null;
            return;
        }

        ((LoginResponse) context.data).user_id = user.getUserId();
    }
}
