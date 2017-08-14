package com.sjsu.titans;

import com.sjsu.titans.User.Customer;
import com.sjsu.titans.device.Device;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class Cart {


    public int id;
    public Customer customer;

    public ArrayList<Device> getDevices() {
        return devices;
    }

    public void setDevices(ArrayList<Device> devices) {
        this.devices = devices;
    }

    public ArrayList<Device> devices;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double price;
    public int quantity;
    public Date date;


    public Cart(int id,Customer customer) {
        devices = new ArrayList<Device>();
        this.id = id;
        this.customer=customer;
        this.price = 0;
    }



    public void addDevice(Device device,int quantity)  {
        System.out.println("Devices are Added to the cart "+device);
        devices.add(device);
    };

    public void deleteDevice(Device device)
    {
        devices.remove(device);
        System.out.println("Devices are Deleted from the cart " +device);
    }

    public void updateQuantity(Device device,int quantity)
    {
        this.quantity=this.quantity+quantity;
        System.out.println("Device Quantities are updated " +device );
        System.out.println(quantity);
    }

    public void checkout()
    {
        Iterator iter = this.devices.iterator();
        while (iter.hasNext()) {
            Device devices= (Device) iter.next();
            price += devices.getPrice();
        }

        price=price*(customer.getRentalPlan().getDiscount());

    }

}

