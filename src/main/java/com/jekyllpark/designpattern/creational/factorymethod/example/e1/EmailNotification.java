package com.jekyllpark.designpattern.creational.factorymethod.example.e1;

public class EmailNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Sending an e-mail notification");
    }
}
