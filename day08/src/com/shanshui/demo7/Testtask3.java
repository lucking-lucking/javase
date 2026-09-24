package com.shanshui.demo7;

public class Testtask3 {
    public static void main(String[] args) {
        task3[] books = new task3[3];
        books[0] = new task3();
        books[0].bookName = "王涛";
        books[0].price = 74;
        books[0].author = "xy1";

        books[1] = new task3();
        books[1].bookName = "高恒超";
        books[1].price = 49;
        books[1].author = "xy2";

        books[2] = new task3();
        books[2].bookName = "666";
        books[2].price = 55;
        books[2].author = "xy3";

        System.out.println("========全部书籍信息========");
        for (int i = 0; i < books.length; i++) {
            System.out.println("书名:" +books[i].bookName + "  价格:" + books[i].price + "  作者:" + books[i].author);
        }

        System.out.println("\n========价格大于50元的书籍========");
        for (int i = 0; i < books.length; i++) {
            task3 b = books[i];
            if(b.price > 50){
                System.out.println(b);
            }
        }
    }
}
