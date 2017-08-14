package com.sjsu.titans.Plan;


public class PlanFactory {

    public enum RENTAL_PLAN_TYPE {
        RENTAL_PLAN_TYPE_REGUALAR,
        RENTAL_PLAN_TYPE_PREMIUM,
        RENTAL_PLAN_TYPE_ELITE
    };

    public static RentalPlan getRentalPlan(RENTAL_PLAN_TYPE planType) {
        RentalPlan planToReturn = null;
        switch (planType) {
            case RENTAL_PLAN_TYPE_REGUALAR:
                planToReturn = new RegularPlan();
                break;
            case RENTAL_PLAN_TYPE_ELITE:
                planToReturn = new ElitePlan();
            break;
            case RENTAL_PLAN_TYPE_PREMIUM:
                planToReturn = new PremiumPlan();
            break;
        }
        return planToReturn;
    }

}
