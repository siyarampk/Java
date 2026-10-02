package com.srstech.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingDemo {
    public static void main(String[] args) {
        // Adding elements to the ArrayList
        List<Integer> numbers = new ArrayList<>();
        numbers.add(43);
        numbers.add(43);
        numbers.add(93);
        numbers.add(62);
        numbers.add(-02);
        numbers.add(3);
        numbers.add(45);
        numbers.add(0);
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);
        Collections.sort(numbers, Comparator.reverseOrder());
        System.out.println(numbers);

        var countries = new ArrayList<String>();
        countries.add("India");
        countries.add("USA");
        countries.add("Japan");
        countries.add("France");
        countries.add("Canada");
        System.out.println(countries);
        Collections.sort(countries, Comparator.naturalOrder());
        System.out.println(countries);
        Collections.sort(countries, Comparator.reverseOrder());
        System.out.println(countries);

        var countries1 = new ArrayList<String>();
        countries1.add("India");
        countries1.add("USA");
        countries1.add("Japan");
        countries1.add("France");
        countries1.add("Canada");
        //countries1.sort(new LastCharComparator());
        countries1.sort(new LastCharComparator());
        System.out.println(countries1);
    }
}
