package com.jekyllpark.designpattern.behavioral.chainofresponsibility.example.e1;

abstract class Handler {
    protected Handler nextHandler = null;
    public Handler setNext(Handler handler) {
        this.nextHandler = handler;
        return handler;
    }
    protected abstract void process(String url);
    public void run(String url) {
        process(url);
        if (nextHandler != null) nextHandler.run(url);
    }
}
