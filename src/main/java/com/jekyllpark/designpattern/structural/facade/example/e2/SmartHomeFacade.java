package com.jekyllpark.designpattern.structural.facade.example.e2;

public class SmartHomeFacade {
    private final Lighting lighting;
    private final MusicSystem musicSystem;

    public SmartHomeFacade(Lighting lighting, MusicSystem musicSystem) {
        this.lighting = lighting;
        this.musicSystem = musicSystem;
    }
    public void startRoutine() {
        lighting.on();
        musicSystem.playMusic();
    }
    public void endRoutine() {
        lighting.off();
        musicSystem.stopMusic();
    }
}
