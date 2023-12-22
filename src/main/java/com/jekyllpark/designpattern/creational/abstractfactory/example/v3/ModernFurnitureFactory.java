package com.jekyllpark.designpattern.creational.abstractfactory.example.v3;

public class ModernFurnitureFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        return new ModernChair();
    }
}
