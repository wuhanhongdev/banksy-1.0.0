package com.bootstrap.banksy.core.base;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
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
}
