package com.shanshui.task3;

public class Circle extends Shape {
    int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return 3.14 * this.r * this.r;
    }
}
