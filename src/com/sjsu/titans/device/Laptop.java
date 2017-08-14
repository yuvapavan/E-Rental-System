//Laptop is the sub class of Device. Laptop subclasses are Acer,Apple,Sony and HP.

package com.sjsu.titans.device;

import com.sjsu.titans.device.Device;

public class Laptop extends Device
{
    String Model;
    String Brand;
    String OS;



    public Laptop(int serialno, String category, double price, String color, String statuses, int year, int memory, int size)
    {
        super(serialno, category, price, color, statuses, year, memory, size);

    }

    public String getModel() {  return Model; }

    public void setModel(String model) {
        this.Model = model;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {  this.Brand = brand; }

    public String getOS() {  return OS; }

    public void setOS(String OS) {  this.OS = OS; }

}





