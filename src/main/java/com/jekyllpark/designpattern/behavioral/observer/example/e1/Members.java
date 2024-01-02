package com.jekyllpark.designpattern.behavioral.observer.example.e1;

import java.util.ArrayList;
import java.util.List;

public class Members implements Subject {
    private List<Observer> observers;

    public Members() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        observers.forEach(Observer::update);
    }
}
