package com.srstech.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = null;
        try {
            sc = new Scanner(System.in);
            System.out.println("Enter a number...");
            int num = sc.nextInt();
            System.out.println(num);
        } catch (Exception ex) {
            System.out.println("Please provide input in numerical format only and try again...");
        } finally {
            System.out.println("finally block is being executed");
            if (sc != null) {
                sc.close();
            }
        }
    }
}
