package com.bootstrap.banksy.core.mapper;

import com.bootstrap.banksy.core.domain.SysOrg;

public interface SysOrgMapper {

    int deleteByPrimaryKey(String id);

    int insert(SysOrg record);

    int insertSelective(SysOrg record);

    SysOrg selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SysOrg record);

    int updateByPrimaryKey(SysOrg record);
}