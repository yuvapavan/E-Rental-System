package com.sjsu.titans;

import com.sjsu.titans.Controller.SupportController;
import com.sjsu.titans.User.Customer;


public class SupportItem {

    private String problemIssue;
    private String trackingNumber;
    private String dateReported;
    private Customer reportedCustomer;


    public SupportItem(String problemIssue, String trackingNumber, String dateReported, Customer reportedCustomer) {
        this.problemIssue = problemIssue;
        this.trackingNumber = trackingNumber;
        this.dateReported = dateReported;
        this.reportedCustomer = reportedCustomer;
    }

    public String getProblemIssue() {
        return problemIssue;
    }

    public void setProblemIssue(String problemIssue) {
        this.problemIssue = problemIssue;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public String getDateReported() {
        return dateReported;
    }

    public void setDateReported(String dateReported) {
        this.dateReported = dateReported;
    }

    public Customer getReportedCustomer() {
        return reportedCustomer;
    }

    public void setReportedCustomer(Customer reportedCustomer) {
        this.reportedCustomer = reportedCustomer;
    }







}
