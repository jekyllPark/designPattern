package com.jekyllpark.designpattern.structural.adapter.example.e2;

public class AccountService {
    public static void main(String[] args) {
        TotalAccountInfo info1 = new NaverAccountAdapter(new NaverAccount("1", "park", "park@naver.com"));
        String accountInfo = info1.getAccountInfo();
        System.out.println("accountInfo = " + accountInfo);
        TotalAccountInfo info2 = new GoogleAccountAdapter(new GoogleAccount("2", "kim", "kim@gmail.com"));
        String accountInfo1 = info2.getAccountInfo();
        System.out.println("accountInfo1 = " + accountInfo1);
    }
}
