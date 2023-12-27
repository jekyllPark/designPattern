package com.jekyllpark.designpattern.structural.adapter.example.e1;

public class ChargerService {
    public static void main(String[] args) {
        Charger charger = new GalaxyChargerAdapter(new Galaxy());
        Charger charger2 = new IPhoneChargerAdapter(new IPhone());
        charger.charge();
        charger2.charge();
    }
}
