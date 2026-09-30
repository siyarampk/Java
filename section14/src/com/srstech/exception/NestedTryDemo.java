package com.srstech.exception;

public class NestedTryDemo {
    public static void main(String[] args) {

        try {
            nestedTryBlock();
        } catch (Exception ex) {
            System.out.println("Exception caught in the main method: " + ex.getMessage());
        }
    }

    private static void nestedTryBlock() {
        try {
            System.out.println("Outer try block : Start");
            try {
                System.out.println("Inner try block : Start");
                // Simulating an arithmetic exception
                int result = 10 / 0;
                System.out.println("Inner try block: End");
            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException caught in inner try block :" + e.getMessage());
            } finally {
                System.out.println("Inner try block: Finally block");
            }
            System.out.println("Outer try block : End");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught in outer try block :" + e.getMessage());
        } finally {
            System.out.println("Outer try block");
        }
    }
}
