package com.shanshui.demo3;

import java.util.Scanner;

/**
 * 测试枚举当中常见的方法
 */

public class TestEnumMethod {
    public static void main(String[] args) {
        Week[] values = Week.values();
        System.out.println(values.length);
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i].ordinal() + "---->" + values[i].name());
        }
        System.out.println("------------------------");

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入星期值");
        int weekValue = sc.nextInt();
        Week week = values[weekValue-1];
        System.out.println(week);

        System.out.println("请输入星期名：");
        String weekName = sc.next();
        week =Week.valueOf(weekName);
        System.out.println(week);
    }
}
