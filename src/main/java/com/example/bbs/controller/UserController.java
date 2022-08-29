package com.example.bbs.controller;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.bbs.context.Context;
import com.example.bbs.response.user.LoginResponse;
import com.example.bbs.response.user.RegisterResponse;
import com.example.bbs.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource(name = "UserService")
    UserService service;

    @PostMapping(value = "/register", produces = "application/json;charset=utf-8")
    public Context register(@RequestParam Map<String, Object> params) {
        Context context = new Context(params, new RegisterResponse());
        service.register(context);
        return context;
    }

    @GetMapping(value = "/login", produces = "application/json;charset=utf-8")
    public Context login(@RequestParam Map<String, Object> params) {
        Context context = new Context(params, new LoginResponse());
        service.login(context);
        return context;
    }
}
