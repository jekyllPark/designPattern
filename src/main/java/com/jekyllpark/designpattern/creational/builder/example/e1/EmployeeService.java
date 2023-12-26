package com.jekyllpark.designpattern.creational.builder.example.e1;

public class EmployeeService {
    public static void main(String[] args) {
        Employee employee = new EmployeeBuilder("park", "etc").setHasCar(true).build();
        Employee employee1 = new Employee(new EmployeeBuilder("kim", "amazon").setHasBike(true));
        System.out.println("employee = " + employee);
        System.out.println("employee1 = " + employee1);
    }
}
