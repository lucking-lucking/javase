package com.shanshui.task2;

public class Monster {
    private String name;
    private int hp;
    private int attack;

    public Monster(String name, int hp, int attack) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }

    public void attack(){
        System.out.println("怪物" + name + "展开攻击");
        System.out.println("当前生命值是：" +hp);
        System.out.println("攻击力是：" +attack);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttack(){
        return attack;
    }
    public void setAttack(){
        this.attack = attack;
    }
}
