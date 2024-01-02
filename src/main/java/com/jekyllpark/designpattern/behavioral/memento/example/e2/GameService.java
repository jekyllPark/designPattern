package com.jekyllpark.designpattern.behavioral.memento.example.e2;

public class GameService {
    public static void main(String[] args) {
        Game originator = new Game();
        GameDataSystem careTaker = new GameDataSystem();
        originator.setLevel(3);
        originator.setScore(1500);
        SaveData memento = originator.createMemento();
        careTaker.save(memento);
        originator.printCurrentState();
        System.out.println("[BUG OCCURRED]");
        originator.setLevel(1);
        originator.setScore(500);
        originator.printCurrentState();
        // recover
        careTaker.recoverLastState();
        originator.printCurrentState();
        careTaker.recoverLastState();
    }
}
