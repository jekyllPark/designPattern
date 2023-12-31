package com.jekyllpark.designpattern.creational.abstractfactory.example.e2;

public abstract class Beverage {
    BeverageType type;
    String name;

    public Beverage(BeverageType type, String name) {
        this.type = type;
        this.name = name;
    }

    abstract void create();
}
