package com.will;

public class Day2 {


    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double tax =  meal_cost * ((double)tax_percent / 100);
        float tip = (float) (meal_cost * ((float) tip_percent / 100));
        int total = (int) Math.round(meal_cost + tax + tip);

        System.out.println(total);
    }


}
