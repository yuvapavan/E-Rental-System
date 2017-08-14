package com.sjsu.titans.Plan;

public class RegularPlan extends RentalPlan {

    private double discount = 0.0;
    public RegularPlan() {
        super();
        this.terms = "Regualar Terms";
        this.terms = "Support through Email";
        this.duration = 12;
        this.planName = "REGULAR PLAN";
    }

    @Override
    public double getDiscount() {
        return this.discount;
    }



}
