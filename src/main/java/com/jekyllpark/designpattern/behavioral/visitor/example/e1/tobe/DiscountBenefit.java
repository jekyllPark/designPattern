package com.jekyllpark.designpattern.behavioral.visitor.example.e1.tobe;

public class DiscountBenefit implements Benefit {
    @Override
    public void getBenefit(GoldMember member) {
        System.out.println("Discount For Gold Member");
    }

    @Override
    public void getBenefit(VipMember member) {
        System.out.println("Discount For VIP Member");
    }
}
