package com.example.bbs.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.bbs.mapper.TopicMapper;
import com.example.bbs.model.Topic;

@Repository
public class TopicDao {
    @Autowired
    TopicMapper topicMapper;

    public Topic findTopicByTopicId(long topicId) {
        try {
            Topic topic = topicMapper.findTopicByTopicId(topicId);
            return topic;
        } catch (Exception e) {
            return null;
        }
    }

    public boolean insert(Topic topic) {
        try {
            long topicId = Topic.generateTopicId(topicMapper);
            topic.setTopicId(topicId);
            topicMapper.insert(topic);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<Map<String, Object>> findTopicPreviewByUserId(long userId) {
        try {
            List<Map<String, Object>> topicPreviewListMap = topicMapper.findTopicPreviewByUserId(userId);
            return topicPreviewListMap;
        } catch (Exception e) {
            return null;
        }
    }

    public List<Map<String, Object>> findTopicPreviewByZoneId(long zoneId) {
        try {
            List<Map<String, Object>> topicPreviewListMap = topicMapper.findTopicPreviewByZoneId(zoneId);
            return topicPreviewListMap;
        } catch (Exception e) {
            return null;
        }
    }
}