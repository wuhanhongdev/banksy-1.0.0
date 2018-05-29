package com.bootstrap.banksy.base;

import com.bootstrap.banksy.core.domain.SysModule;
import com.bootstrap.banksy.core.service.ModuleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 系统初始化
 */
@Component
public class Initialize {
    private final static Logger logger = LoggerFactory.getLogger(Initialize.class);
    @Autowired
    private ModuleService moduleService;

    /**
     * 初始化资源信息
     */
    @PostConstruct
    public void initModules() {
        try {
            logger.info("-----------------------------开始初始化资源信息");
            //仅缓存页面菜单一级
            SysModule queryModule = new SysModule();
            queryModule.setLevel(Constants.MenuType.LEVEL_SUB_MENU);
            List<SysModule> modules = moduleService.selectModules(queryModule);
            logger.info("-----------------------------查询到资源共{}个", modules.size());
            for (SysModule module : modules) {
                InitializeData.addModule(module);
            }
            logger.info("-----------------------------资源信息初始化完成");
        } catch (Exception e) {
            logger.info("-----------------------------资源信息初始化失败,原因:{}", e.getMessage());
        }
    }
}
