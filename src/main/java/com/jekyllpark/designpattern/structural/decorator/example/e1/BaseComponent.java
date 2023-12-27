package com.jekyllpark.designpattern.structural.decorator.example.e1;

public class BaseComponent implements Component {
    @Override
    public String add() {
        return "espresso";
    }
}
