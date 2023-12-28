package com.jekyllpark.designpattern.behavioral.chainofresponsibility.example.e2;

public class NumberHandler extends Handler {
    @Override
    public <T> void process(T t) {
        System.out.println("Number Handler Invoke !!");
        if (t instanceof Number) {
            System.out.println("INPUT IS [" + t + "]");
        } else {
            System.out.println("cant handle type [" + t.getClass() + "] in Number Handler");
        }
    }
}
