package com.srstech.demo;

public class BoxingDemo {

    public static void main(String[] args) {
        int num = 16;

        //Approach 1 - with the help of Constructor
        Integer integer = new Integer(num);
        Double doubleObj = new Double(3.14);
        Long longObj = new Long("9593");

        //Approach 2 - with the help if valueof()
        Integer integer1 = Integer.valueOf(num);
        Double doubleObj2 = Double.valueOf(3.14);
        Long longObj1 = Long.valueOf("95657");

        var num1 = Integer.parseInt("18");
        System.out.println(num1);
    }
}
