package com.shanshui.task2;

public class Centipede extends Monster {
    public Centipede(String name, int hp, int attack) {
        super(name, hp, attack);
    }

    public void move(){
        System.out.println("我是蜈蚣精，御风飞行");
    }
}
