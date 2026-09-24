package com.shanshui.demo2;

public class RegDemo {
    public static void main(String[] args) {
        String str = "oooo";
        //  +
        System.out.println(str.matches("o+"));
        String str1 = "abcabccaa";
        System.out.println(str.matches("[abc]*"));
    }
}
