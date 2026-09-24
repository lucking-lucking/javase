package com.shanshui.demo4;

public class TestRecord {
    public static void main(String[] args) {
        TestData data1 = new TestData(1,"hello");
        TestData data2 = new TestData(1,"hello");
        System.out.println(data1.equals(data2));
    }
}
