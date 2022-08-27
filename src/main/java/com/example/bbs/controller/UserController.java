package com.example.bbs.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.bbs.response.user.LoginResponse;
import com.example.bbs.response.user.RegisterResponse;
import com.example.bbs.service.UserService;
import com.example.bbs.util.Context;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService service;

    @PostMapping(value = "/register", produces = "application/json;charset=utf-8")
    public Context.ResponseData register(@RequestParam Map<String, Object> params) {
        Context context = new Context(params, new RegisterResponse());
        service.register(context);
        return context.getResponse();
    }

    @GetMapping(value = "/login", produces = "application/json;charset=utf-8")
    public Context.ResponseData login(@RequestParam Map<String, Object> params) {
        Context context = new Context(params, new LoginResponse());
        service.Login(context);
        return context.getResponse();
    }
}
