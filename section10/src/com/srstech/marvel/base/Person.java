package com.srstech.marvel.base;

public class Person {
    public static int noOfHands = 2;
    protected String name;
    protected int age;

    protected void calculateAge(int year) {
        System.out.println("Age method");
    }

    public void eat(String food) {
        System.out.println("Person is eating the food : " + food);
    }

    public void walk() {
        System.out.println("Person is walking");
    }

    public void sleep() {
        System.out.println("Person is sleeping");
    }
}
