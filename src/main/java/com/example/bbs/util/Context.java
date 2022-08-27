package com.example.bbs.util;

import java.util.Map;

import com.example.bbs.response.Response;

public class Context {
    public int code;
    public String message = "success";
    public Response data;
    public Map<String, Object> request;

    public class ResponseData {
        int code = Response.CODE_OK;
        String message;
        Response data;

        public ResponseData(int code, String message, Response data) {
            this.code = code;
            this.message = message;
            this.data = data;
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

        public Response getData() {
            return data;
        }

        public void setData(Response data) {
            this.data = data;
        }

    }

    public Context(Map<String, Object> request, Response data) {
        this.data = data;
        this.request = request;
    }

    public ResponseData getResponse() {
        return new ResponseData(code, message, data);
    }

}
