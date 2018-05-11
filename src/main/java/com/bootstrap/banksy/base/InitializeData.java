package com.bootstrap.banksy.base;

import com.bootstrap.banksy.core.domain.SysModule;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class InitializeData {
    //资源存放
    private final static ConcurrentHashMap<String,SysModule> moduleMap = new ConcurrentHashMap<>();
    private final static ConcurrentHashMap<String,List<Map<String,List<SysModule>>>> userAuthMap = new ConcurrentHashMap<>();

    /**
     * 添加资源
     * @param module
     */
    public static void addModule(SysModule module){
        moduleMap.put(module.getId(),module);
    }

    /**
     * 获取资源
     * @param moduleId
     * @return
     */
    public static SysModule loadModule(String moduleId){
        return moduleMap.get(moduleId);
    }

    /**
     * 设置用户页面按钮权限
     * @param userId 用户ID
     * @param pageButtons 页面按钮 key为页面ID value为页面按钮
     */
    public static void addUserPageButton(String userId, List<Map<String,List<SysModule>>> pageButtons){
        userAuthMap.put(userId,pageButtons);
    }

    /**
     * 获取用户页面按钮
     * @param userId 用户ID
     * @param pageId 页面ID
     * @return
     */
    public static List<SysModule> getUserPageButton(String userId,String pageId){
        List<Map<String,List<SysModule>>> pageList = userAuthMap.get(userId);
        if (pageList != null) {
            for (Map<String, List<SysModule>> stringListMap : pageList) {
                List<SysModule> modules = stringListMap.get(pageId);
                if (modules != null) {
                    return modules;
                }
            }
        }

        return null;
    }
}
