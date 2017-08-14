package com.sjsu.titans.device;

import java.sql.Statement;

public class DeviceDecommissionState implements DeviceState {

    Device device;

    public DeviceDecommissionState(Device device) {
        this.device = device;
    }

    public void availDevice() {
        System.out.println("\n Can't avail this device as its decommsioned");

    }
    public void issueDevice() {
        System.out.println("\n Can't issue this device as its decommsioned");
    }
    public void returnDevice() {
        System.out.println("\n INVALID as its decommsioned");
    }
    public void repairDevice() {
        System.out.println("\n Can't Repair this device as its decommsioned");
    }
    public void decommissionDevice() {
        System.out.println("\n Already in Decommission state");
    }

}
