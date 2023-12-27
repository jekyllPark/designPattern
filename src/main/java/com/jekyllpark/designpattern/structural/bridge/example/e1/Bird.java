package com.jekyllpark.designpattern.structural.bridge.example.e1;

public class Bird extends Animal {
    public Bird(HuntingHandler handler) {
        super(handler);
    }
    public void hunt() {
        System.out.println("way of bird's hunting");
        findQuarry();
        detectedQuarry();
        attack();
    }
}
