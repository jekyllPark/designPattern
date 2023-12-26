package com.jekyllpark.designpattern.creational.factorymethod.example.e2;

public class Motorcycle implements Vehicle {
    @Override
    public void build() {
        System.out.println("Build Motorcycle");
    }
}
