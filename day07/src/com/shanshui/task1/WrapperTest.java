package com.shanshui.task1;

public class WrapperTest {
    public static void main(String[] args) {
        Integer a = 120;
        Integer b = 120;
        System.out.println(a == b);
        System.out.println(a.equals(b));

        Integer c = 150;
        Integer d = 150;
        System.out.println(c == d);
        System.out.println(c.equals(d));

        int e = Integer.parseInt("2025"); //将2025字符串转int基础型
        Integer num = e; //自动装箱
        System.out.println(num);

        //将double 99.99转字符串，再转回double包装类
        double f = 99.99;
        String str = String.valueOf(f); //基本型转字符串用string
        Double g =Double.valueOf(str);
        System.out.println(g);

        boolean isDigit = Character.isDigit('5');
        boolean isLower = Character.isDigit('z');
        System.out.println(Character.isDigit('5'));
        System.out.println(Character.isDigit('z'));

    }
}