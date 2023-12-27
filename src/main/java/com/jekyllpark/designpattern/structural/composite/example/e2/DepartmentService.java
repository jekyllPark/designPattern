package com.jekyllpark.designpattern.structural.composite.example.e2;

public class DepartmentService {
    public static void main(String[] args) {
        Department salesDepartment = new SalesDepartment(1L, "sales");
        Department financialDepartment = new FinancialDepartment(2L, "financial");
        HeadDepartment headDepartment = new HeadDepartment(3L, "head");
        headDepartment.addDepartment(salesDepartment);
        headDepartment.addDepartment(financialDepartment);
        headDepartment.printDepartmentName();
    }
}
