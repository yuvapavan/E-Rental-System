//Acer inherits Laptop class and has special graphic card type

package com.sjsu.titans.device;

import com.sjsu.titans.device.Laptop;

public class Acer extends Laptop {



    public Acer(int serialno, String category, double price, String color, String statuses, int year, int memory, int size) {
        super(serialno, category, price, color, statuses, year, memory, size);
    }

    @Override
    public String getModel()
    {
        System.out.println("Laptop Model is Aspire")   ;
        return Model;
    }

    @Override
    public String getBrand()
    {
        System.out.println("Brand Name is Acer");
        return Brand;
    }

    @Override
    public String getOS()
    {   System.out.println("Laptop OS is Windows");
        return OS;
    }

    public void getGraphiccardtype() {  System.out.println("Acer Graphic Card Type: Intel HD Graphics Card"); }

    public double getPrice()
    {
        return 100;
    }
}
