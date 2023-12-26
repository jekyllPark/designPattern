package com.jekyllpark.designpattern.creational.factorymethod.example.e3;

public class ElectricCarV2 implements ElectricVehicle{
    @Override
    public void build() {
        System.out.println("Build a Electric Car V2");
    }
}
