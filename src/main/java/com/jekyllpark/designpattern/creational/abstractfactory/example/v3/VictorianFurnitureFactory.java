package com.jekyllpark.designpattern.creational.abstractfactory.example.v3;

public class VictorianFurnitureFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }
}
