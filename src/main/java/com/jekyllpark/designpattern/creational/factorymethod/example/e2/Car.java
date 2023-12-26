package com.jekyllpark.designpattern.creational.factorymethod.example.e2;

public class Car implements Vehicle {
    @Override
    public void build() {
        System.out.println("Build Car");
    }
}
