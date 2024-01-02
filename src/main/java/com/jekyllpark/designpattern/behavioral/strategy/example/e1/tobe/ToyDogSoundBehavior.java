package com.jekyllpark.designpattern.behavioral.strategy.example.e1.tobe;

public class ToyDogSoundBehavior implements SoundBehavior {
    @Override
    public void sound() {
        System.out.println("삑삑");
    }
}
