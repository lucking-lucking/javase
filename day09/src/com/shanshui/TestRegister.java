package com.shanshui;

import java.util.Scanner;

public class TestRegister {

    //模拟数据库，定义已经存在的用户名
    public static String[] names = {"kobe","eric","james","lily"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String name = sc.next();
        try{
            register(name);
        }catch (RegisterException ex){
            ex.printStackTrace();
        }
    }

    //定义一个用户注册的方法
    public static void register(String username)throws RegisterException{
        for (int i = 0; i < names.length; i++) {
            if(names[i].equals(username)){
                throw new RegisterException("用户名已经存在");
            }
        }
        System.out.println("用户名注册成功"+username);
    }
}
