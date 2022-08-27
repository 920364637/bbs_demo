package com.example.bbs.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.bbs.response.user.LoginResponse;
import com.example.bbs.service.UserService;
import com.example.bbs.util.Context;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService service;

    @GetMapping(value = "/login", produces = "application/json")
    public Context.ResponseData login(@RequestParam Map<String, Object> params) {
        Context context = new Context(params, new LoginResponse());
        service.Login(context);
        return context.getResponse();
    }
}
