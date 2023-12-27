package com.jekyllpark.designpattern.structural.decorator.example.e1;

public class WaterDecorator extends Decorator {
    public WaterDecorator(Component component) {
        super(component);
    }

    @Override
    public String add() {
        return super.add() + " + water";
    }
}
