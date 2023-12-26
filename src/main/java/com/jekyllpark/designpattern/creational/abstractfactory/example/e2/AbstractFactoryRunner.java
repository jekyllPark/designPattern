package com.jekyllpark.designpattern.creational.abstractfactory.example.e2;

public class AbstractFactoryRunner {
    public static void main(String[] args) {
        new BeverageAbstractFactory().createBeverage(BeverageType.COFFEE, "Latte");
        new BeverageAbstractFactory().createBeverage(BeverageType.ALCOHOL, "고량주");
    }
}
