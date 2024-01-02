package com.jekyllpark.designpattern.behavioral.strategy.example.e1.tobe;

public class Bulldog extends Dog {
    public Bulldog() {
        setMoveBehavior(new BulldogMoveBehavior());
        setSoundBehavior(new BulldogSoundBehavior());
    }

    @Override
    public void display() {
        System.out.println("i am 불독입니다.");
    }
}
