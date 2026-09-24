package com.shanshui.task1;

public class TestAnimal {
    public static void main(String[] args) {
        Animal dog = new Dog("旺财");
        Animal Cat = new Cat("橘猫");

        dog.eat();
        dog.Sleep();

        Cat.eat();
        Cat.Sleep();


    }
}
