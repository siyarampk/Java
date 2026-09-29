package com.srstech.main;

public class ArrayForLoopDemo {
    public static void main(String[] args) {

        int[] mobileNumbers = new int[116];
        mobileNumbers[45] = 766554433;
        mobileNumbers[93] = 436554433;
        mobileNumbers[101] = 763454433;
        mobileNumbers[32] = 766535433;
        mobileNumbers[56] = 346554433;

        for (int i = 0; i < mobileNumbers.length; i++) {
            System.out.println("The element index : " + i + " is : " + mobileNumbers[i]);
        }

        String[] names = new String[3];
        names[2]="Siyaram";
        for (int i = 0; i < names.length; i++) {
            System.out.println("The element at index : " + i + " is : " + names[i]);
        }
    }
}
