package com.bootstrap.banksy.core.domain;

import com.bootstrap.banksy.core.base.BaseModel;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SysRole  extends BaseModel {

    /**
     * 名称
     */
    private String name;

    /**
     * 是否预置：0、自定；1、预置
     */
    private Integer builtin;

    /**
     * 描述
     */
    private String description;
}