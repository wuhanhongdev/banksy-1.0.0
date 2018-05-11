package com.bootstrap.banksy.core.mapper;

import com.bootstrap.banksy.core.domain.SysModule;

import java.util.List;
import java.util.Map;

public interface SysModuleMapper {
    int deleteByPrimaryKey(String id);

    int insert(SysModule record);

    int insertSelective(SysModule record);

    SysModule selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SysModule record);

    int updateByPrimaryKeyWithBLOBs(SysModule record);

    int updateByPrimaryKey(SysModule record);

    List<SysModule> selectByMap(Map<String, Object> params);
}