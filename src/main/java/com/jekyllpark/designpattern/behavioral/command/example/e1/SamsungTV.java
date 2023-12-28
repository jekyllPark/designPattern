package com.jekyllpark.designpattern.behavioral.command.example.e1;

public class SamsungTV implements TV {
    @Override
    public void on() {
        System.out.println("삼성 티비를 킵니다.");
    }
}
