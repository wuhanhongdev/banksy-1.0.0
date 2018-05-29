package com.bootstrap.banksy.core.service;

import com.alibaba.fastjson.JSON;
import com.bootstrap.banksy.core.annotation.BanksyService;
import com.bootstrap.banksy.core.base.PageResponse;
import com.bootstrap.banksy.core.domain.SysModule;
import com.bootstrap.banksy.core.mapper.SysModuleMapper;
import com.bootstrap.banksy.request.MenuRequest;
import com.bootstrap.banksy.utils.ObjectUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 资源服务
 */
@Service
public class ModuleService {

    private final static Logger logger = LoggerFactory.getLogger(ModuleService.class);
    @Autowired
    private SysModuleMapper moduleMapper;

    @BanksyService(serviceNo = "F000100", description = "查询所有菜单")
    public List<SysModule> selectModules(SysModule sysModule) {
        Map<String, Object> params = ObjectUtils.beanToMap(sysModule);
        return  moduleMapper.selectAll(params);
    }

    @BanksyService(serviceNo = "F000101", description = "分页查询菜单")
    public PageResponse selectModules(MenuRequest request) {
        Map<String, Object> params = ObjectUtils.beanToMap(request);
        PageHelper.offsetPage(request.getOffset(), request.getLimit());
        List<SysModule> modules = moduleMapper.selectAll(params);
        PageInfo<SysModule> pageInfo = new PageInfo<>(modules);

        return PageResponse.ok(pageInfo.getTotal(), pageInfo.getList());
    }

    public int save(SysModule button) {
        logger.info("保存资源信息:{}", JSON.toJSONString(button));

        return moduleMapper.insertSelective(button);
    }
}
