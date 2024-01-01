package com.jekyllpark.designpattern.behavioral.mediator.example.e1;

public class mediatorService {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();
        Colleague userA = new UserConcreteColleague("userA");
        UserConcreteColleague userB = new UserConcreteColleague("userB");
        UserConcreteColleague userC = new UserConcreteColleague("userC");
        AdminConcreteColleague adminA = new AdminConcreteColleague("adminA");
        userA.setMediator(mediator);
        userB.setMediator(mediator);
        userC.setMediator(mediator);
        adminA.setMediator(mediator);

        mediator.addColleague(userA);
        mediator.addColleague(userB);
        mediator.addColleague(userC);
        mediator.addColleague(adminA);

        userA.setMessage("hi, I am A");
        userA.send();
        userB.setMessage("hi, I am B");
        userB.send();
        userC.setMessage("hi, I am C");
        userC.send();

        adminA.setMessage("admin");
        adminA.send();
    }
}
