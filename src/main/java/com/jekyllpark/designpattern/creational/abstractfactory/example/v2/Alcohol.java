package com.jekyllpark.designpattern.creational.abstractfactory.example.v2;

public class Alcohol extends Beverage {
    public Alcohol(String name) {
        super(BeverageType.ALCOHOL, name);
        create();
    }

    @Override
    void create() {
        System.out.println("Creating a " + type + ", " + name);
    }
}
