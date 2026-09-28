package com.srstech.marvel.app;

import com.srstech.marvel.animals.Cat;
import com.srstech.marvel.animals.Dog;
import com.srstech.marvel.base.Animal;

public class AnimalUtility {
    public static void printName(Animal animal) {
        System.out.println(animal.getName());
        animal.eat();
    }

    public static void peformAction(Animal animal) {
        animal.eat();
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.bark();
        } else if (animal instanceof Cat cat) { //Java 16
            cat.meow();
        }

    }
}
