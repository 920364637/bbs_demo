package com.example.bbs.util;

import java.util.Map;

import com.example.bbs.response.Response;

public class Context {
    public int code;
    public String message = "success";
    public Response response;
    public Map<String, Object> request;

    public class ResponseData {
        int code;
        String message;
        Response response;

        public ResponseData(int code, String message, Response response) {
            this.code = code;
            this.message = message;
            this.response = response;
        }

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public Response getResponse() {
            return response;
        }

        public void setResponse(Response response) {
            this.response = response;
        }

    }

    public Context(Map<String, Object> request, Response response) {
        this.response = response;
        this.request = request;
    }

    public ResponseData getResponse() {
        return new ResponseData(code, message, response);
    }

}
