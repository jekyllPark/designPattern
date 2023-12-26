package com.jekyllpark.designpattern.creational.abstractfactory.example.e1;

public class AbstractFactoryRunner {
    public static void main(String[] args) {
        AnimalAbstractFactory mesozoic = new AnimalAbstractFactory();
        mesozoic.createAnimal(AnimalType.LAND);
        AnimalAbstractFactory cenozoic = new AnimalAbstractFactory();
        cenozoic.createAnimal(AnimalType.LAND, AnimalEra.CENOZOIC);
    }
}
