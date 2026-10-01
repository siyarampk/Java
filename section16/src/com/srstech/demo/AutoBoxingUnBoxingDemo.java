package com.srstech.demo;

public class AutoBoxingUnBoxingDemo {
    public static void main(String[] args) {
        //Autoboxing
        Integer integer = 16;
        Character character = 'A';
        Boolean boolObj = false;
        //Unboxing
        int num = integer;
        char a = character;
        boolean f = boolObj;

        System.out.println(num);
        System.out.println(a);
        System.out.println(f);

        Integer nullObj = null;
        int num1 = nullObj;
    }
}
