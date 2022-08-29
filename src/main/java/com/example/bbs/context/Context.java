package com.example.bbs.context;

import java.util.Map;

import com.example.bbs.response.Response;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class Context {
    public int code = Response.CODE_OK;
    public String message = "success";
    public Response data;

    @JsonIgnore
    public Map<String, Object> request;

    public Context(Map<String, Object> request) {
        this.request = request;
    }

    public Context(Map<String, Object> request, Response data) {
        this.data = data;
        this.request = request;
    }

}
