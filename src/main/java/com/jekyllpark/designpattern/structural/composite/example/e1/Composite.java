package com.jekyllpark.designpattern.structural.composite.example.e1;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
    private List<Component> components = new ArrayList<>();
    public void add(Component component) {
        components.add(component);
    }
    public void remove(Component component) {
        components.remove(component);
    }
    @Override
    public void operation() {
        System.out.println("Composite operation");
        for (Component component : components) {
            component.operation();
        }
    }
}
