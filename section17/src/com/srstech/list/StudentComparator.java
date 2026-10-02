package com.srstech.list;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    String name;
    int rollNumber;
    int marks;

    public StudentComparator(){

    }
    public StudentComparator(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "StudentComparator{" +
                "name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                ", marks=" + marks +
                '}';
    }


    @Override
    public int compare(Student o1, Student o2) {
        int markComparision = Integer.compare(o1.marks, o2.marks);
        if (markComparision == 0) {
            return Integer.compare(o1.rollNumber, o2.rollNumber);
        }
        return markComparision;
    }
}
