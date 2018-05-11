package com.bootstrap.banksy.core.domain;

import com.bootstrap.banksy.base.BaseModel;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class SysOrg extends BaseModel {

    /**
     * 父节点id
     */
    private String parentId;

    /**
     * 节点类型：1、机构；2、部门；3、职位
     */
    private Integer nodeType;

    /**
     * 序号
     */
    private Integer serNo;

    /**
     * 编码
     */
    private String code;

    /**
     * 名称
     */
    private String name;

    /**
     * 别名/简称
     */
    private String alias;

    /**
     * 全称
     */
    private String fullname;

    /**
     * 岗位id，字典
     */
    private String postid;

    /**
     * 是否有效：0、无效；1、有效
     */
    private Integer validity;

}