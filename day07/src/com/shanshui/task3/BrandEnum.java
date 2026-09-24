package com.shanshui.task3;

public enum BrandEnum {
    //定义枚举常量
    HUAWEI("华为","鸿蒙"),
    XIAOMI("小米","安卓"),
    APPLE("苹果","iOS"),
    OPPO("OPPO","安卓"),
    VIVO("VIVO","安卓");

    //成员变量（这里定义的成员变量就是上方定义的枚举变量括号里的东西）
    private String ChineseName;
    private String System;

    //构造私有方法
    BrandEnum(String chineseName, String system) {
        ChineseName = chineseName;
        System = system;
    }

    public String getChineseName() {
        return ChineseName;
    }

    public String getSystem() {
        return System;
    }
}
