//Apple inherits Laptop class and has special touch bar type


package com.sjsu.titans.device;

import com.sjsu.titans.device.Laptop;

public class Apple extends Laptop {


    public Apple(int serialno, String category, double price, String color, String statuses, int year, int memory, int size) {
        super(serialno, category, price, color, statuses, year, memory, size);
    }



    @Override
    public String getModel()
    {
        System.out.println("Laptop Model is MacBook Pro")   ;
        return Model;
    }

    @Override
    public String getBrand()
    {
        System.out.println("Brand Name is Apple");
        return Brand;
    }

    @Override
    public String getOS()
    {   System.out.println("Laptop OS is Macintosh");
        return OS;
    }


    public void getBartype()
    {
        System.out.println("Apple New Features: Apple Touch Bar");
    }


    public double getPrice() {
        return 100;
    }
}
