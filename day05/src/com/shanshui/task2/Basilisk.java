package com.shanshui.task2;

public class Basilisk extends Monster {
    public Basilisk(String name, int hp, int attack) {
        super(name, hp, attack);
    }
    public void move(){
        System.out.println("我是蛇怪，我走S型路线");
    }

    public void bloodUp(){
        if (getHp() < 10){
            System.out.println("实施大蛇补血术。。。。，当前生命值是：" + (getHp()+ 20));
            setHp(getHp()+ 20);
        }
    }
}

