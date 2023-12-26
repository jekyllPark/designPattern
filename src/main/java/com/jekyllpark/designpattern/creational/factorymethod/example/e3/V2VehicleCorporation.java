package com.jekyllpark.designpattern.creational.factorymethod.example.e3;

public class V2VehicleCorporation extends Corporation {
    @Override
    public MotorVehicle createMotorVehicle() {
        return new MotorCarV2();
    }

    @Override
    public ElectricVehicle createElectricVehicle() {
        return new ElectricCarV2();
    }
}
