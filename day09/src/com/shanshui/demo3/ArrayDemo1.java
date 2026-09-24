package com.shanshui.demo3;

import java.util.Arrays;

/**
 * 数组工具类 Arrays
 */
public class ArrayDemo1 {
    public static void main(String[] args) {
        //toString 方法，定义了数组对象的输出格式，看起来可读性更好
        int[] arr = {1,4,7,9,12,23,36,48,58,68,73,89,93};
        System.out.println(Arrays.toString(arr));

        int[] arr1 = new int[] {23,345,456,567,243,456};
        //sort 方法，对数组的元素进行升序排序
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        //fill 方法，还可以对数组中的内容进行快速的填充
        int[] arr2 = new int[10];
        Arrays.fill(arr2,1);
        System.out.println(Arrays.toString(arr2));

        //copyOf 方法，实现数组中元素进行拷贝
        int[] arr3 ={1,2,3,4,5};
        int[] target = Arrays.copyOf(arr3,3);
        System.out.println(Arrays.toString(target));
        System.out.println(arr3 == target); // 被拷贝的数组对象和拷贝的数组对象不是同一个对象

        //在拷贝数组的过程中，可以拷贝指定的内容
        int[] target1 = new int[10];
        System.arraycopy(arr1,0,target1,0,3);
        System.out.println(Arrays.toString(target1));

        // 对于一个有序的数组（升序，降序都可以），我们可以使用二分查找法快速定位到元素的位置，如果找不到对应的元素，则返回-1
        // 1  2  3  4  5
        int[] arr4 = {1,2,3,4,5};
        System.out.println(Arrays.binarySearch(arr4,4));
    }
}
