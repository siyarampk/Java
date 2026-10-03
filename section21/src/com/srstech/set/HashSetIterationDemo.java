package com.srstech.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

public class HashSetIterationDemo {
    public static void main(String[] args) {
        Set<String> superpowers = new HashSet<>();
        // Superheroes and their unique abilities
        superpowers.add("Invisibility");
        superpowers.add("Teleportation");
        superpowers.add("Mind Reading");
        superpowers.add("Super Strength");
        superpowers.add("Time Travel");

        // Villains and their mischievous powers
        superpowers.add("Laser Vision");
        superpowers.add("Weather Manipulation");
        superpowers.add("Telekinesis");
        superpowers.add("Shape-Shifting");
        superpowers.add("Chaos Induction");

        for(String superPower : superpowers){
            System.out.println(superPower.toUpperCase(Locale.ROOT));
        }
        Iterator<String> superPower = superpowers.iterator();
        while (superPower.hasNext()){
            System.out.println(superPower.next().toLowerCase());
        }
    }
}
