package com.jekyllpark.designpattern.behavioral.visitor.example.e1.tobe;

public class GoldMember implements Member {
    @Override
    public void getBenefit(Benefit benefit) {
        benefit.getBenefit(this);
    }
}
