//Kindle inherits Tablet class and has special screen type

package com.sjsu.titans.device;

public class Kindle extends Tablet {


    public Kindle(int serialno, String category, double price, String color, String statuses, int year, int memory, int size) {
        super(serialno, category, price, color, statuses, year, memory, size);
    }



    @Override
    public String getModel()
    {
        System.out.println("Tablet Model is Kindle")   ;
        return Model;
    }

    @Override
    public String getBrand()
    {
        System.out.println("Brand Name is Amazon");
        return Brand;
    }

    @Override
    public String getTabletOS()
    {   System.out.println("Tablet OS is Fire OS");
        return TabletOS;
    }

    public void getScreenType() {
        System.out.println("Amazon Kindle Screen Type: Bright HD Screen");
    }
}
