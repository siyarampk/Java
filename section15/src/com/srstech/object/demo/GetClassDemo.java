package com.srstech.object.demo;

public class GetClassDemo {
    public static void main(String[] args) {
        Person person = new Person();
        Class personClass = person.getClass();
        System.out.println(personClass.getName());
        System.out.println(personClass.getSimpleName());
        System.out.println(personClass.getPackage());
        System.out.println(personClass.hashCode());
    }
}
