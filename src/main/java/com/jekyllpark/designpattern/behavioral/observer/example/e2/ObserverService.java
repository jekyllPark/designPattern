package com.jekyllpark.designpattern.behavioral.observer.example.e2;

public class ObserverService {
    public static void main(String[] args) {
        DiceAPI api = new DiceAPI();
        api.registerObserver(new User("userA"));
        api.logic();
    }
}
