package com.jekyllpark.designpattern.behavioral.command.example.e1;

public class LightOnCommand implements Command {
    private final Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void run() {
        light.on();
    }
}
