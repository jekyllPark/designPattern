package com.jekyllpark.designpattern.creational.prototype.example.e1;

public class BlackSheep implements Sheep {
    private String name;

    public BlackSheep(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Sheep clone() {
        return new BlackSheep(this.name);
    }
}
