package com.example.bbs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.bbs.model.Comment;

@Repository
@Mapper
public interface CommentMapper {
    Comment findCommentByCommentId(long commentId);

    List<Comment> findCommentByTopicId(long topicId);

    void insert(Comment comment);
}
