package com.bootstrap.banksy.core.base;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
public class BaseModel implements Serializable {

    protected String id;
    /**
     * 创建人ID
     */
    protected String creatorUserid;

    /**
     * 创建时间
     */
    protected Date createTime;

    /**
     * 更新人ID
     */
    protected String updateUserid;

    /**
     * 更新时间
     */
    protected Date updateTime;

    /**
     * 乐观锁版本号
     */
    protected String version;

    /**
     * 是否有效：0、物理删除；1、正常；
     */
    protected Integer isDel;
}
