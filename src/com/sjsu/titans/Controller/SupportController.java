package com.sjsu.titans.Controller;

import com.sjsu.titans.User.Customer;
import com.sjsu.titans.device.Device;

public class SupportController {

    Device device;
    private static SupportController instance;

    private SupportController() {
      //  System.out.println("Calling Private Constructor from getInstance() method: " + this.toString());
    }

    public static SupportController getInstance(){
        if(instance == null){
            synchronized(SupportController.class){

                if(instance == null) {
                    instance = new SupportController();
                }
            }
        }
        return instance;
    }

    public void submitSupportTicket(Customer customer, Device device, String issue) {
        System.out.println(" Customer +"+customer.getFirstName()+ "  Submitted an issue "+issue + " for device ");
    }

    public void trackDeviceStatus(Device device) { device.getState(); }

    public void updateDeviceStatus(Device device)
    {
        //Couldn't repair
        if (false) {
            device.decommissionDevice();
        } else  {
            device.availDevice();
        }
    }
}
