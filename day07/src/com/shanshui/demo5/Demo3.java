package com.shanshui.demo5;

/**
 * Byte  Short  Integer Long 这些包装类型的缓存是在-128 -- 127范围之内的。
 */
public class Demo3 {
    public static void main(String[] args) {
        Integer a = 100;
        Integer b = 100;
        System.out.println(a == b); // 命中缓存，a,b指向同一个对象
        System.out.println(a.equals(b));// 比较两个值是否一样

        Integer c = 200;
        Integer d = 200;
        System.out.println(c == d);//false
        System.out.println(c.equals(d));
    }
}
