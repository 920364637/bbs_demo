package com.example.bbs.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.bbs.model.User;

@Repository
@Mapper
public interface UserMapper {
    User findUserByUserId(long userId);

    User findUserByName(String name);

    void insert(User user);

    void update(User user);
}
