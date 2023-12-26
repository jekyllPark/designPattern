package com.jekyllpark.designpattern.creational.abstractfactory.example.e3;

public class AbstractFactoryRunner {
    public static void main(String[] args) {
        Chair victorian = new FurnitureAbstractFactory().createChair(ChairType.VICTORIAN);
        Chair modern = new FurnitureAbstractFactory().createChair(ChairType.MODERN);
        victorian.sitOn();
        modern.sitOn();
    }
}
