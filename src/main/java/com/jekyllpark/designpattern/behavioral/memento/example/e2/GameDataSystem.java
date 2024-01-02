package com.jekyllpark.designpattern.behavioral.memento.example.e2;

import java.util.ArrayList;
import java.util.List;

public class GameDataSystem {
    private List<SaveData> history;

    public GameDataSystem() {
        this.history = new ArrayList<>();
    }
    public void save(SaveData memento) {
        history.add(memento);
    }
    public void recoverLastState() {
        if (!history.isEmpty()) {
            SaveData snapshot = history.remove(history.size() - 1);
            System.out.println("최근 저장 상태를 불러옵니다.");
            snapshot.recover();
        } else {
            System.out.println("저장 기록이 없습니다.");
        }
    }
}
