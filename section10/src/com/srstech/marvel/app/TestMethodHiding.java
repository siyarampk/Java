package com.srstech.marvel.app;

import com.srstech.marvel.base.Vehicle;
import com.srstech.marvel.vehicle.Car;

public class TestMethodHiding {
    public static void main(String[] args) {
        Vehicle vehicle = new Car(); // upcasting
        Car car = new Car();

        vehicle.start(); // 1= Vehicle starting
        vehicle.start(); //2 = Vehicle starting

        car.start(); // 3= Car starting
        car.start();//4= Car starting

        ((Vehicle) car).start();// 5 = Vehicle starting

        vehicle = car; //6
        vehicle.start(); //7 Vehicle starting
        ((Car) vehicle).start(); //8 cat staring
    }
}
