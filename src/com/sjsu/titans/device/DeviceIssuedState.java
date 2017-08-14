package com.sjsu.titans.device;

public class DeviceIssuedState implements DeviceState {

    Device device;

    public DeviceIssuedState(Device device) {
        this.device = device;
    }

    public void availDevice() {
        System.out.println("\n Can't avail this device as its in Issued state");

    }
    public void issueDevice() {
        System.out.println("\n Device is already in Issued State");
    }
    public void returnDevice() {
        device.setState(device.getReturnState());
        System.out.println("\n Device state set to Returned");
    }
    public void repairDevice() {
        System.out.println("\n INVALID as device needs to be returned first");
    }
    public void decommissionDevice() {
        System.out.println("\n INVALID as device needs to be returned first");
    }

}
