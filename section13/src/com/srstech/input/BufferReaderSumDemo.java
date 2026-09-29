package com.srstech.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderSumDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter a first numeric value..");
        String input1 = bf.readLine();
        System.out.println("Please enter a second numeric value..");
        String input2 = bf.readLine();

        int num1 = Integer.parseInt(input1);
        int num2 = Integer.parseInt(input2);
        int result = num1 + num2;
        System.out.println("The sum of two given number is : " + result);
        bf.close();
    }

}
