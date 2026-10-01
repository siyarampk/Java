package com.srstech.object.demo;

public class CloneExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        Course course = new Course();
        course.setCourseName("Math");

        Student orignalStudent = new Student("Alice",course);
        Student clonedStudent = (Student) orignalStudent.clone();
        System.out.println(orignalStudent==clonedStudent); //false
        System.out.println(orignalStudent.getCourse() ==clonedStudent.getCourse()); //true
    }
}
