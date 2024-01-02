package com.jekyllpark.designpattern.behavioral.state.example.e1;

public class OffState implements PowerState {
    private OffState() {}
    private static class SingleInstanceHolder {
        private static final OffState INSTANCE = new OffState();
    }
    public static OffState getInstance() {
        return SingleInstanceHolder.INSTANCE;
    }
    @Override
    public void powerButtonPush(LaptopContext cxt) {
        System.out.println("Laptop Power ON");
        cxt.changeState(OnState.getInstance());
    }

    @Override
    public void typeButtonPush() {
        throw new IllegalStateException("Laptop is OFF");
    }

    @Override
    public String toString() {
        return "Laptop is OFF";
    }
}
