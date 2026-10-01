package com.srstech.object.demo;

public class HashCodeEqualsDemo {
    public static void main(String[] args) {
        Person p1= new Person("Siyaram",25,'M',435542434);
        Person p2= new Person("Siyaram",25,'M',435542434);
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p1.equals(p2)); //false
        System.out.println(p1);
        System.out.println(p2);
    }
}
