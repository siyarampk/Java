package com.srstech.marvel.app;

import com.srstech.marvel.base.Vehicle;
import com.srstech.marvel.vehicle.Car;

public class TestFieldHiding {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.color);
        System.out.println(car.horsePower);
        System.out.println(car.turningRadius);
        System.out.println(car.isAutomatic);
        car.printColorDetails();

        Vehicle vehicle = car;
        System.out.println(vehicle.color);
        System.out.println(vehicle.horsePower);
        System.out.println(vehicle.turningRadius);
    }
}
