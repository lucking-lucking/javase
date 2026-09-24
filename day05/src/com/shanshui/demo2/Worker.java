package com.shanshui.demo2;

/**
 * 工人类是一个子类，其父类是人类Human
 * 继承关系的定义格式：
 *     类名1 extends 类名2
 *     类名1：子类
 *     类名2:父类
 * 在使用继承的时候，需要注意的事项：  在java中不允许多继承，只允许单继承。
 */
public class Worker extends Human{

    public String name;
    //如果在一个类里面定义了带参数的函数，默认会覆盖无参数的构造函数，如果我们需要使用无参数的构造函数，必须手动添加
    public Worker(){}
    public Worker(String name, int age, String address) {
        //使用super关键字，调用父类的构造器
        super(name, age, address);
    }

    //在子类里面可以使用父类里面的资源（成员属性）

    /**
     * 如果子父类里面存在同名的成员变量，在方法内部，如果直接使用变量名称，默认访问的是子类里面自己的变量。
     * 遵循的是就近原则，如果我们想执行访问父类里面的便利那个，可以用super关键字来替代，格式是：
     * super.name
     */
    public void work(){
        System.out.println("我的名字是：" + super.name + ",我的年龄是：" + age + ",我来自：" + address);
    }


    public static void test(Human human) {
        /*if (human instanceof Worker) {
            Worker worker = (Worker) human;
            worker.work(); // 在if块内使用
        }*/

        if(human instanceof Worker worker){
            worker.work();
        }
    }
}
