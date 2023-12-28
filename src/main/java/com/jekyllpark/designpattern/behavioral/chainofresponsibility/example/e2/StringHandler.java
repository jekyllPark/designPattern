package com.jekyllpark.designpattern.behavioral.chainofresponsibility.example.e2;

public class StringHandler extends Handler {

    @Override
    public <T> void process(T t) {
        System.out.println("String Handler Invoke!!");
        if (t instanceof String) {
            System.out.println("INPUT IS [" + t + "]");
        } else {
            System.out.println("cant handle [" + t.getClass() + "] in String Handler");
        }
    }
}
