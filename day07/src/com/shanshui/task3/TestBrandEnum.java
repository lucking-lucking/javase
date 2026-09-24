package com.shanshui.task3;

public class TestBrandEnum {
    public static void main(String[] args) {
        BrandEnum[] arr = BrandEnum.values();
        for(int i = 0;i < arr.length;i++) {
            BrandEnum brandEnum = arr[i];
            System.out.println((i + 1) + " " + brandEnum.name() + " " + brandEnum.getChineseName() + " " + brandEnum.getSystem());
        }
        System.out.println("---------------------------");
        BrandEnum b = BrandEnum.APPLE;
        switch (b){
            case APPLE:
                System.out.println("苹果手机使用iOS系统，流畅稳定");
                break;
            default:
                break;
        }
    }
}
