package com.shanshui.demo3;

public class TestWeek {
    public static void main(String[] args) {
        Week week = Week.MONDAY;
        switch (week){
            case MONDAY:
                System.out.println("这是星期一");
                break;
            case TUERDAY:
                System.out.println("这是星期二");
                break;
            case WEDNESDAY:
                System.out.println("这是星期三");
                break;
            case THURSDAY:
                System.out.println("这是星期四");
                break;
            case FRIDAY:
                System.out.println("这是星期五");
                break;
            case SATURDAY:
                System.out.println("这是星期六");
                break;
            case SUNDAY:
                System.out.println("这是星期天");
                break;
        }
    }
}
