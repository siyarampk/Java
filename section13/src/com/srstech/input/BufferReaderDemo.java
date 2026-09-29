package com.srstech.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter a value");
        String input = bf.readLine();
        System.out.println("The user entered a value : " + input);
        bf.close();
    }
}
