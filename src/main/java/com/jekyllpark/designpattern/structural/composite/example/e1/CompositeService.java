package com.jekyllpark.designpattern.structural.composite.example.e1;

public class CompositeService {
    public static void main(String[] args) {
        Leaf leaf1 = new Leaf();
        Leaf leaf2 = new Leaf();
        Composite composite1 = new Composite();
        Composite composite2 = new Composite();

        composite1.add(leaf1);

        composite2.add(leaf2);

        composite1.add(composite2);

        composite1.operation();
    }
}
