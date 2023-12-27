package com.jekyllpark.designpattern.structural.proxy.example.e0;

public class ProxyLazy implements Subject {
    private RealSubject subject;

    public ProxyLazy() {
    }

    @Override
    public void action() {
        if (subject == null) {
            subject = new RealSubject();
        }
        subject.action();
        System.out.println(getClass().getSimpleName());
    }
}
