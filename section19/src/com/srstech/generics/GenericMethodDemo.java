package com.srstech.generics;

public class GenericMethodDemo {
    public static void main(String[] args) {
        String[] stringArray = {"Hello", "World"};
        printArray(stringArray);
        Integer[] intArray = {1, 2, 3, 4};
        printArray(intArray);
    }

    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }
}
