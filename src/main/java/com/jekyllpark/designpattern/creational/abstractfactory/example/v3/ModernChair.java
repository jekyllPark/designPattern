package com.jekyllpark.designpattern.creational.abstractfactory.example.v3;

public class ModernChair extends Chair {
    public ModernChair() {
        super(ChairType.MODERN);
    }

    @Override
    void sitOn() {
        System.out.println("Modern 의자에 앉습니다.");
    }
}
