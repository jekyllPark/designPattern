package com.jekyllpark.designpattern.structural.composite.example.e1;

public class Leaf implements Component {
    @Override
    public void operation() {
        System.out.println("Leaf operation");
    }
}
