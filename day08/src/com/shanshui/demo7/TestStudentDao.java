package com.shanshui.demo7;

public class TestStudentDao {
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDao(){
            @Override
            public void add() {
                System.out.println("这是新增的方法");
            }

            @Override
            public void update() {
                System.out.println("这是修改的方法");
            }

            @Override
            public void delete() {
                System.out.println("这是删除的方法");
            }

            @Override
            public void select() {
                System.out.println("这是查询的方法");
            }
        };
        studentDao.select();
    }
}
