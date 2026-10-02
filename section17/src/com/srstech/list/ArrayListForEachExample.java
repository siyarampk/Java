package com.srstech.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListForEachExample {
    public static void main(String[] args) {
        List<String> countryNames = new ArrayList<String>();
        countryNames.add("India");
        countryNames.add("Canada");
        countryNames.add("USA");
        countryNames.add("Germany");
        countryNames.add("India");

        for (String country : countryNames) {
            System.out.println(country.toUpperCase());
        }
    }
}
