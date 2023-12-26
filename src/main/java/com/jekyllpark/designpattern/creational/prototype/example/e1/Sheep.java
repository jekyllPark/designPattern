package com.jekyllpark.designpattern.creational.prototype.example.e1;

public interface Sheep {
    Sheep clone();
    String getName();
    void setName(String name);
}
