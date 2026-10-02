package com.srstech.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        List<Double> doubleNums = new LinkedList<>();
        var countryName = new LinkedList<String>();
        countryName.add("India");
        countryName.add("Canada");
        countryName.add("USA");
        countryName.add("Germany");
        countryName.add("India");
        System.out.println(countryName);
        countryName.add(4, "Spain");
        countryName.remove("India");
        System.out.println(countryName);
        String firstElement = countryName.getFirst();
        String lastElement = countryName.getLast();
        System.out.println(countryName);
        LinkedList<String> reversedContryName = countryName.reversed();
        System.out.println(reversedContryName);
    }
}
