package com.jekyllpark.designpattern.structural.decorator.example.e2;

public class KimchiDecorator extends StewDecorator {
    public KimchiDecorator(StewComponent component) {
        super(component);
    }

    @Override
    public String add() {
        return super.add() + " + kimchi";
    }
}
