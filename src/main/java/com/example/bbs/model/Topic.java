package com.example.bbs.model;

import java.util.Random;

import com.example.bbs.mapper.TopicMapper;

public class Topic {
    private long id;
    private long userId;
    private long topicId;
    private long zoneId;
    private String title;
    private String content;
    private String publishTime;

    public Topic() {
    }

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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getTopicId() {
        return topicId;
    }

    public void setTopicId(long topicId) {
        this.topicId = topicId;
    }

    public long getZoneId() {
        return zoneId;
    }

    public void setZoneId(long zoneId) {
        this.zoneId = zoneId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }

}
