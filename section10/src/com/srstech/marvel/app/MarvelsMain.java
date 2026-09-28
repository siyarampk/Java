package com.srstech.marvel.app;

import com.srstech.marvel.base.Person;
import com.srstech.marvel.heros.IronMan;

public class MarvelsMain {
    public static void main(String[] args) {
        IronMan ironMan = new IronMan();
        ironMan.walk();
        ironMan.eat("Pasta");
        ironMan.sleep();
        ironMan.userPower();

        Person person = new Person();
        int hc = person.hashCode();
        String str = person.toString();
    }
}
