package com.shanshui;

public class TestShape {
    public static void main(String[] args) {
        //创建一个圆形的对象
        Circle circle = new Circle("圆形",4);
        double area = circle.getArea();
        double length = circle.getLength();
        System.out.println("圆形的面积是：" + area + "圆形的周长是：" + length);

        //创建一个矩形对象
        Rectangle rectangle = new Rectangle("矩形",7,8);
        double area1 = rectangle.getArea();
        double length1 = rectangle.getLength();
        System.out.println("矩形的面积是：" + area1 + "圆形的周长是：" + length1);
    }
}
