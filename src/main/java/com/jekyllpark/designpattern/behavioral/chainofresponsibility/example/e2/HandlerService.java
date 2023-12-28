package com.jekyllpark.designpattern.behavioral.chainofresponsibility.example.e2;

public class HandlerService {
    public static void main(String[] args) {
        StringHandler defaultHandler = new StringHandler();
        NumberHandler numberHandler = new NumberHandler();
        defaultHandler.setNext(numberHandler);
        defaultHandler.run("String input");
    }
}
