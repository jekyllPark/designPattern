package com.jekyllpark.designpattern.structural.bridge.example.e1;

public class AnimalService {
    public static void main(String[] args) {
        Animal tiger = new Tiger(new HuntingMethod2());
        Animal bird = new Bird(new HuntingMethod1());
        tiger.hunt();
        System.out.println("===========");
        bird.hunt();
    }

}
