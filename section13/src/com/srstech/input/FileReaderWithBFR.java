package com.srstech.input;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderWithBFR {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("/Users/siyaram/Desktop/story.txt");
        BufferedReader bf = new BufferedReader(fileReader);
        String line;
        while ((line = bf.readLine()) != null) {
            System.out.println(line);
        }
        bf.close();
    }
}
