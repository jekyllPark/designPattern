package com.jekyllpark.designpattern.structural.flyweight.example.e1;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class TreeService {
    private static final Random random = ThreadLocalRandom.current();
    private static List<String> list = List.of("red", "blue", "green", "yellow");

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Tree tree = TreeFactory.getTree(getRandom());
            tree.setX((int) (Math.random() * 100));
            tree.setY((int) (Math.random() * 100));
            tree.install();
            System.out.println("===========");
        }
    }

    public static String getRandom() {
        int index = random.nextInt(list.size());
        return list.get(index);
    }

}
