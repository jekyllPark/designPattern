package com.jekyllpark.designpattern.creational.abstractfactory.example.v2;

public class Coffee extends Beverage {
    public Coffee(String name) {
        super(BeverageType.COFFEE, name);
        create();
    }

    @Override
    void create() {
        System.out.println("Creating a " + type + ", " + name);
    }
}
