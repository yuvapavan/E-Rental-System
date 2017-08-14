package com.sjsu.titans.Plan;

public class ElitePlan extends RentalPlan {

    private  double discount = .2;
    public ElitePlan() {
        super();
        this.terms = "Elite Terms";
        this.terms = "Support through In Person/Phone/Email";
        this.duration = 12;
        this.planName = "ELITE PLAN";
    }



    @Override
    public double getDiscount() {
        return this.discount;
    }

}
