package com.srstech.object.demo;

public class CloneDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person p1 =new Person("Siyaram",25,'M',324454332);
        Person p2 = p1;
        p2.setName("Jone Doe");
        System.out.println(p1.getName());
        Person p3 = (Person) p1.clone();
        System.out.println(p3.getName());
        p3.setName("Will Smith");
        System.out.println(p1.getName());
        System.out.println(p3.getName());
    }
}
