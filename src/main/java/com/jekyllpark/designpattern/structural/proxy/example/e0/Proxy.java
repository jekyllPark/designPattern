package com.jekyllpark.designpattern.structural.proxy.example.e0;

public class Proxy implements Subject {
    private final RealSubject realSubject;

    public Proxy(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void action() {
        realSubject.action();
        System.out.println(getClass().getSimpleName());
    }
}
