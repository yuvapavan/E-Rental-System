package com.sjsu.titans.User;

import com.sjsu.titans.Controller.FeedbackContoller;
import com.sjsu.titans.Controller.SupportController;
import com.sjsu.titans.Plan.RentalPlan;
import com.sjsu.titans.device.Device;

public class Customer extends User {


    RentalPlan rentalPlan = null;

    public Customer(int id, String emailAddress, String firstName, String lastName, String address) {
        super(id, emailAddress, firstName, lastName, address);
    }

    public void subscribeToRentalPlan(RentalPlan rentalPlan) {
        this.rentalPlan = rentalPlan;
        System.out.println( "Subscribed to " + rentalPlan.getPlanName());
    }

    public String getRole() {
        return "Customer";
    }

    @Override
    public String authenthicateUser() {
        System.out.println("Authenthicating Customer: " + this.getEmailAddress());
        return super.authenthicateUser();
    }


    public void registerUser() {
        System.out.println("***************************************************************************************");
        System.out.println("Registration and Authenthication Process of Customer ");
        System.out.println("Registering Customer: " + this.getEmailAddress());
    }

    @Override
    public String logoutUser() {
        System.out.println("Customer is Logged out From System "+this.getEmailAddress());
        return this.getEmailAddress();
    }

    public RentalPlan getRentalPlan() {
        return rentalPlan;
    }

    public void submitFeedback(Device device, String feedback) {
        FeedbackContoller.getInstance().submitFeedback(this,device,feedback);
    }

    public void submitTicket(Device device, String issue) {
        SupportController.getInstance().submitSupportTicket(this, device,issue);
    }


}



