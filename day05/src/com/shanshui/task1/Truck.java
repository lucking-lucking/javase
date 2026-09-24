package com.shanshui.task1;

public class Truck {
    private String carId;
    private String carType;
    private String color;
    private double dayRent;
    private double load;

    public Truck(String carId, String carType, String color, double dayRent, double load) {
        this.carId = carId;
        this.carType = carType;
        this.color = color;
        this.dayRent = dayRent;
        this.load = load;
    }
    public void rent(String userName, int days){
        if(days <= 0){
            System.out.println("该租赁天数不合法");
            return;
        }
        double total = dayRent * days;

        System.out.println("租赁信息");
        System.out.println("车牌号" + carId);
        System.out.println("车型" + carType);
        System.out.println("颜色" + color);
        System.out.println("载重量" + load);
        System.out.println("租车人" + userName);
        System.out.println("应付金额" + total);
    }

    public String getCarId(){
        return carId;
    }
    public void setCarId(String carId){
        this.carId = carId;
    }

    public String getCarType(){
        return carType;
    }
    public void setCarType(String carType){
        this.carType = carType;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public double getDayRent(){
        return dayRent;
    }
    public void setDayRent(double dayRent){
        this.dayRent = dayRent;
    }

    public double getLoad(){
        return load;
    }
    public void setLoad(double load){
        this.load = load;
    }
}
