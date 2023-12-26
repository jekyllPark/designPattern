package com.jekyllpark.designpattern.creational.factorymethod.example.e2;

public class MotorcycleFactory extends VehicleFactory {
    @Override
    protected Vehicle createVehicle() {
        return new Motorcycle();
    }
}
