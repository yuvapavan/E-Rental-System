//Device is the base class and has two sub classes Laptop and Tablet
package com.sjsu.titans.device;

import java.util.ArrayList;

public class Device {


    private int serialno;
    private String category;
    public double price;
    private String color;
    private String statuses;
    private int year;
    private int memory;
    private int size;

    //States of the Device
    DeviceState avialbleState;
    DeviceState issuedState;
    DeviceState returnState;
    DeviceState repairState;
    DeviceState decommissionState;

    //Current State
    DeviceState state = avialbleState;

    public Device(int serialno, String category, double price, String color, String statuses, int year, int memory, int size) {
        this.serialno = serialno;
        this.category = category;
        this.price = price;
        this.color = color;
        this.statuses = statuses;
        this.year = year;
        this.memory = memory;
        this.size = size;

        avialbleState = new DeviceAvailableState(this);
        issuedState = new DeviceIssuedState(this);
        returnState = new DeviceReturnedState(this);
        repairState = new DeviceRepairState(this);
        decommissionState = new DeviceDecommissionState(this);
        state = avialbleState;
    }



    public int getSerialno() {
        return serialno;
    }

    public void setSerialno(int serialno) {
        this.serialno = serialno;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getStatuses() {
        return statuses;
    }

    public void setStatuses(String statuses) {
        this.statuses = statuses;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setAvialbleState(DeviceState avialbleState) {
        this.avialbleState = avialbleState;
    }

    public void setIssuedState(DeviceState issuedState) {
        this.issuedState = issuedState;
    }

    public void setReturnState(DeviceState returnState) {
        this.returnState = returnState;
    }

    public void setRepairState(DeviceState repairState) {
        this.repairState = repairState;
    }

    public void setDecommissionState(DeviceState decommissionState) {
        this.decommissionState = decommissionState;
    }


    public void availDevice() {
        state.availDevice();
    }
    public void issueDevice() {
        state.issueDevice();
    }
    public void returnDevice() {
        state.returnDevice();
    }
    public void repairDevice() {
        state.repairDevice();
    }
    public void decommissionDevice() {
        state.decommissionDevice();
    }

    public DeviceState getState() {
        return state;
    }

    public void setState(DeviceState state) {
        this.state = state;
    }



    public DeviceState getAvialbleState() {
        return avialbleState;
    }

    public DeviceState getIssuedState() {
        return issuedState;
    }

    public DeviceState getReturnState() {
        return returnState;
    }

    public DeviceState getRepairState() {
        return repairState;
    }

    public DeviceState getDecommissionState() {
        return decommissionState;
    }


    public void updateStatus(){
System.out.print("Status should be updated");
}


}
