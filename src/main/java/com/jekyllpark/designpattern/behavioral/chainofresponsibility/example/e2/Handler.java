package com.jekyllpark.designpattern.behavioral.chainofresponsibility.example.e2;

public abstract class Handler {
    Handler next = null;
    public Handler setNext(Handler handler) {
        this.next = handler;
        return handler;
    }
    public abstract <T> void process(T t);
    public <T> void run(T t) {
        process(t);
        if (next != null) {
            next.run(t);
        }
    }
}
