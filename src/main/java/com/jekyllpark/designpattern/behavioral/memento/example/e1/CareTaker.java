package com.jekyllpark.designpattern.behavioral.memento.example.e1;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private List<Memento> mementos = new ArrayList<>();
    public void add(Memento memento) {
        mementos.add(memento);
    }
    public Memento get(int idx) {
        return mementos.get(idx);
    }
}
