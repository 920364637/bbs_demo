package com.example.bbs.model;

import lombok.Data;

@Data
public class Comment {
    private long id;
    private long userId;
    private long CommentId;
    private long topicId;
    private String content;
    private int floor;
    private String pubishTime;
}