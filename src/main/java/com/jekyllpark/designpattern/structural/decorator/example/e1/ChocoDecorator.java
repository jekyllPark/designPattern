package com.jekyllpark.designpattern.structural.decorator.example.e1;

public class ChocoDecorator extends Decorator{
    public ChocoDecorator(Component component) {
        super(component);
    }

    @Override
    public String add() {
        return super.add() + " + choco syrup";
    }
}
