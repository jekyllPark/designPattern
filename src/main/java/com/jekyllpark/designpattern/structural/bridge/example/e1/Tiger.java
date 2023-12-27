package com.jekyllpark.designpattern.structural.bridge.example.e1;

public class Tiger extends Animal {
    public Tiger(HuntingHandler handler) {
        super(handler);
    }
    public void hunt() {
        System.out.println("way of tiger's hunting");
        findQuarry();
        detectedQuarry();
        attack();
    }
}
