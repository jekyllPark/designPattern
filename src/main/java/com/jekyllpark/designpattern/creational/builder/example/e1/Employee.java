package com.jekyllpark.designpattern.creational.builder.example.e1;

public class Employee {
    private String name;
    private String company;
    private boolean hasCar;
    private boolean hasBike;

    Employee(EmployeeBuilder builder) {
        name = builder.name;
        company = builder.company;
        hasCar = builder.hasCar;
        hasBike = builder.hasBike;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", hasCar=" + hasCar +
                ", hasBike=" + hasBike +
                '}';
    }
}
