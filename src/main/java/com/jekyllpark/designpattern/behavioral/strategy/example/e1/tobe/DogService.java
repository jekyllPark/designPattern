package com.jekyllpark.designpattern.behavioral.strategy.example.e1.tobe;

public class DogService {
    public static void main(String[] args) {
        Dog bulldog = new Bulldog();

        bulldog.move();
        bulldog.sound();

        System.out.println("strategy changed");
        bulldog.setMoveBehavior(new ToyDogMoveBehavior());
        bulldog.setSoundBehavior(new ToyDogSoundBehavior());

        bulldog.move();
        bulldog.sound();
    }
}
