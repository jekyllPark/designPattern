package com.jekyllpark.designpattern.creational.factorymethod.example.e1;

public class PushNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Sending a push notification");
    }
}
