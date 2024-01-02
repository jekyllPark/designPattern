package com.jekyllpark.designpattern.behavioral.templatemethod.example.e1;

public class IceAmericanoExtraSyrup extends Coffee {
    @Override
    void putExtra() {
        System.out.println("시럽을 넣는다.");
    }
}
