package com.jekyllpark.designpattern.behavioral.state.example.e1;

public class LaptopContext {
    PowerState powerState;

    public LaptopContext() {
        this.powerState = OffState.getInstance();
    }
    void changeState(PowerState state) {
        this.powerState = state;
    }
    void setSavingState() {
        System.out.println("노트북 절전 모드");
        changeState(SavingState.getInstance());
    }
    void powerButtonPush() {
        powerState.powerButtonPush(this);
    }
    void typeButtonPush() {
        powerState.typeButtonPush();
    }
    void currentStatePrint() {
        System.out.println(powerState.toString());
    }
}
