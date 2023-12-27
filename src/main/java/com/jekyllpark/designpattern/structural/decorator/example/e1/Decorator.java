package com.jekyllpark.designpattern.structural.decorator.example.e1;

public class Decorator implements Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }
    public String add() {
        return component.add();
    }
}
