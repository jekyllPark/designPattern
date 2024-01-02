package com.jekyllpark.designpattern.behavioral.visitor.example.e1.asis;

public class GoldMember implements Member {
    @Override
    public void point() {
        System.out.println("Point for Gold Member");
    }

    @Override
    public void discount() {
        System.out.println("Discount For Gold Member");
    }
}
