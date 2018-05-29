package com.bootstrap.banksy.core.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

import com.bootstrap.banksy.core.domain.SysModule;

public interface SysModuleMapper {

    int insertSelective(SysModule module);

    int insertList(List<SysModule> modules);

    List<SysModule> selectAll(Map<String, Object> module);

    int updateSelective(SysModule module);

    int deleteById(String id);
}
