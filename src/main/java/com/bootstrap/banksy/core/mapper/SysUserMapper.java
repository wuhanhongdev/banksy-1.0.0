package com.bootstrap.banksy.core.mapper;

import java.util.List;
import com.bootstrap.banksy.core.domain.SysUser;

public interface SysUserMapper {

    int insertSelective( SysUser user);

    int insertList(List< SysUser> users);

    List<SysUser> selectAll( SysUser user);

    int updateSelective( SysUser user);

    int deleteById(String id);
}
