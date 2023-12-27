package com.jekyllpark.designpattern.structural.flyweight.example.e1;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    public static final Map<String, Tree> treeMap = new HashMap<>();

    public static Tree getTree(String treeColor) {
        Tree tree = treeMap.get(treeColor);

        if (tree == null) {
            System.out.println("최초 호출");
            tree = new Tree(treeColor);
            treeMap.put(treeColor, tree);
            System.out.println("new instance");
        }
        System.out.println("기존 값 반환");

        return tree;
    }
}
