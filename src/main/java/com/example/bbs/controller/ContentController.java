package com.example.bbs.controller;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.bbs.context.Context;
import com.example.bbs.response.content.TopicDetailResponse;
import com.example.bbs.response.content.TopicListResponse;
import com.example.bbs.service.ContentService;

@RestController
@RequestMapping("/content")
public class ContentController {

    @Resource(name = "ContentService")
    ContentService service;

    @GetMapping(value = "/topicList", produces = "application/json;charset=utf-8")
    Context topicList(@RequestParam Map<String, Object> params) {
        Context context = new Context(params, new TopicListResponse());
        service.topicList(context);
        return context;
    }

    @GetMapping(value = "/topicDetail", produces = "application/json;charset=utf-8")
    Context topicDetail(@RequestParam Map<String, Object> params) {
        Context context = new Context(params, new TopicDetailResponse());
        service.topicDetail(context);
        return context;
    }

    @PostMapping(value = "/publishTopic", produces = "application/json;charset=utf-8")
    Context publishTopic(@RequestParam Map<String, Object> params) {
        Context context = new Context(params);
        service.publicTopic(context);
        return context;
    }

}
