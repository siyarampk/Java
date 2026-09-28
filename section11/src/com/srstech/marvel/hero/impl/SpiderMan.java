package com.srstech.marvel.hero.impl;

import com.srstech.marvel.hero.SuperHero;

public class SpiderMan implements SuperHero {
    @Override
    public String userPower() {
        return "SpiderMan using his power";
    }

    @Override
    public String stopVillain(char c) {
        if (c == 'Y') {
            return "SpiderMan killed the Villain";
        } else {
            return "SpiderMan killed the Villain";
        }
    }

    @Override
    public String trackLiveLocation() {
        String liveLocation = "London";
        System.out.println("I am in " + liveLocation);
        return liveLocation;
    }

    private String method1() {
        String liveLocation = "USA";
        System.out.println("I am in " + liveLocation);
        return liveLocation;
    }

    static String commonCharacteristics() {
        return "Superhuman abilities, Willingness to sacrifice";
    }

    @Override
    public void walk() {

    }
}
