package com.jekyllpark.designpattern.structural.proxy.example.e0;

public class RealSubject implements Subject {
    @Override
    public void action() {
        System.out.println(getClass().getSimpleName());
    }
}
