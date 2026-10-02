package com.srstech.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayVsArrayList {
    public static void main(String[] args) {

        List<String> countryNames = new ArrayList<>();

        countryNames.add("India");
        countryNames.add("Canada");
        countryNames.add("USA");
        countryNames.add("Germany");
        countryNames.add("India");

        String[] countries = countryNames.toArray(new String[countryNames.size()]);
        System.out.println(Arrays.toString(countries));

        List<String> countires1 = Arrays.asList(countries);
        System.out.println(countires1);
    }
}
