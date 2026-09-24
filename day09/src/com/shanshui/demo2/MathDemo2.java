package com.shanshui.demo2;

import java.util.Random;

public class MathDemo2 {
    public static void main(String[] args) {
        Random random = new Random();// 创建随机数对象
        for (int i = 0; i < 30; i++) {
            //nextInt方法获取0-x区间的随机数
            System.out.print(random.nextInt(100) + "\t");
        }
    }
}
