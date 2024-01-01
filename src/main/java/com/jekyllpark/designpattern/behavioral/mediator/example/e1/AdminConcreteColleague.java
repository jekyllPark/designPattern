package com.jekyllpark.designpattern.behavioral.mediator.example.e1;

public class AdminConcreteColleague extends Colleague {
    public AdminConcreteColleague(String name) {
        super(name, ColleagueType.ADMIN);
    }

    @Override
    public void receive(Colleague colleague) {
        System.out.println("Admin can't receive messages");
    }
}
