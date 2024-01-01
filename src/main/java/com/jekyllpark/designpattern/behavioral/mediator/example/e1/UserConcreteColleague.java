package com.jekyllpark.designpattern.behavioral.mediator.example.e1;

public class UserConcreteColleague extends Colleague {
    public UserConcreteColleague(String name) {
        super(name, ColleagueType.USER);
    }

    @Override
    public void receive(Colleague colleague) {
        if (ColleagueType.SYSTEM == colleague.getType()) {
            System.out.println("[SYSTEM] ");
        } else if (ColleagueType.USER == colleague.getType()) {
            System.out.println("[" + colleague.getName() + "]");
        }
        System.out.println(colleague.getMessage());
    }
}
