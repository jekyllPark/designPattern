package com.jekyllpark.designpattern.behavioral.observer.example.e1;

public class MembersService {
    public static void main(String[] args) {
        Subject subject = new Members();
        Observer ob1 = new UserA("userA");
        Observer ob2 = new UserB("userB");
        subject.addObserver(ob1);
        subject.addObserver(ob2);
        subject.notifyObserver();
    }
}
