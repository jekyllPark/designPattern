package com.jekyllpark.designpattern.behavioral.command.example.e1;

public class GigaGenieV1 {
    private TV tv;

    public GigaGenieV1(TV tv) {
        this.tv = tv;
    }
    public void talk() {
        System.out.println("기가 지니 티비 들어줘");
        tv.on();
    }
}
