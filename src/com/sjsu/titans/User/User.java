package com.sjsu.titans.User;
import java.util.Date;

public abstract class User {

    protected int id;
    protected String emailAddress;
    protected String firstName;
    protected String lastName;
    protected String address;
    protected Date signUpDate;


    public User(int id, String emailAddress, String firstName, String lastName, String address) {
        this.id = id;
        this.emailAddress = emailAddress;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        emailAddress = emailAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getSignUpDate() {
        return signUpDate;
    }

    public void setSignUpDate(Date signUpDate) {
        this.signUpDate = signUpDate;
    }

    public abstract String getRole();

    public String authenthicateUser() {
        return this.emailAddress;
    }

    public String logoutUser(){
        return this.emailAddress;
    }

}
