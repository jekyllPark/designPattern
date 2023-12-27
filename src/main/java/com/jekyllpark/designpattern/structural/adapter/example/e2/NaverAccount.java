package com.jekyllpark.designpattern.structural.adapter.example.e2;

public class NaverAccount {
    private final String id;
    private final String name;
    private final String email;

    public String toString() {
        return "id = " + id + ", name = " + name + ", email = " + email;
    }

    public NaverAccount(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

}
