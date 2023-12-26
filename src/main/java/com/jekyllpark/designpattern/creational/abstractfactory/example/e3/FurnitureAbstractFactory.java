package com.jekyllpark.designpattern.creational.abstractfactory.example.e3;

public class FurnitureAbstractFactory {
    Chair chair;
    Chair createChair(ChairType type) {
        switch (type) {
            case MODERN:
                chair = new ModernFurnitureFactory().createChair();
                break;
            case VICTORIAN:
                chair = new VictorianFurnitureFactory().createChair();
                break;
        }
        return chair;
    }
}
