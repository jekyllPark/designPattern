package com.jekyllpark.designpattern.creational.abstractfactory.example.v3;

import com.jekyllpark.designpattern.creational.abstractfactory.example.v2.BeverageAbstractFactory;
import com.jekyllpark.designpattern.creational.abstractfactory.example.v2.BeverageType;

public class AbstractFactoryRunner {
    public static void main(String[] args) {
        Chair victorian = new FurnitureAbstractFactory().createChair(ChairType.VICTORIAN);
        Chair modern = new FurnitureAbstractFactory().createChair(ChairType.MODERN);
        victorian.sitOn();
        modern.sitOn();
    }
}
