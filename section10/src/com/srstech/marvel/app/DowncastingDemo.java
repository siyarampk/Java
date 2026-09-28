package com.srstech.marvel.app;

import com.srstech.marvel.animals.Cat;
import com.srstech.marvel.animals.Dog;
import com.srstech.marvel.base.Animal;

public class DowncastingDemo {
    public static void main(String[] args) {
        Animal anm;
        Dog dog = new Dog();
        anm = dog; // upcasting

        dog = (Dog) anm; // downcasting
        AnimalUtility.peformAction(dog);

        if (anm instanceof Cat) {
            Cat cat = (Cat) anm;
        }
    }
}
