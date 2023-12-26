package com.jekyllpark.designpattern.creational.factorymethod.example.e2;

public class CarFactory extends VehicleFactory {
    @Override
    protected Vehicle createVehicle() {
        return new Car();
    }
}
