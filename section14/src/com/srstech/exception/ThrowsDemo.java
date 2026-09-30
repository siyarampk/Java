package com.srstech.exception;


public class ThrowsDemo {
    public static void main(String[] args) {
        Division division = new Division();
        try {
            double output = division.divide("4", "2");
            System.out.println(output);
        } catch (NumberFormatException | ArithmeticException ex) {
            System.out.println("Invalid data provided. Please provide valid numbers and try again..");
        }

    }
}
