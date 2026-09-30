package com.srstech.exception;

import java.util.Scanner;

public class TryWithResourceDemo {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number...");
            int num = sc.nextInt();
            System.out.println(num);
        } catch (Exception ex) {
            System.out.println("Please provide input in numerical format only and try again...");
        }
    }
}
