package com.jekyllpark.designpattern.structural.bridge.example.e2;

public class MonoLine extends Brush {
    public static final String TYPE = "[Mono]";
    public MonoLine(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println(TYPE + " " + color.fill());
    }
}
