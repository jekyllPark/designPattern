package com.jekyllpark.designpattern.structural.bridge.example.e1;

public class HuntingMethod2 implements HuntingHandler {
    @Override
    public void findQuarry() {
        System.out.println("searching targets on ground");
    }

    @Override
    public void detectedQuarry() {
        System.out.println("detected a rabbit");
    }

    @Override
    public void attack() {
        System.out.println("bite it");
    }
}
