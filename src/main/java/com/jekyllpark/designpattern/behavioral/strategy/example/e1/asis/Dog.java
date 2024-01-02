package com.jekyllpark.designpattern.behavioral.strategy.example.e1.asis;

public abstract class Dog {
    abstract void display();
    void move() {
        System.out.println("걷다");
    }
    void sound() {
        System.out.println("월월");
    }
    void stand() {
        System.out.println("서다");
    }
}
