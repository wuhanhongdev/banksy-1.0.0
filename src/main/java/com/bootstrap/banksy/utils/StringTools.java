package com.bootstrap.banksy.utils;

import com.alibaba.fastjson.JSON;

import java.util.List;

public class StringTools {

    /**
     * 将list集合转换为String数组 集合泛型内容格式化为json串
     * @param list list集合
     * @param <T> 集合类型
     * @return String数组
     */
    public static <T> String[] listToStringArray(List<T> list){
        if (list == null || list.size() == 0) {
            return new String[]{};
        } else {
            String[] result = new String[list.size()];
            for (int i = 0; i < list.size() ; i++) {
                result[i] = JSON.toJSONString(list.get(i));
            }
            return result;
        }
    }
}
