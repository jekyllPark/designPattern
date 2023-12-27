package com.jekyllpark.designpattern.structural.bridge.example.e2;

public class ColorService {
    public static void main(String[] args) {
        HBPencil hbPencilBlue = new HBPencil(new Blue());
        HBPencil hbPencilRed = new HBPencil(new Red());
        hbPencilBlue.draw();
        hbPencilRed.draw();

        MonoLine monoLineRed = new MonoLine(new Red());
        MonoLine monoLineBlue = new MonoLine(new Blue());
        monoLineBlue.draw();
        monoLineRed.draw();
    }
}
