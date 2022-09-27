package com.example.bbs.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.bbs.app.Application;
import com.example.bbs.model.User;

@SpringBootTest(classes = Application.class)
class UserMapperTests {

    @Autowired
    UserMapper userMapper;

    @Test
    void insert() {
        User user = new User();
        user.setName("51222276623");
        user.setPassword("123455523316");
        user.setUserId(User.generateUserId(userMapper));
        userMapper.insert(user);

        User u = userMapper.findUserByUserId(45363562523l);
        System.out.println(u);
    }


    @Test
    void update(){
        User user = userMapper.findUserByUserId(1956358874l);
        user.setName("yesItsMe");
        userMapper.update(user);
    }
}
