package com.jekyllpark.designpattern.creational.abstractfactory.example.v1;

public class LandAnimal extends Animal {
    public LandAnimal(AnimalEra era, String name) {
        super(AnimalType.LAND, era, name);
        create();
    }

    @Override
    protected void create() {
        System.out.println("Creating a " + type + " animal: " + name);
    }
}
