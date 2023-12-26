package com.jekyllpark.designpattern.creational.abstractfactory.example.e2;

public class BeverageAbstractFactory {
    Beverage beverage;
    Beverage createBeverage(BeverageType type, String name) {
        switch (type) {
            case COFFEE :
                beverage = new CoffeeFactory().makeBeverage(name);
                break;
            case ALCOHOL :
                beverage = new AlcoholFactory().makeBeverage(name);
                break;
        }
        return beverage;
    }
}
