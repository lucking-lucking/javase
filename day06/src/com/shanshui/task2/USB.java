package com.shanshui.task2;

public interface USB {
    void start();
    void stop();

    default void show(){
        System.out.println("USB设备工作中");
    }
}
