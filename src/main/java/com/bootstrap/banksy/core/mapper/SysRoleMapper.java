package com.bootstrap.banksy.core.mapper;

import java.util.List;

import com.bootstrap.banksy.core.domain.SysRole;

public interface SysRoleMapper {

    int insertSelective(SysRole role);

    int insertList(List<SysRole> roles);

    List<SysRole> selectAll(SysRole role);

    int updateSelective(SysRole role);

    int deleteById(String id);
}
