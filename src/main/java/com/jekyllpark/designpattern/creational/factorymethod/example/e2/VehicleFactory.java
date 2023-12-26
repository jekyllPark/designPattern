package com.jekyllpark.designpattern.creational.factorymethod.example.e2;

public abstract class VehicleFactory {
    public Vehicle create() {
        Vehicle vehicle = createVehicle();
        vehicle.build();
        return vehicle;
    }
    protected abstract Vehicle createVehicle();
}
