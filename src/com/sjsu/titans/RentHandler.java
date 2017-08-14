package com.sjsu.titans;

import com.sjsu.titans.User.Customer;
import com.sjsu.titans.User.User;
import com.sjsu.titans.device.Device;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class RentHandler {

    Cart cart;
    Date date;
    User user;
    PaymentGateway paymentGateway;

    public RentHandler(User user) {
        this.user = user;
    }


    public void finishOrder(Cart cart)
    {
        PaymentGateway.processPayment();

        cart.checkout();


        Iterator iter = cart.getDevices().iterator();
        while (iter.hasNext()) {
            Device device= (Device) iter.next();
            device.issueDevice();
        }

        Order order = new Order((Customer) this.user, cart.getDevices(), new Date(), cart.getPrice());
        order.recordOrder();



        System.out.print("Order is completed ");
    }

    public void processReturn(Device device)
    {
        System.out.print("Devices Received and the Return Process is Completed");
        device.returnDevice();
    }
    }

