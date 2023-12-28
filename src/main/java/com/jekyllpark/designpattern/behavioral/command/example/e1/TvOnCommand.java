package com.jekyllpark.designpattern.behavioral.command.example.e1;

public class TvOnCommand implements Command {
    private final TV tv;

    public TvOnCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void run() {
        tv.on();
    }
}
