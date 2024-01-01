package com.jekyllpark.designpattern.behavioral.mediator.example.e1;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements Mediator {
    private List<Colleague> colleagues;

    public ConcreteMediator() {
        this.colleagues = new ArrayList<>();
    }

    @Override
    public void addColleague(Colleague colleague) {
        this.colleagues.add(colleague);
    }

    @Override
    public void mediate(Colleague colleague) {
        for (Colleague c : colleagues) {
            System.out.println("\t [Mediating " + colleague.getName() + " to " + c.getName() + "] ");
            c.receive(colleague);
        }
    }
}
