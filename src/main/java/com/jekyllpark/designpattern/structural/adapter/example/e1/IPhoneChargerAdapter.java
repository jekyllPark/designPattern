package com.jekyllpark.designpattern.structural.adapter.example.e1;

public class IPhoneChargerAdapter implements Charger{
    private final IPhone iPhone;

    public IPhoneChargerAdapter(IPhone iPhone) {
        this.iPhone = iPhone;
    }

    @Override
    public void charge() {
        iPhone.chargeBy5Pins();
    }
}
