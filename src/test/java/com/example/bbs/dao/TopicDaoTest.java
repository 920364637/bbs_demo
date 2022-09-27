package com.example.bbs.dao;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.bbs.app.Application;

@SpringBootTest(classes = Application.class)
public class TopicDaoTest {
    @Autowired
    TopicDao dao;

    @Test
    void findTopicPreviewByUserId() {
        List<Map<String, Object>> topicPreList = dao.findTopicPreviewByUserId(0);
        System.out.println(topicPreList + "");
    }

}
