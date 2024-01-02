package com.jekyllpark.designpattern.behavioral.observer.example.e2;


import java.util.ArrayList;
import java.util.List;

public class DiceAPI implements Subject {
    List<Observer> observers = new ArrayList<>();
    String result = null;

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        observers.forEach(v -> v.print(this));
    }

    void logic() {
        result = "RANDOM DICE RESULT > [" + (int) (Math.random() * 6) + "]";
        notifyObserver();
    }
}
