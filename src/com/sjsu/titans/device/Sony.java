//Sony inherits Laptop class and has special sound type

package com.sjsu.titans.device;

public class Sony extends Laptop {


    public Sony(int serialno, String category, double price, String color, String statuses, int year, int memory, int size) {
        super(serialno, category, price, color, statuses, year, memory, size);
    }

    public void getSurroundtype() {
        System.out.println("Sony Surround System: Dolby Digital");
    }

    public String getModel()
    {
        System.out.println("Laptop Model is Vaio")   ;
        return Model;
    }

    @Override
    public String getBrand()
    {
        System.out.println("Brand Name is Sony");
        return Brand;
    }

    @Override
    public String getOS()
    {   System.out.println("Laptop OS is Windows 8");
        return OS;
    }

}
