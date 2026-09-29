package com.srstech.main;

import java.util.Arrays;

public class ToStringDemo {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.asList(numbers));
    }
}
