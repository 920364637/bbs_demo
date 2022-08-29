package com.example.bbs.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bbs.context.Context;
import com.example.bbs.dao.TopicDao;
import com.example.bbs.model.Topic;
import com.example.bbs.response.Response;
import com.example.bbs.response.content.TopicDetailResponse;
import com.example.bbs.response.content.TopicListResponse;
import com.example.bbs.service.ContentService;

@Service("ContentService")
public class ContentServiceImpl implements ContentService {
    @Autowired
    TopicDao dao;

    @Override
    public void topicDetail(Context context) {
        long topicId = Long.parseLong((String) context.request.get("topic_id"));
        Topic topic = dao.findTopicByTopicId(topicId);
        if (topic == null) {
            context.code = Response.CODE_ERROR;
            context.message = "帖子不存在";
            context.data = null;
            return;
        }
        ((TopicDetailResponse) context.data).topic = topic;
    }

    @Override
    public void topicList(Context context) {
        if (context.request.containsKey("user_id")) {
            long userId = Long.parseLong((String) context.request.get("user_id"));
            List<Map<String, Object>> topic_list = dao.findTopicPreviewByUserId(userId);
            ((TopicListResponse) context.data).topic_list = topic_list;
            return;
        }

        if (context.request.containsKey("zone_id")) {
            long zoneId = Long.parseLong((String) context.request.get("zone_id"));
            List<Map<String, Object>> topic_list = dao.findTopicPreviewByZoneId(zoneId);
            ((TopicListResponse) context.data).topic_list = topic_list;
            return;
        }

        context.code = Response.CODE_ERROR;
        context.message = "请求参数错误";
        context.data = null;
    }

    @Override
    public void publicTopic(Context context) {
        long userId = Long.parseLong((String) context.request.get("user_id"));
        String title = (String) context.request.get("title");
        String content = (String) context.request.get("content");
        Topic topic = new Topic();

        topic.setContent(content);
        topic.setTitle(title);
        topic.setUserId(userId);
        if(!dao.insert(topic)){
            context.code = Response.CODE_ERROR;
            context.message = "发布失败";
            context.data = null;
            return;
        }
    }

}
