package com.example.bbs.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.bbs.app.Application;
import com.example.bbs.model.User;

@SpringBootTest(classes = Application.class)
public class UserDaoTests {

    @Autowired
    UserDao dao;

    @Test
    void insert() {

        User user = new User();
        user.setName("123561888512");
        user.setPassword("564565432");

        boolean flag = dao.insert(user);
        if (!flag) {
            System.out.println("fail!");
        } else {
            System.out.println("success!");
        }
    }

    @Test
    void update(){
        User user = dao.findUserByUserId(1956358874l);
        user.setName("ohmygod");
        boolean flag = dao.update(user);
        if (!flag) {
            System.out.println("fail!");
        } else {
            System.out.println("success!");
        }
    }

}
