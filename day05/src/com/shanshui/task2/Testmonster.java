package com.shanshui.task2;

public class Testmonster {
    public static void main(String[] args) {
        Basilisk basilisk = new Basilisk("蛇妖乙",5,20);
        basilisk.attack();;
        basilisk.bloodUp();
        basilisk.move();

        System.out.println("--------------------------");

        Centipede centipede = new Centipede("蜈蚣精乙",60,15);
        centipede.attack();
        centipede.move();
    }
}
