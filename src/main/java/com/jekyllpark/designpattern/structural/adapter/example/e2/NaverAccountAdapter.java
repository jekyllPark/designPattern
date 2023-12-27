package com.jekyllpark.designpattern.structural.adapter.example.e2;

public class NaverAccountAdapter implements TotalAccountInfo {
    private final NaverAccount account;

    public NaverAccountAdapter(NaverAccount account) {
        this.account = account;
    }

    @Override
    public String getAccountInfo() {
        return account.toString();
    }
}
