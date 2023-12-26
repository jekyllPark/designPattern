package com.jekyllpark.designpattern.creational.factorymethod.example.e3;

public class CorporationService {
    public static void main(String[] args) {
        Corporation corpV1 = new V1VehicleCorporation();
        Corporation corpV2 = new V2VehicleCorporation();
        MotorVehicle motorVehicleV1 = corpV1.createMotorVehicle();
        ElectricVehicle electricVehicleV1 = corpV1.createElectricVehicle();
        motorVehicleV1.build();
        electricVehicleV1.build();
        System.out.println("-----------------------");
        corpV2.createMotorVehicle();
        corpV2.createElectricVehicle();
        MotorVehicle motorVehicleV2 = corpV2.createMotorVehicle();
        ElectricVehicle electricVehicleV2 = corpV2.createElectricVehicle();
        motorVehicleV2.build();
        electricVehicleV2.build();
    }
}
