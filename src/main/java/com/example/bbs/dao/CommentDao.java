package com.example.bbs.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.bbs.mapper.CommentMapper;

@Repository
public class CommentDao {
    @Autowired
    CommentMapper commentMapper;

}