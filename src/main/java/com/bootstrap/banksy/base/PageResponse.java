package com.bootstrap.banksy.base;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

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

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public boolean isSue() {
        return sue;
    }

    public void setSue(boolean sue) {
        this.sue = sue;
    }

    public List getRes() {
        return res;
    }

    public void setRes(List res) {
        this.res = res;
    }
}
