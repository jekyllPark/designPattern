package com.jekyllpark.designpattern.behavioral.command.example.e1;

public class TVService {
    public static void main(String[] args) {
        TV samsungTV = new SamsungTV();
        GigaGenieV1 genie = new GigaGenieV1(samsungTV);
        genie.talk();
    }
}