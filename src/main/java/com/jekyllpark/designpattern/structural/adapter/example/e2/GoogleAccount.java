package com.jekyllpark.designpattern.structural.adapter.example.e2;

public class GoogleAccount {
    private final String id;
    private final String name;
    private final String email;

    public String getAccountInfo() {
        return "id = " + id + ", name = " + name + ", email = " + email;
    }

    public GoogleAccount(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
}
