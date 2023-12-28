package com.jekyllpark.designpattern.behavioral.command.example.e1;

public class LivingRoomLight implements Light {
    @Override
    public void on() {
        System.out.println("안방 불을 켭니다.");
    }
}
