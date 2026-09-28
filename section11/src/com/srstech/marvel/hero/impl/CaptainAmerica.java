package com.srstech.marvel.hero.impl;

import com.srstech.marvel.hero.SuperHero;

public class CaptainAmerica implements SuperHero {
    @Override
    public String userPower() {
        return "CaptainAmerica using his power";
    }

    @Override
    public String stopVillain(char c) {
        if (c == 'Y') {
            return "CaptainAmerica killed the Villain";
        } else {
            return "CaptainAmerica killed the Villain";
        }
    }
}
