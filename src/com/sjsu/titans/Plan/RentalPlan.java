package com.sjsu.titans.Plan;

public abstract class RentalPlan
{

    protected  String terms;
    protected  String supportplan;
    protected  int duration;
    protected  String planName;

    public RentalPlan() {
    }

    public abstract double getDiscount();

    public String getPlanName( ) {
        return this.planName;
    }

    public String getTerms() {
        return terms;
    }

    public void setTerms(String terms) {
        this.terms = terms;
    }

    public String getSupportplan() {
        return supportplan;
    }

    public void setSupportplan(String supportplan) {
        this.supportplan = supportplan;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

}
