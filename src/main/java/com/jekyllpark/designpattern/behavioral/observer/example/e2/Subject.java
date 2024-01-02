package com.jekyllpark.designpattern.behavioral.observer.example.e2;

public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserver();
}
