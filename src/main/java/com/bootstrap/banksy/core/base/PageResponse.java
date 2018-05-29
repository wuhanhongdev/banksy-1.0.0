package com.bootstrap.banksy.core.base;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class PageResponse implements Serializable {

    private Long total;
    private boolean sue;
    private List res;

    public static  PageResponse ok(Long total, List res){
        PageResponse model = new PageResponse();
        model.setSue(true);
        model.setTotal(total);
        model.setRes(res);

        return model;
    }

    public static  PageResponse error(){
        PageResponse model = new PageResponse();
        model.setTotal(0L);
        model.setSue(true);
        model.setRes(new ArrayList<>());

        return model;
    }
}
