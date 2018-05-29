package com.bootstrap.banksy.core.mapper;


import java.util.List;

import com.bootstrap.banksy.core.domain.SysOrg;

public interface SysOrgMapper {

    int insertSelective(SysOrg org);

    int insertList(List<SysOrg> orgs);

    List<SysOrg> selectAll(SysOrg org);

    int updateSelective(SysOrg org);

    int deleteById(String id);
}
