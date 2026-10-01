package com.srstech.object.demo;

public class StringDemo {
    public static void main(String[] args) {
        String str1 = new String("Siyaram");
        String str2 = new String("Siyaram");
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str1.equals(str2));
        System.out.println(str1);
    }
}
