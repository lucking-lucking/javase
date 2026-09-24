package com.shanshui.Demo6;

public class Square extends Shape{

    int width;

    public Square(String name){
        super(name);
    }

    public Square(String name, int width) {
        super(name);
        this.width = width;
    }

    @Override
    public double getArea() {
        double area = width * width;
        return area;
    }
}
