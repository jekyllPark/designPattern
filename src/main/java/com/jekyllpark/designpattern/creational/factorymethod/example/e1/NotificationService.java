package com.jekyllpark.designpattern.creational.factorymethod.example.e1;

import static com.jekyllpark.designpattern.creational.factorymethod.example.e1.Channel.*;

public class NotificationService {
    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();
        Notification email = factory.createNotification(EMAIL);
        Notification sms = factory.createNotification(SMS);
        Notification push = factory.createNotification(PUSH);
        email.notifyUser();
        sms.notifyUser();
        push.notifyUser();
    }
}
