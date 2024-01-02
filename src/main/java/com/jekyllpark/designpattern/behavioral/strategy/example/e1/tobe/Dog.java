package com.jekyllpark.designpattern.behavioral.strategy.example.e1.tobe;

public abstract class Dog {
    private MoveBehavior moveBehavior;
    private SoundBehavior soundBehavior;
    public Dog() {

    }
    public abstract void display();
    public void move() {
        moveBehavior.move();
    }
    public void sound() {
        soundBehavior.sound();
    }
    public void stand() {
        System.out.println("서다");
    }

    public void setMoveBehavior(MoveBehavior moveBehavior) {
        this.moveBehavior = moveBehavior;
    }

    public void setSoundBehavior(SoundBehavior soundBehavior) {
        this.soundBehavior = soundBehavior;
    }
}
