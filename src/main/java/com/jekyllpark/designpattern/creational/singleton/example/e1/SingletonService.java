package com.jekyllpark.designpattern.creational.singleton.example.e1;

public class SingletonService {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
//        Singleton s = new Singleton(); 불가능
        System.out.println("instance1.hashCode() = " + instance1.hashCode());
        System.out.println("instance2.hashCode() = " + instance2.hashCode());

        System.out.println(instance1.equals(instance2));
    }
}
