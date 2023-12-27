package com.jekyllpark.designpattern.structural.adapter.example.e0;

public class AdapterService {
    public static void main(String[] args) {
        Target target = new Adapter(new Adaptee());
        target.call();
    }
}
