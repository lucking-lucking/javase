//package包的关键字，  格式：page包的路径
package com.shanshui;

//import 关键字  如果我们在当前类里面需要引用一个外部包的类，需要使用一个improt关键字来进行导入
//格式： import 包名 + 类名

//如果一个类是位于java.lang包里面，是不用使用import关键字进行包的导入的
//import java.lang.System

/*静态导入
import  static com.shanshui.pojo.Person.test;*/


import com.shanshui.pojo.Person;

public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person();
        /*person.name = "eric";
        person.age = 12;
        System.out.println(person.name);
        System.out.println(person.age);*/

        //Person.test();
        //test();

        //当我们的成员属性背封装好了之后，给属性赋值，需要使用set方法来完成
        person.setName("eric");
        person.setAge(19);
        person.setSex("男");

        //输出属性
        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getSex());
    }
}
