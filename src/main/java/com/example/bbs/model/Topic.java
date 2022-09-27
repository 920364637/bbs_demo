package com.example.bbs.model;

import java.util.Random;

import com.example.bbs.mapper.TopicMapper;

import lombok.Data;

@Data
public class Topic {
    private long id;
    private long userId;
    private long topicId;
    private long zoneId;
    private String title;
    private String content;
    private String publishTime;

    public static long generateTopicId(TopicMapper topicMapper) {
        Random r = new Random();
        long id;
        Topic topic;
        do {
            id = (long) (r.nextInt(899999999) + 100000000);
            topic = topicMapper.findTopicByTopicId(id);
        } while (topic != null);

        return id;
    }
}
