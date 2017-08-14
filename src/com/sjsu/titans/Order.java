package com.sjsu.titans;

import com.sjsu.titans.User.Customer;
import com.sjsu.titans.device.Device;

import java.util.ArrayList;
import java.util.Date;

public class Order {
    Customer customer;
    ArrayList<Device> devices;
    Date date;
    double price;

    public Order(Customer customer, ArrayList<Device> devices, Date date, double price) {
        this.customer = customer;
        this.devices = devices;
        this.date = date;
        this.price = price;
    }

    public void recordOrder()
    {
        System.out.println("Order recorded for "+this.customer.getFirstName() + " on "+ this.date);
    }
}
