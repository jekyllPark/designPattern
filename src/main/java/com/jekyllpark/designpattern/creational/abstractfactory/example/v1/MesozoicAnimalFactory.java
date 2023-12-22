package com.jekyllpark.designpattern.creational.abstractfactory.example.v1;

public class MesozoicAnimalFactory implements EraAnimalFactory{
    @Override
    public LandAnimal makeLandAnimal() {
        return new LandAnimal(AnimalEra.MESOZOIC, "Tyrannosaurus Rex");
    }

    @Override
    public SkyAnimal makeSkyAnimal() {
        return new SkyAnimal(AnimalEra.MESOZOIC, "Pterodactylus");
    }

    Animal createAnimal(AnimalType type) {
        switch (type) {
            case LAND : return makeLandAnimal();
            case SKY : return makeSkyAnimal();
        }
        return null;
    }
}
