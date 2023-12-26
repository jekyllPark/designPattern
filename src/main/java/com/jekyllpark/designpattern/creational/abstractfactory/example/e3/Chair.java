package com.jekyllpark.designpattern.creational.abstractfactory.example.e3;

public abstract class Chair {
    ChairType type;

    public Chair(ChairType type) {
        this.type = type;
    }

    abstract void sitOn();
}
