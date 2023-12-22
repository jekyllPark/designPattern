package com.jekyllpark.designpattern.creational.abstractfactory.example.v1;

public abstract class Animal {
    AnimalType type;
    AnimalEra era;
    String name;

    public Animal(AnimalType type, AnimalEra era, String name) {
        this.type = type;
        this.era = era;
        this.name = name;
    }

    abstract void create();
}
