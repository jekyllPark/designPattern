package com.jekyllpark.designpattern.behavioral.visitor.example.e1.tobe;

import com.jekyllpark.designpattern.behavioral.visitor.example.e1.tobe.GoldMember;
import com.jekyllpark.designpattern.behavioral.visitor.example.e1.tobe.VipMember;

public class PointBenefit implements Benefit {
    @Override
    public void getBenefit(GoldMember member) {
        System.out.println("Point For Gold Member");
    }

    @Override
    public void getBenefit(VipMember member) {
        System.out.println("Point For VIP Member");
    }
}
