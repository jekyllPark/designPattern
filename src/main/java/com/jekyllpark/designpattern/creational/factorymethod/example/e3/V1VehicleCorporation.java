package com.jekyllpark.designpattern.creational.factorymethod.example.e3;

public class V1VehicleCorporation extends Corporation {
    @Override
    public MotorVehicle createMotorVehicle() {
        return new MotorCarV1();
    }

    @Override
    public ElectricVehicle createElectricVehicle() {
        return new ElectricCarV1();
    }
}
