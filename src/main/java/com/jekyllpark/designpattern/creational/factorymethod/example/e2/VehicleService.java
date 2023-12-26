package com.jekyllpark.designpattern.creational.factorymethod.example.e2;

public class VehicleService {
    public static void main(String[] args) {
        VehicleFactory factory = new CarFactory();
        factory.create();
    }
}
