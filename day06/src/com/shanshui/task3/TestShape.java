package com.shanshui.task3;

import com.shanshui.Demo6.Circle;
import com.shanshui.Demo6.Shape;
import com.shanshui.Demo6.Square;

public class TestShape {
    public static void main(String[] args) {
        Shape shape = getShape(2);
        double shapeArea = shape.getArea();
        System.out.println(shapeArea);
    }

    public static double getAreaFromShape(Shape shape){
        return shape.getArea();
    }

    public static Shape getShape(int num){
        Shape shape = null;
        if (num == 1){
            shape = new Square("正方形",4);
        }
        if (num == 2){
            shape = new Circle("圆形",3);
        }
        return shape;
    }
}
