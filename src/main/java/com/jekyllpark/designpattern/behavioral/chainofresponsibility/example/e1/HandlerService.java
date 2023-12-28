package com.jekyllpark.designpattern.behavioral.chainofresponsibility.example.e1;

public class HandlerService {
    public static void main(String[] args) {
        ProtocolHandler protocolHandler = new ProtocolHandler();
        DomainHandler domainHandler = new DomainHandler();
        PortHandler portHandler = new PortHandler();
        protocolHandler.setNext(domainHandler).setNext(portHandler);

        String url = "https://www.youtube.com:80";
        System.out.println("INPUT : " + url);
        protocolHandler.run(url);
    }
}
