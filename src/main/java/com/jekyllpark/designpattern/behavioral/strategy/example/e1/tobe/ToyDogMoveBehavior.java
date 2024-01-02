package com.jekyllpark.designpattern.behavioral.strategy.example.e1.tobe;

public class ToyDogMoveBehavior implements MoveBehavior {
    @Override
    public void move() {
        System.out.println("장난감 강아지가 걷는다.");
    }
}
