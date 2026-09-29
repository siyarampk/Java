package com.srstech.main;

import java.util.Arrays;

public class FillDemo {
    public static void main(String[] args) {
        int[] score = new int[10];
        Arrays.fill(score, 100);
        System.out.println(Arrays.toString(score));

        int[] indices = new int[5];
        Arrays.setAll(indices, i -> i * 2);
        System.out.println(Arrays.toString(indices));
    }
}
