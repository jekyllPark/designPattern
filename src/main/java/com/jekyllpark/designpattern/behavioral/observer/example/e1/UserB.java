package com.jekyllpark.designpattern.behavioral.observer.example.e1;

public class UserB extends Observer {
    public UserB(String name) {
        this.setName(name);
    }

    @Override
    public void update() {
        System.out.println(this.getName() + " 을 갱신합니다.");
    }
}
