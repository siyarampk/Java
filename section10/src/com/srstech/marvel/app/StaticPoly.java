package com.srstech.marvel.app;

import com.srstech.marvel.heros.IronMan;

public class StaticPoly {
    public static void main(String[] args) {
        IronMan ironMan = new IronMan();
        ironMan.eat("Pasta");
        ironMan.eat("Pasta", 1);
    }
}
