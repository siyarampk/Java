package com.srstech.exception;

import java.io.FileNotFoundException;

public class ExceptionPropogationDemo {

    public static void main(String[] args) {
        method1();
        System.out.println("Main Method");
    }

    public static void method1() {
        try {
            method2();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void method2() throws FileNotFoundException {
        method3();
    }

    public static void method3() throws FileNotFoundException {
        throw new FileNotFoundException("File not found. Please check...");
    }

}
