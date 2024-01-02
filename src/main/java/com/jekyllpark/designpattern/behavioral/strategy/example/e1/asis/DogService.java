package com.jekyllpark.designpattern.behavioral.strategy.example.e1.asis;

public class DogService {
    public static void main(String[] args) {
        Dog bulldog = new Bulldog();
        Dog toyDog = new ToyDog();
        bulldog.display();
        bulldog.move();
        bulldog.sound();
        bulldog.stand();
        System.out.println("==============");
        toyDog.display();
        toyDog.move();
        toyDog.sound();
        toyDog.stand();
    }
}
