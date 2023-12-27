package com.jekyllpark.designpattern.structural.flyweight.example.e1;

/**
 * 예제 참고 https://velog.io/@hoit_98/%EB%94%94%EC%9E%90%EC%9D%B8-%ED%8C%A8%ED%84%B4-Flyweight-%ED%8C%A8%ED%84%B4
 * */
public class Tree {
    private String color;
    private int x;
    private int y;

    public Tree(String color) {
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void install() {
        System.out.println("x : " + x + ", y : " + y + " 위치에 " + color + " 색 나무를 설치했습니다.");
    }
}
