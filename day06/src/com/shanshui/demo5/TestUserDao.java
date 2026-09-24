package com.shanshui.demo5;

public class TestUserDao {
    public static void main(String[] args) {
        //接口的引用变量指向实现类对象
        UserDaoImpl userDao = new UserDaoImpl();
        userDao.add();
    }
}
