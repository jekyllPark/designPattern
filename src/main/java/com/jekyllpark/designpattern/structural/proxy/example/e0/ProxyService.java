package com.jekyllpark.designpattern.structural.proxy.example.e0;

public class ProxyService {
    public static void main(String[] args) {
        Subject proxy = new Proxy(new RealSubject());
        proxy.action();
        System.out.println("===================");
        Subject lazy = new ProxyLazy();
        lazy.action();
        System.out.println("===================");
        Subject logging = new ProxyLogging(new RealSubject());
        logging.action();
    }
}
