package com.srstech.enumeration;

import java.util.EnumSet;

public class EnumSetDemo {
    public static void main(String[] args) {
        EnumSet<Day> allDay = EnumSet.allOf(Day.class);
        for (Day day : allDay) {
            System.out.println(day);
        }
        EnumSet<Day> someDays = EnumSet.of(Day.MONDAY, Day.TUESDAY, Day.WENESDAY);
        for (Day day : someDays) {
            System.out.println(day);
        }

        EnumSet<Grades> passGrades = EnumSet.range(Grades.A, Grades.C);
        for (Grades grade : passGrades) {
            System.out.println(grade);
        }

        EnumSet<Grades> failGrades = EnumSet.complementOf(passGrades);
        for (Grades grade : failGrades) {
            System.out.println(grade);
        }
    }
}
