//HP inherits Laptop class and has special screen Type

package com.sjsu.titans.device;

public class HP extends Laptop {


    public HP(int serialno, String category, double price, String color, String statuses, int year, int memory, int size) {
        super(serialno, category, price, color, statuses, year, memory, size);
    }

    @Override
    public String getModel()
    {
        System.out.println("Laptop Model is HP Probook")   ;
        return Model;
    }

    @Override
    public String getBrand()
    {
        System.out.println("Brand Name is HP");
        return Brand;
    }

    @Override
    public String getOS()
    {   System.out.println("Laptop OS is Windows 7");
        return OS;
    }

    public void getScreentype()
    {
        System.out.println("HP Screen Type: HD screen");
    }
}
