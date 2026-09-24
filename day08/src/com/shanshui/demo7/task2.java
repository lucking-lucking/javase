package com.shanshui.demo7;

public class task2 {
    public static void main(String[] args) {
        String personId = "622627200412094215";
        String date = fromatpersonId(personId);
        System.out.println(date);
        char first = personId.charAt(0);
        if (first >= '1' && first <= '9') {
            System.out.println("身份证第一位是在数字1-9之内");
        }else{
            System.out.println("身份证第一位不是在数字1-9之内");
        }
        StringBuilder personid = new StringBuilder(personId);
        personid.reverse();
        System.out.println("翻转之后身份证号码为：" + personid);
    }
    public static String fromatpersonId(String personId) {
        String year = personId.substring(6,10);
        String mouth = personId.substring(10,12);
        String day = personId.substring(12,14);
        return year + "年" + mouth + "月" + day + "日";
    }
}
