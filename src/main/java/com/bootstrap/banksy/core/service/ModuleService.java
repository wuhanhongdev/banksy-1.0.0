package com.bootstrap.banksy.core.service;

import com.alibaba.fastjson.JSON;
import com.bootstrap.banksy.core.domain.SysModule;
import com.bootstrap.banksy.core.mapper.SysModuleMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ModuleService {

    private final static Logger logger = LoggerFactory.getLogger(ModuleService.class);
    @Autowired
    private SysModuleMapper moduleMapper;

    /**
     * 查询资源
     * @param params
     * @return
     */
    public List<SysModule> selectModules(SysModule params) {
        return moduleMapper.selectAll(params);
    }

    public int save(SysModule button) {
        logger.info("保存资源信息:{}", JSON.toJSONString(button));

        return moduleMapper.insertSelective(button);
    }
}
