package com.shanshui;

/**
 *  如果我们需要获取数组中的所有元素
 *    方式1: 通过for循环的方式进行遍历
 *    方式2: 增强型for循环
 */
public class ArrayDemo3 {
    public static void main(String[] args) {
        int[] arr = {12,45,34,67,89,101};
        /*for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }*/

        for(int e : arr){
            System.out.print(e + "\t");
        }
        System.out.println();
        String[] strs = {"java","hadoop","html","string","oracle"};
        for(String s : strs){
            System.out.print(s + "\t");
        }
    }
}
