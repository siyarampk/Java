package com.srstech.exception;

import java.io.*;

public class CheckedException {
    public static void main(String[] args) {

        try (InputStreamReader isr = new InputStreamReader(System.in);
             BufferedReader bf = new BufferedReader(isr)) {
            System.out.println("Please enter a value..");
            String input = bf.readLine();
            System.out.println("The user entered a value : " + input);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void readFile() {
        try {
            FileReader fileReader = new FileReader("/Users/siyaram/Desktop/story.txt");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
