package com.jekyllpark.designpattern.creational.builder.example.e1;

public class EmployeeBuilder {
    protected String name;
    protected String company;
    protected boolean hasCar;//optional
    protected boolean hasBike;//optional

    //constructor for required fields
    public EmployeeBuilder(String name, String company) {
        this.name = name;
        this.company = company;
    }

    //setter methods for optional fields
    public EmployeeBuilder setHasCar(boolean hasCar) {
        this.hasCar = hasCar;
        return this;
    }

    public EmployeeBuilder setHasBike(boolean hasBike) {
        this.hasBike = hasBike;
        return this;
    }

    //Build the Employee object
    public Employee build() {
        return new Employee(this);
    }

}
