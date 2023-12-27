package com.jekyllpark.designpattern.structural.decorator.example.e1;

public class CoffeeService {
    public static void main(String[] args) {
        BaseComponent espresso = new BaseComponent();
        System.out.println("espresso.add() = " + espresso.add());
        WaterDecorator americano = new WaterDecorator(new BaseComponent());
        System.out.println("americano.add() = " + americano.add());
        MilkDecorator latte = new MilkDecorator(new BaseComponent());
        System.out.println("latte.add() = " + latte.add());
        ChocoDecorator chocoLatte = new ChocoDecorator(new MilkDecorator(new BaseComponent()));
        System.out.println("chocoLatte.add() = " + chocoLatte.add());
    }
}
