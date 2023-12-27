package com.jekyllpark.designpattern.structural.decorator.example.e2;

public class TunaDecorator extends StewDecorator {
    public TunaDecorator(StewComponent component) {
        super(component);
    }

    @Override
    public String add() {
        return super.add() + " + tuna";
    }
}
