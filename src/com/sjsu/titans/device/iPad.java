//iPad inherits Tablet class and has special virtual assistant type
package com.sjsu.titans.device;

public class iPad extends Tablet {


    public iPad(int serialno, String category, double price, String color, String statuses, int year, int memory, int size) {
        super(serialno, category, price, color, statuses, year, memory, size);
    }


    @Override
    public String getModel()
    {
        System.out.println("Tablet Model is ipad")   ;
        return Model;
    }

    @Override
    public String getBrand()
    {
        System.out.println("Brand Name is Apple");
        return Brand;
    }

    @Override
    public String getTabletOS()
    {   System.out.println("Tablet OS is iOS");
        return TabletOS;
    }


    public void getAssistanttype()
    {
        System.out.println("Apple ipad Assistant Type: Siri Virtual Assistant");
    }


    public double getPrice() {
        return 100;
    }
}
