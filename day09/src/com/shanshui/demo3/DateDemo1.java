package com.shanshui.demo3;

import java.util.Date;

public class DateDemo1 {
    public static void main(String[] args) {
        //基于无参数的构造函数创建Date对象
        Date date = new Date();
        System.out.println(date);//  Fri Mar 27 23:31:32 GMT+08:00 2026 输出当前的系统时间

        //基于带参数的构造函数创建Date对象  参数的毫秒值
        Date date1 = new Date(1619817818922L);
        System.out.println(date1);
    }
}
