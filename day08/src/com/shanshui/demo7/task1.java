package com.shanshui.demo7;

public class task1 {
    public static void main(String[] args) {
        double [] scores = {10,20,30,40,50};
        double sum = 0;
        double min = scores[0];

        for (int i = 1; i < scores.length; i++) {
            sum = sum + scores[i];
            if (scores[i] < min) {
                min = scores[i];
            }
        }

        double avg = sum / scores.length;
        System.out.println("平均值：" + avg);
        System.out.println("最低分：" + min);

        int count = 0;
        for(int i = 0;i < scores.length;i++){
            if(scores[i] > avg){
                count++;
            }
        }
        System.out.println("成绩大于平均分的数量有：" + count);
    }
}
