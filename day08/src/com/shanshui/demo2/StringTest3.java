package com.shanshui.demo2;

/**
 * 键盘输入一个字符串，逆序输出一个新的字符串
 */
public class StringTest3 {
    public static void main(String[] args) {
        String msg = "abcd";
        reverseStr(msg);
    }

    //定义一个逆序输出字符串的方法
    public static void reverseStr(String str) {
        char[] chars = str.toCharArray();
        String newStr = "";
        for(int i = chars.length - 1; i >= 0; i--) {
            newStr += chars[i];
        }
        System.out.println("逆序之后的字符串是：" + newStr);
    }
}
