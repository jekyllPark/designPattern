package com.jekyllpark.designpattern.behavioral.strategy.example.e1.tobe;

public class BulldogMoveBehavior implements MoveBehavior {
    @Override
    public void move() {
        System.out.println("걷는다.");
    }
}
