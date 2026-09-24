package com.shanshui.demo3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

/**
 * 通过键盘输入，输入任意的年份，然后计算出当前年份的2月份最后一天是几号？
 */
public class TestDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = sc.nextInt();
        Calendar calendar = Calendar.getInstance();
        calendar.set(year,2,0);
        //将日期向前推一天
        String format = new SimpleDateFormat("yyyy-MM-dd").format(calendar.getTime());
        System.out.println(format);
    }
}
