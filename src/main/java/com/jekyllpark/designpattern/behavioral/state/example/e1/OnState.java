package com.jekyllpark.designpattern.behavioral.state.example.e1;

public class OnState implements PowerState {
    private OnState(){}
    private static class SingleInstanceHolder {
        private static final OnState INSTANCE = new OnState();
    }
    public static OnState getInstance() {
        return SingleInstanceHolder.INSTANCE;
    }
    @Override
    public void powerButtonPush(LaptopContext cxt) {
        System.out.println("Laptop Power OFF");
        cxt.changeState(OffState.getInstance());
    }

    @Override
    public void typeButtonPush() {
        System.out.println("type the key");
    }

    @Override
    public String toString() {
        return "Laptop is ON";
    }
}
