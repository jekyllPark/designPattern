package com.jekyllpark.designpattern.behavioral.observer.example.e1;

public abstract class Observer {
    private String name;
    public abstract void update();
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
