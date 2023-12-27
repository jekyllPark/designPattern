package com.jekyllpark.designpattern.structural.bridge.example.e1;

public abstract class Animal {
    private HuntingHandler handler;

    public Animal(HuntingHandler handler) {
        this.handler = handler;
    }
    public void findQuarry() {
        handler.findQuarry();
    }
    public void detectedQuarry() {
        handler.detectedQuarry();
    }
    public void attack() {
        handler.attack();
    }
    public void hunt() {
        findQuarry();
        detectedQuarry();
        attack();
    }
}
