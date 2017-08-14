package com.sjsu.titans.User;

import com.sjsu.titans.Controller.DeviceController;
import com.sjsu.titans.Controller.FeedbackContoller;
import com.sjsu.titans.Controller.SupportController;
import com.sjsu.titans.device.*;

import java.util.Date;

public class Admin extends User {

    DeviceController deviceController;
    SupportController supportController;
    FeedbackContoller feedbackContoller;

    public Admin(int id, String emailAddress, String firstName, String lastName, String address) {
        super(id, emailAddress, firstName, lastName, address);
        this.deviceController=DeviceController.getInstance();
        this.supportController=SupportController.getInstance();
        this.feedbackContoller=FeedbackContoller.getInstance();
    }

    public DeviceController getDeviceController() {
        return deviceController;
    }

    public SupportController getSupportController() {
        return supportController;
    }

    public FeedbackContoller getFeedbackContoller() {
        return feedbackContoller;
    }


    public String getRole() {
        return "Admin" ;
    }

    @Override
    public String authenthicateUser() {

        System.out.println("Authenthicating : "+ this.getRole());
        return super.authenthicateUser();
    }

    public void addDevice(Device device){
        this.deviceController.addDevice(device);
    }
    public void updateDevice(Device device){ this.deviceController.updateDevice(device); }
    public void deleteDevice(Device device){ this.deviceController.deleteDevice(device); }

    public void trackDevice(Device device){SupportController.getInstance().trackDeviceStatus(device);}
    public void reviewFeedback(){this.feedbackContoller.reviewFeedback(this);}


    @Override
    public String logoutUser() {
        System.out.println("Logout Funcationality of Admin");
        System.out.println("Admin is Logged out From System: "+this.getEmailAddress());
        return this.getEmailAddress();
}
}



