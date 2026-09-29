package com.srstech.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderEvenOddDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter a numeric value");
        String input = bf.readLine();
        int num = Integer.parseInt(input);
        if (num % 2 == 0) {
            System.out.println("You have entered an even number");
        } else {
            System.out.println("You have entered a odd number");
        }
        bf.close();
    }

}
