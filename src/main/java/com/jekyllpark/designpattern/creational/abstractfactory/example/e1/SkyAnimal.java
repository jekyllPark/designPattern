package com.jekyllpark.designpattern.creational.abstractfactory.example.e1;

public class SkyAnimal extends Animal {
    public SkyAnimal(AnimalEra era, String name) {
        super(AnimalType.SKY, era, name);
        create();
    }

    @Override
    protected void create() {
        System.out.println("Creating a " + type + " animal: " + name);
    }
}
