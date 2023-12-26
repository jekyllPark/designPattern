package com.jekyllpark.designpattern.creational.factorymethod.example.e1;

public class NotificationFactory {
    public Notification createNotification(Channel channel) {
        if (channel == null) return null;
        switch (channel) {
            case SMS:
                return new SMSNotification();
            case EMAIL:
                return new EmailNotification();
            case PUSH:
                return new PushNotification();
            default:
                throw new IllegalArgumentException("Unknown Channel " + channel);
        }
    }
}
