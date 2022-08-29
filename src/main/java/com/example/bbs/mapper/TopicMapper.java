package com.example.bbs.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import org.springframework.stereotype.Repository;

import com.example.bbs.model.Topic;

@Repository
@Mapper
public interface TopicMapper {
    public Topic findTopicByTopicId(long topicId);

    public List<Map<String, Object>> findTopicPreviewByUserId(long userId);

    public List<Map<String, Object>> findTopicPreviewByZoneId(long zoneId);

    public void insert(Topic topic);

}
