package com.jekyllpark.designpattern.behavioral.observer.example.e1;

public interface Subject {
    void addObserver(Observer observer);
    void deleteObserver(Observer observer);
    void notifyObserver();
}
