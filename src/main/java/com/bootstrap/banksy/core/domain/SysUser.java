package com.bootstrap.banksy.core.domain;

import com.bootstrap.banksy.core.base.BaseModel;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SysUser extends BaseModel {

    /**
     * 用户名
     */
    private String name;

    /**
     * 登录名
     */
    private String loginname;

    /**
     * 登录密码，保存密码的MD5值，初始密码123456
     */
    private String password;

    /**
     * 是否预置：0、自定；1、预置
     */
    private Boolean builtin;

    /**
     * 是否有效：0、无效；1、有效
     */
    private Boolean validity;

    /**
     * 描述
     */
    private String description;
}