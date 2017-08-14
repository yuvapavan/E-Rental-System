package com.sjsu.titans;

import com.sjsu.titans.Controller.FeedbackContoller;
import com.sjsu.titans.User.Admin;
import com.sjsu.titans.User.Customer;

import java.util.Date;

public class Feedback {

    Date date;
    String device;
    Customer customer;

    public Feedback(Date date, String device, Customer customer, Admin admin, FeedbackContoller feedbackContoller) {
        this.date = date;
        this.device = device;
        this.customer = customer;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

}
