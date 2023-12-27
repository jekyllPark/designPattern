package com.jekyllpark.designpattern.structural.adapter.example.e0;

public class Adapter implements Target {
    private final Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void call() {
        adaptee.api();
    }
}
