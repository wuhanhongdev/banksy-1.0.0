package com.bootstrap.banksy.core.base;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author wuhanhong
 * @date 2018 - 05 - 29
 */
@Getter
@Setter
public class Request implements Serializable {

    private String id;
    /**
     * 分页
     */
    public int offset;
    /**
     * 页码
   */
    public int limit;
    /**
     * 请求服务号
     */
    public String serviceNo;
}
