package com.shanshui.task1;

import java.util.Scanner;

public class TestTruck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //在建立从键盘输入值后创建卡车对象，并输入卡车的基本信息例
        Truck truck = new Truck("京D1111","东风","蓝色",20,500);

        System.out.println("请输入租车人姓名");
        String name = sc.next();

        System.out.println("请输入租赁天数");
        int day = sc.nextInt();

        truck.rent(name,(int)day);

        sc.close();
    }
}
