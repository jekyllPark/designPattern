package com.jekyllpark.designpattern.structural.bridge.example.e1;

public class HuntingMethod1 implements HuntingHandler {
    @Override
    public void findQuarry() {
        System.out.println("searching targets on water");
    }

    @Override
    public void detectedQuarry() {
        System.out.println("detected a fish");
    }

    @Override
    public void attack() {
        System.out.println("capture it");
    }
}
