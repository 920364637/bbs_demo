package com.example.bbs.model;

public class Topic {
    private long id;
    private long userId;
    private long topicId;
    private String title;
    private String content;
    private String pubishTime;

    public Topic() {
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

    public String getPubishTime() {
        return pubishTime;
    }

    public void setPubishTime(String pubishTime) {
        this.pubishTime = pubishTime;
    }

}
