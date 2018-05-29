package com.bootstrap.banksy.core.service;

import com.alibaba.fastjson.JSON;
import com.bootstrap.banksy.core.domain.SysOrg;
import com.bootstrap.banksy.core.mapper.SysOrgMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrgService {
    private final static Logger logger = LoggerFactory.getLogger(OrgService.class);
    @Autowired
    private SysOrgMapper orgMapper;

    public int save(SysOrg org) {
        logger.info("保存机构/部门信息:{}", JSON.toJSONString(org));
        return orgMapper.insertSelective(org);
    }
}
