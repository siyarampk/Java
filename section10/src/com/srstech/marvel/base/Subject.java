package com.srstech.marvel.base;

public abstract class Subject {

    public static final int MIN_MARKS = 0;
    public int marks;

    public Subject() {
    }

    //concrete methods
    public int totalMarks() {
        return 100;
    }

    public abstract void tech();
}
