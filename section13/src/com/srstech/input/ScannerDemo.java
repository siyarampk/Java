package com.srstech.input;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name :");
        String name = sc.nextLine();
        System.out.println("Enter you age:");
        int age = sc.nextInt();
        System.out.println("Hello " + name + " , Your are " + age + " years old.");
        sc.close();
    }
}
