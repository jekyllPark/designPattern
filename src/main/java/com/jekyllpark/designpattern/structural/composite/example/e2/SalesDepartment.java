package com.jekyllpark.designpattern.structural.composite.example.e2;

public class SalesDepartment implements Department {
    private Long id;
    private String name;

    public SalesDepartment(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void printDepartmentName() {
        System.out.println(getClass().getSimpleName());
    }
}
