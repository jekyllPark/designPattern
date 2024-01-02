package com.jekyllpark.designpattern.behavioral.visitor.example.e1.tobe;

public class MemberService {
    public static void main(String[] args) {
        Member goldMember = new GoldMember();
        Member vipMember = new VipMember();
        PointBenefit pointBenefit = new PointBenefit();
        DiscountBenefit discountBenefit = new DiscountBenefit();
        goldMember.getBenefit(pointBenefit);
        vipMember.getBenefit(pointBenefit);
        goldMember.getBenefit(discountBenefit);
        vipMember.getBenefit(discountBenefit);
    }
}
