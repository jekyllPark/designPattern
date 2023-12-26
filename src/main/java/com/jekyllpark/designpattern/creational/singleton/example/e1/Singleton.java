package com.jekyllpark.designpattern.creational.singleton.example.e1;

public class Singleton {
    private static Singleton instance = null;
    public String msg;
    private Singleton() {
        msg = "hello, I am a string part of Singleton class";
    }
    public static synchronized Singleton getInstance() {
        if (instance == null) instance = new Singleton();
        return instance;
    }
}
