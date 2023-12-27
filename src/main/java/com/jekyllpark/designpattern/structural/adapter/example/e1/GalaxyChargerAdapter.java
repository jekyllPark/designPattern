package com.jekyllpark.designpattern.structural.adapter.example.e1;

public class GalaxyChargerAdapter implements Charger{
    private final Galaxy galaxy;

    public GalaxyChargerAdapter(Galaxy galaxy) {
        this.galaxy = galaxy;
    }

    @Override
    public void charge() {
        galaxy.chargeByCType();
    }
}
