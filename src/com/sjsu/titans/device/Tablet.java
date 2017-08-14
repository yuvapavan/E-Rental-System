//Tablet is the sub class of Device. Tablet subclasses are ipad,Galaxy and Kindle.

package com.sjsu.titans.device;

import com.sjsu.titans.device.Device;

public class Tablet extends Device {

    String Model;
    String Brand;
    String TabletOS;

    public Tablet(int serialno, String category, double price, String color, String statuses, int year, int memory, int size) {
        super(serialno, category, price, color, statuses, year, memory, size);
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        this.Model = model;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        this.Brand = brand;
    }

    public String getTabletOS() {
        return TabletOS;
    }

    public void setTabletOS(String tabletOS) {
        this.TabletOS = tabletOS;
    }






}
