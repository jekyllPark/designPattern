package com.jekyllpark.designpattern.structural.adapter.example.e2;

public class GoogleAccountAdapter implements TotalAccountInfo {
    private final GoogleAccount account;

    public GoogleAccountAdapter(GoogleAccount account) {
        this.account = account;
    }

    @Override
    public String getAccountInfo() {
        return account.getAccountInfo();
    }
}
