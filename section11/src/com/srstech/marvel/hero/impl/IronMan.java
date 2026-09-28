package com.srstech.marvel.hero.impl;

import com.srstech.marvel.hero.SuperHero;

public class IronMan implements SuperHero {
    @Override
    public String userPower() {
        System.out.println(UNIVERSE_NAME);
        return "IronMan using his power";
    }

    @Override
    public String stopVillain(char c) {
        if (c == 'Y') {
            return "IronMan killed the Villain";
        } else {
            return "IronMan killed the Villain";
        }
    }
}
