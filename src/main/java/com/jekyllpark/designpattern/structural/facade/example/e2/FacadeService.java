package com.jekyllpark.designpattern.structural.facade.example.e2;

public class FacadeService {
    public static void main(String[] args) {
        SmartHomeFacade facade = new SmartHomeFacade(new Lighting(), new MusicSystem());
        facade.startRoutine();
        facade.endRoutine();
    }
}
