package com.bootstrap.banksy.core.domain;

import com.bootstrap.banksy.core.base.BaseModel;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class SysModule extends BaseModel {
    /**
     * 父模块ID
     */
    private String parentId;

    /**
     * 模块级别：0、主窗体模块；1、普通业务模块；2、业务子模块
     */
    private Integer level;

    /**
     * 名称
     */
    private String name;

    /**
     * 页面名称
     */
    private String pageName;

    /**
     * 模块主数据表名称
     */
    private String datatable;

    /**
     * 模块注册时间
     */
    private Date registerTime;

    /**
     * 请求路径
     */
    private String location;

    /**
     * 描述
     */
    private String description;
}