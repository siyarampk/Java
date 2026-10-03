package com.srstech.map;

import java.util.*;

public class HashMapIterationDemo {
    public static void main(String[] args) {
        var countryMap = new HashMap<String, String>();
        countryMap.put("India", "New Delhi");
        countryMap.put("USA", "Washington, DC");
        countryMap.put("France", "Paris");
        approach3(countryMap);
    }

    private static void approach1(HashMap<String, String> countryMap) {
        Set<String> keys = countryMap.keySet();
        Iterator<String> iterator = keys.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            String capital = countryMap.get(key);
            System.out.println(key + " : " + capital);
        }

        /*for (String key : keys) {
            String capital = countryMap.get(key);
            System.out.println(key + " : " + capital);
        }*/
    }

    private static void approach2(HashMap<String, String> countryMap) {
        Set<Map.Entry<String, String>> entries = countryMap.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    private static void approach3(HashMap<String, String> countryMap) {
        Collection<String> values = countryMap.values();
        for (String value : values) {
            System.out.println(value);
        }
    }
}
