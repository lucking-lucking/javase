package com.shanshui.demo4;

import org.w3c.dom.ls.LSOutput;

/**
 * 图形接口
 */
public interface Tuxing {

    //计算面积的方法
    public void getArea();

    //计算周长的方法
    public void getLength();

    //在一个接口中定义的default关键字修饰的非抽象方法，也会被实现类所继承
    default void showIno(){
        System.out.println("对图形进行了描述");
    }
}
