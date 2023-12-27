package com.jekyllpark.designpattern.structural.decorator.example.e2;

public class StewService {
    public static void main(String[] args) {
        TunaDecorator tunaKimchiStew = new TunaDecorator(new KimchiDecorator(new BaseStewComponent()));
        System.out.println("tunaKimchiStew.add() = " + tunaKimchiStew.add());
    }
}
