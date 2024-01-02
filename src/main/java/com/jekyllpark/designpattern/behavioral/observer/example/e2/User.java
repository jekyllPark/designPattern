package com.jekyllpark.designpattern.behavioral.observer.example.e2;

public class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void print(DiceAPI api) {
        System.out.println(this.name + " 님의 " + api.result);
    }
}
