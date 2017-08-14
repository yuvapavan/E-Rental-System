package com.sjsu.titans.Controller;

import com.sjsu.titans.User.Admin;
import com.sjsu.titans.User.Customer;
import com.sjsu.titans.device.Device;

public class FeedbackContoller {

    private static FeedbackContoller instance;

    private FeedbackContoller() {
       // System.out.println("Calling Private Constructor from getInstance() method: " + this.toString());
    }

    public static FeedbackContoller getInstance(){
        if(instance == null){
            synchronized(FeedbackContoller.class){

                if(instance == null) {
                    instance = new FeedbackContoller();
                }
            }

        }
        return instance;
    }

    public void submitFeedback(Customer customer, Device device, String feedback)
    {
        System.out.println("Customer " + customer.getFirstName() + " Submitted the feedback : "+feedback);

    }

    public void reviewFeedback(Admin admin)
    {
        System.out.println("Admin reviewed Feedback from Customer ");
    }

}
