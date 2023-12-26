package com.jekyllpark.designpattern.creational.prototype.example.e1;

public class SheepFarm {
    public static void main(String[] args) {
        BlackSheep blackProto = new BlackSheep("black");
        WhiteSheep whiteProto = new WhiteSheep("white");
        Sheep cloneBlack = blackProto.clone();
        Sheep cloneWhite = whiteProto.clone();

        cloneBlack.setName("clonedBlack");
        cloneWhite.setName("clonedWhite");
        System.out.println("blackProto = " + blackProto);
        System.out.println("whiteProto = " + whiteProto);
        System.out.println("cloneBlack = " + cloneBlack.getName());
        System.out.println("cloneWhite = " + cloneWhite.getName());
    }
}
