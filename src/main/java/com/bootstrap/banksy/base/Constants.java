package com.bootstrap.banksy.base;

public class Constants {
    public final static String SESSION = "userLoginInfo";
    public final static Long PID = -1L;

    public static class Validity {
        /**
         * 无效
         */
        public final static Integer NO = 0;
        /**
         * 有效
         */
        public final static Integer YES = 1;
    }

    public static class MenuType {
        /**
         * 窗体模块
         */
        public final static Integer LEVEL_WINDOW = 0;
        /**
         * 模块
         */
        public final static Integer LEVEL_MENU = 1;
        /**
         * 菜单
         */
        public final static Integer LEVEL_SUB_MENU = 2;
        /**
         * 页面按钮
         */
        public final static Integer LEVEL_BUTTON = 3;
    }

    public static class NodeType {
        /**
         * 机构
         */
        public final static Integer ORG = 0;
        /**
         * 部门
         */
        public final static Integer DEPARTMENT = 1;
        /**
         * 职位
         */
        public final static Integer POSITION = 2;
    }
}
