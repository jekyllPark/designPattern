package com.jekyllpark.designpattern.creational.abstractfactory.example.e3;

public class ModernFurnitureFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        return new ModernChair();
    }
}
