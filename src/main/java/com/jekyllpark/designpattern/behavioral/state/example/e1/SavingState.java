package com.jekyllpark.designpattern.behavioral.state.example.e1;

public class SavingState implements PowerState {
    private SavingState(){}
    private static class SingleInstanceHolder {
        private static final SavingState INSTANCE = new SavingState();
    }
    public static SavingState getInstance() {
        return SingleInstanceHolder.INSTANCE;
    }
    @Override
    public void powerButtonPush(LaptopContext cxt) {
        System.out.println("Laptop Power ON");
        cxt.changeState(OnState.getInstance());
    }

    @Override
    public void typeButtonPush() {
        throw new IllegalStateException("Laptop is sleep mode");
    }

    @Override
    public String toString() {
        return "Laptop is sleep mode";
    }
}
