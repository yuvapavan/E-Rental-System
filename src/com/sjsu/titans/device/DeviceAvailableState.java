package com.sjsu.titans.device;

public class DeviceAvailableState implements DeviceState {

    Device device;

    public DeviceAvailableState(Device device) {
        this.device = device;
    }

    public void availDevice() {
        System.out.println("\n Device is already in Available State");

    }
    public void issueDevice() {
        device.setState(device.getIssuedState());
        System.out.println("\n Device state set to Issued");

    }
    public void returnDevice() {
        System.out.println("\n  Device is in available state and not yet Issued");
    }
    public void repairDevice() {
        System.out.println("\n Device is in available state and in good condition");

    }
    public void decommissionDevice() {
        System.out.println("\n Device is in available state and can't be decommissioned");
    }

}
