package com.jekyllpark.designpattern.behavioral.memento.example.e2;

import javax.xml.transform.Source;

public class Game {
    private int level = 0;
    private int score = 0;

    public void setLevel(int level) {
        this.level = level;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getLevel() {
        return level;
    }

    public int getScore() {
        return score;
    }

    public SaveData createMemento() {
        System.out.println("LEVEL : " + level + ", SCORE : " + score + " 상태를 저장합니다.");
        return new SaveData(this);
    }

    public void printCurrentState() {
        System.out.println("현재 LEVEL : " + level + ", SCORE : " + score);
    }
}
