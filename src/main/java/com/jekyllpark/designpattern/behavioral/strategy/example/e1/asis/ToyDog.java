package com.jekyllpark.designpattern.behavioral.strategy.example.e1.asis;

public class ToyDog extends Dog {
    @Override
    void display() {
        System.out.println("장난감 강아지의 형상이다");
    }

    @Override
    void sound() {
        System.out.println("삑삑");
    }
}
