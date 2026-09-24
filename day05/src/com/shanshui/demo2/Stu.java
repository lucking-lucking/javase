package com.shanshui.demo2;

/**
 * 学生类 继承人类Human
 */
public class Stu extends Human{

    public Stu(){}

    public Stu(String name, int age, String address) {
        super(name, age, address);
    }

    public void study(){
        System.out.println("这是Stu里面的study方法");
    }

    public String toString(){
        return "姓名：" + super.name + "年龄：" + super.age + "地址:" +super.address;
    }
}
