package com.shanshui.demo3;

public class TestEnum {
    public static void main(String[] args) {
        SeasonEnum seasonEnum = SeasonEnum.SPRING;
        System.out.println(seasonEnum);
        System.out.println(seasonEnum.getSeasonName());
        System.out.println(seasonEnum.getSeasonDesc());
    }
}
