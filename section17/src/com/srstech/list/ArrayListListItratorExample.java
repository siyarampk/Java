package com.srstech.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListListItratorExample {
    public static void main(String[] args) {
        List<String> countryNames = new ArrayList<String>();
        countryNames.add("India");
        countryNames.add("Canada");
        countryNames.add("USA");
        countryNames.add("Germany");
        countryNames.add("India");

        ListIterator<String> listIterator = countryNames.listIterator();

        while (listIterator.hasNext()) {
            String country = listIterator.next();
            System.out.println(country);
        }
        while (listIterator.hasPrevious()) {
            String country = listIterator.previous();
            System.out.println(country);
        }
    }

}
