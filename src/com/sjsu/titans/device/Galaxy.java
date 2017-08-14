//Galaxy inherits Tablet class and has special virtual assistant type
package com.sjsu.titans.device;

public class Galaxy extends Tablet {


    public Galaxy(int serialno, String category, double price, String color, String statuses, int year, int memory, int size)
    {
        super(serialno, category, price, color, statuses, year, memory, size);
    }

    @Override
    public String getModel()
    {
        System.out.println("Tablet Model is Galaxy")   ;
        return Model;
    }

    @Override
    public String getBrand()
    {
        System.out.println("Brand Name is Samsung");
        return Brand;
    }

    @Override
    public String getTabletOS()
    {   System.out.println("Tablet OS is Android Gingerbread");
        return TabletOS;
    }


    public void getAssistanttype()
    {
        System.out.println("Galaxy Assistant Type: Google Virtual Assistant");
    }

}
