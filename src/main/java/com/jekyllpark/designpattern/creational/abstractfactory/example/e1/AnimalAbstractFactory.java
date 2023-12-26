package com.jekyllpark.designpattern.creational.abstractfactory.example.e1;

public class AnimalAbstractFactory {
    Animal animal;
    AnimalEra era = AnimalEra.MESOZOIC;

    Animal createAnimal(AnimalType type, AnimalEra era) {
        return getAnimal(type, era);
    }
    Animal createAnimal(AnimalType type) {
        return getAnimal(type, getFromConfiguration());
    }

    private Animal getAnimal(AnimalType type, AnimalEra era) {
        switch (era) {
            case MESOZOIC:
                animal = new MesozoicAnimalFactory().createAnimal(type);
                break;
            case CENOZOIC:
                animal = new CenozoicAnimalFactory().createAnimal(type);
                break;
        }
        return animal;
    }

    AnimalEra getFromConfiguration() {
        return AnimalEra.MESOZOIC; // default
    }

}
