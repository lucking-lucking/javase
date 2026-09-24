package com.shanshui.task2;

public class Test {
    public static void main(String[] args) {
        USB mouse = new Mouse();
        USB keyboard = new Keyboard();

        mouse.start();
        mouse.stop();
        mouse.show();

        System.out.println("---------------------");

        keyboard.start();
        keyboard.stop();
        keyboard.show();
    }
}
