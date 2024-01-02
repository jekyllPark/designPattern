package com.jekyllpark.designpattern.behavioral.strategy.example.e1.tobe;

public class ToyDog extends Dog {
    public ToyDog() {
        setMoveBehavior(new ToyDogMoveBehavior());
        setSoundBehavior(new ToyDogSoundBehavior());
    }

    @Override
    public void display() {
        System.out.println("I am 장난감입니다.");
    }
}
