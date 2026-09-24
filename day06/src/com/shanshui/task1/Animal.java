package com.shanshui.task1;

public abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void eat();

    public void Sleep(){
        System.out.println("动物睡觉");
    }
}
