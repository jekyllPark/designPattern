package com.jekyllpark.designpattern.creational.factorymethod.example.e3;

public class ElectricCarV1 implements ElectricVehicle{
    @Override
    public void build() {
        System.out.println("Build a Electric Car V1");
    }
}
