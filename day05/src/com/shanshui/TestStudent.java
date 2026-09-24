package com.shanshui;

import com.shanshui.pojo.Animal;
import com.shanshui.pojo.Student;

public class TestStudent {
    public static void main(String[] args) {
        //Student student = new Student("eric",12,"USA");
        Student s1 = Student.getInstance();
        Student s2 = Student.getInstance();
        System.out.println(s1 == s2);//比较两个对象是否是同一个对象

        Animal o1 = Animal.getAnimal();
        Animal o2 = Animal.getAnimal();
        System.out.println(o1 == o2);

    }
}
