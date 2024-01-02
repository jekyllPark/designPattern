package com.jekyllpark.designpattern.behavioral.visitor.example.e1.asis;

public class VipMember implements Member {
    @Override
    public void point() {
        System.out.println("Point for VIP Member");
    }

    @Override
    public void discount() {
        System.out.println("Discount For VIP Member");
    }
}
