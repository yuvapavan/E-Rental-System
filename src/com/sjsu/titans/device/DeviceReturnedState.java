package com.sjsu.titans.device;

public class DeviceReturnedState implements DeviceState {

    Device device;

    public DeviceReturnedState(Device device) {
        this.device = device;
    }

    public void availDevice() {
        device.setState(device.getAvialbleState());
    }
    public void issueDevice() {
        System.out.println(" Device not yet came to available state");
    }
    public void returnDevice() {
        boolean deviceInGoodCondition = true;
        if(deviceInGoodCondition) {
            device.setState(device.getAvialbleState());
            System.out.println("\n Device state set to Available");
        } else  {
            device.setState(device.getRepairState());
            System.out.println("\n Device state set to Repair");
        }
    }
    public void repairDevice() {
        device.setState(device.getRepairState());
        System.out.println("\n Device state set to Reapir");
    }
    public void decommissionDevice() {
        System.out.println("Can't be decommissioned as it first needs to be analyzed");
    }

}
