package com.jekyllpark.designpattern.structural.proxy.example.e0;

public class ProxyLogging implements Subject {
    private final RealSubject subject;

    public ProxyLogging(RealSubject subject) {
        this.subject = subject;
    }

    @Override
    public void action() {
        System.out.println("LOG START");
        subject.action();
        System.out.println("LOG END");
    }
}
