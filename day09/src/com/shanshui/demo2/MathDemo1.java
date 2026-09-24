package com.shanshui.demo2;

/**
 * 数学工具类
 */
public class MathDemo1 {
    public static void main(String[] args) {
        System.out.println(Math.pow(2,3)); // pow计算a的b次方
        System.out.println("取绝对值：" + Math.abs(-100));
        System.out.println("最大值是：" + Math.max(16,20));
        System.out.println("最小值是：" + Math.min(16,20));
        System.out.println("平方根是：" + Math.sqrt(9));

        System.out.println(Math.sin(60)); // 取正弦值
        System.out.println(Math.cos(Math.PI));  // 取余弦值
        System.out.println(Math.tan(Math.PI / 4));

        System.out.println(Math.asin(1));
        System.out.println(Math.acos(1));
        System.out.println(Math.atan(0));

        System.out.println(Math.ceil(2.5)); // 向上取整
        System.out.println(Math.floor(4.9999999999)); // 向下取整

        System.out.println(Math.ceil(-2.99999));
        System.out.println(Math.floor(-2.99999));
    }
}
