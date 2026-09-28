package com.srstech.marvel.hero.app;

import com.srstech.marvel.hero.SuperHero;
import com.srstech.marvel.hero.impl.CaptainAmerica;
import com.srstech.marvel.hero.impl.Developer;
import com.srstech.marvel.hero.impl.IronMan;
import com.srstech.marvel.hero.impl.SpiderMan;

public class MarvelHeroDemo {
    public static void main(String[] args) {
        SuperHero ironMan = new IronMan();
        invokeSuperHero(ironMan);

        SuperHero spiderMan = new SpiderMan();
        invokeSuperHero(spiderMan);

        SuperHero captainAmerica = new CaptainAmerica();
        invokeSuperHero(captainAmerica);

        Developer developer = new Developer();
        developer.walk();
    }

    private static void invokeSuperHero(SuperHero superHero) {
        System.out.println(superHero.userPower());
        System.out.println(superHero.stopVillain('N'));
    }
}
