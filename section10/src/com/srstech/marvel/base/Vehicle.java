package com.srstech.marvel.base;

public class Vehicle {

    public int horsePower;
    public String color;
    public double turningRadius;
    public String modeFor;
    Engine engine;

    public Vehicle(String madeFor) {
        System.out.println("Inside Vehicle default constructor");
        horsePower = 120;
        color = "White";
        turningRadius = 5.23;
        this.modeFor = madeFor;
    }

    public static void start() {
        System.out.println("Vehicle starting...");
    }
}
