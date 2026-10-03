package com.srstech.map;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        var countryMap = new HashMap<String, String>();
        countryMap.put("India", "New Delhi");
        countryMap.put("USA", "Washington, DC");
        countryMap.put("France", "Paris");
        countryMap.put(null, null);

        System.out.println(countryMap.get("India"));
        countryMap.remove(null);
        System.out.println(countryMap.size());
    }
}
