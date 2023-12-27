package com.jekyllpark.designpattern.structural.decorator.example.e2;

public class BaseStewComponent implements StewComponent {
    @Override
    public String add() {
        return "water";
    }
}
