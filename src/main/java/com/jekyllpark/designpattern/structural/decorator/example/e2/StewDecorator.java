package com.jekyllpark.designpattern.structural.decorator.example.e2;

public class StewDecorator implements StewComponent {
    private StewComponent component;

    public StewDecorator(StewComponent component) {
        this.component = component;
    }

    public String add() {
        return component.add();
    }
}
