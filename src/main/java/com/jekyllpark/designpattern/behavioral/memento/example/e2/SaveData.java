package com.jekyllpark.designpattern.behavioral.memento.example.e2;

public class SaveData {
    private Game originator;
    private int level;
    private int score;
    public SaveData(Game originator) {
        this.originator = originator;
        this.level = originator.getLevel();
        this.score = originator.getScore();
    }
    public void recover() {
        originator.setLevel(this.level);
        originator.setScore(this.score);
    }
}
