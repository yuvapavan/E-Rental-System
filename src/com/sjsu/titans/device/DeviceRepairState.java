package com.sjsu.titans.device;

public class DeviceRepairState implements DeviceState {

    Device device;

    public DeviceRepairState(Device device) {
        this.device = device;
    }

    public void availDevice() {
        System.out.println("\n Can't avail this device as its in Repaire State");

    }
    public void issueDevice() {
        System.out.println("\n Can't issue this device as its in Repaire State");
    }
    public void returnDevice() {
        System.out.println("\n INVALID as its in Repaire State");
    }
    public void repairDevice() {
        boolean deviceRepaired = true;
        if(deviceRepaired) {
            device.setState(device.getAvialbleState());
            System.out.println("\n Device state set to Availble");
        } else  {
            device.setState(device.getDecommissionState());
            System.out.println("\n Device state set to Decommissioned");
        }
    }
    public void decommissionDevice() {
        device.setState(device.getDecommissionState());
        System.out.println("\n Device state set to Decommissioned");
    }

}
