package com.jekyllpark.designpattern.creational.abstractfactory.example.e3;

public class VictorianChair extends Chair {
    public VictorianChair() {
        super(ChairType.VICTORIAN);
    }

    @Override
    void sitOn() {
        System.out.println("Victorian 의자에 앉습니다.");
    }
}
