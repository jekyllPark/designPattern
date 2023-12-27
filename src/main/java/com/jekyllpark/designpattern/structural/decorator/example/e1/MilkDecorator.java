package com.jekyllpark.designpattern.structural.decorator.example.e1;

public class MilkDecorator extends Decorator {
    public MilkDecorator(Component component) {
        super(component);
    }

    @Override
    public String add() {
        return super.add() + " + milk";
    }
}
