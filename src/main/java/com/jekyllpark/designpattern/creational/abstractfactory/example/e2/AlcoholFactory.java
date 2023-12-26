package com.jekyllpark.designpattern.creational.abstractfactory.example.e2;

public class AlcoholFactory implements BeverageFactory{
    @Override
    public Beverage makeBeverage(String name) {
        return new Alcohol(name);
    }
}
