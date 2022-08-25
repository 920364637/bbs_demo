package com.example.bbs.model;

public class Topic {
    private long userId;
    private long topicId;
    private String title;
    private String content;
    private int floorCount;
    private int likedCount;
    private int favoredCount;
    private String pubishTime;
    private Comment[] commentList;

    public Topic() {
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

    public int getFloorCount() {
        return floorCount;
    }

    public void setFloorCount(int floorCount) {
        this.floorCount = floorCount;
    }

    public int getLikedCount() {
        return likedCount;
    }

    public void setLikedCount(int likedCount) {
        this.likedCount = likedCount;
    }

    public int getFavoredCount() {
        return favoredCount;
    }

    public void setFavoredCount(int favoredCount) {
        this.favoredCount = favoredCount;
    }

    public String getPubishTime() {
        return pubishTime;
    }

    public void setPubishTime(String pubishTime) {
        this.pubishTime = pubishTime;
    }

    public Comment[] getCommentList() {
        return commentList;
    }

    public void setCommentList(Comment[] commentList) {
        this.commentList = commentList;
    }

}
