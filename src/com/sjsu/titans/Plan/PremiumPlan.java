package com.sjsu.titans.Plan;

public class PremiumPlan extends RentalPlan {

    private  double discount = .15;

    public PremiumPlan() {
        super();
        this.terms = "Premium Terms";
        this.terms = "Support through Phone/Email";
        this.duration = 12;
        this.planName = "PREMIUM PLAN";

    }



    @Override
    public double getDiscount() {
        return this.discount;
    }
}
