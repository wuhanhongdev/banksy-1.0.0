package com.bootstrap.banksy.base;

import java.io.Serializable;

public class Response implements Serializable {

    public static final Integer SUCCESS = 1;
    public static final Integer FAIL = -1;

    private Integer code;
    private String message;
    private Object data;

    public static Response ok(Object data){
        Response response = new Response();
        response.setCode(SUCCESS);
        response.setMessage("success");
        response.setData(data);
        return response;
    }

    public static Response error(String msg){
        Response response = new Response();
        response.setCode(FAIL);
        response.setMessage(msg);
        return response;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
