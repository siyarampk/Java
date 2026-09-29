package com.srstech.main;

public class ArrayForEachLoopDemo {
    public static void main(String[] args) {
        int [] number ={1,2,3,4,5};

        for(int num : number)
        {
            System.out.println(num);
        }

        String[] names = {"Siyaram","John","Lucy"};
        for(String name: names)
        {
            System.out.println(name);
        }

        for(int i=0; i<names.length; i++)
        {
            names[i] = names[i].toUpperCase();
        }
    }
}
