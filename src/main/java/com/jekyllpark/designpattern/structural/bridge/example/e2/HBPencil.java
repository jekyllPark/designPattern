package com.jekyllpark.designpattern.structural.bridge.example.e2;

public class HBPencil extends Brush {
    public static final String TYPE = "[HB]";
    public HBPencil(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println(TYPE + " " + color.fill());
    }
}
