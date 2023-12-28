package com.jekyllpark.designpattern.behavioral.command.example.e1;

public class GigaGenieV2 {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }
    public void talk() {
        command.run();
    }
}
