package com.srstech.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableListDemo {
    public static void main(String[] args) {
        List<Integer> accountNumber = new ArrayList<>();
        accountNumber.add(23242444);
        accountNumber.add(32343353);
        accountNumber.add(65645454);
        accountNumber.add(65675565);
        addTenDollars(accountNumber);

        accountNumber = Collections.unmodifiableList(accountNumber);
        List<Integer> immutableAccountNums = List.of(34354434, 64643435, 5456665, 6565735, 565343465);
        var arrayListObjects = new ArrayList<Integer>(immutableAccountNums);
        addTenDollars(arrayListObjects);
    }

    private static List<Integer> addTenDollars(List<Integer> accountNums) {
        accountNums.add(435657564);
        for (Integer account : accountNums) {
            System.out.println("Ten Dollars credited into the account : " + account);
        }
        return accountNums;
    }
}
