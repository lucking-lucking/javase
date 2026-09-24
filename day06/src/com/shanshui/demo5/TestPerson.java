package com.shanshui.demo5;

/**
 * 父类的数据类型  变量名称 = new 子类的数据类型
 */
public class TestPerson {
    public static void main(String[] args) {
        //父类的引用变量指向子类对象
        Person student = new Student();
        student.eat();
    }
}
