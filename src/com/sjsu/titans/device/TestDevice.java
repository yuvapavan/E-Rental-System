package com.sjsu.titans.device;

public class TestDevice {
    public static void main(String args[]) {

        Device appleIpad = new Device(1,"Tablet",100,"Black","avialbleState",2017,100,16);
        appleIpad.issueDevice();
        appleIpad.returnDevice();


    }
}
