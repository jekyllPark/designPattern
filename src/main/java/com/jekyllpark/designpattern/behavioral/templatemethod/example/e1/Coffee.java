package com.jekyllpark.designpattern.behavioral.templatemethod.example.e1;

public abstract class Coffee {
    final void make() {
        pourWater();
        putIce();
        putEspresso();
        putExtra();
        pack();
    }
    abstract void putExtra();
    private void pourWater() {
        System.out.println("물을 붓다.");
    }
    private void putEspresso() {
        System.out.println("에스프레소를 넣는다.");
    }
    private void putIce() {
        System.out.println("얼음을 넣는다.");
    }
    private void pack() {
        System.out.println("포장한다.");
    }
}
