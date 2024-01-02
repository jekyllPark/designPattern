package com.jekyllpark.designpattern.behavioral.templatemethod.example.e1;

public class CoffeeService {
    public static void main(String[] args) {
        Coffee iceAmericano = new IceAmericano();
        Coffee americanoExtra = new IceAmericanoExtraSyrup();
        iceAmericano.make();
        System.out.println("=================");
        americanoExtra.make();
    }
}
