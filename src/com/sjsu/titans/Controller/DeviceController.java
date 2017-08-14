package com.sjsu.titans.Controller;


import com.sjsu.titans.device.Device;

import java.util.ArrayList;

public class DeviceController {

    public ArrayList<Device> devices;

    private static DeviceController instance;

    private DeviceController() {
        devices = new ArrayList<Device>();
        //System.out.println("Calling Private Constructor from getInstance() method: " + this.toString());

    }

    public static DeviceController getInstance(){
        if(instance == null){
            synchronized(DeviceController.class){

                if(instance == null) {
                    instance = new DeviceController();
                }
            }

        }
        return instance;
    }

    public  void addDevice(Device device)
    {

        System.out.println("Device is added into the system " +device);
        devices.add(device);
    }

    public void updateDevice(Device device) {
        System.out.println("Device Price is updated in the system");
    }

    public void  deleteDevice(Device device) {
        devices.remove(device);
        System.out.println("Device is deleted from the system" +device);
        device.decommissionDevice();
    }

}