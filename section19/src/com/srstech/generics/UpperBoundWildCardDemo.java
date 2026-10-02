package com.srstech.generics;

import com.srstech.generics.model.Developer;
import com.srstech.generics.model.Employee;
import com.srstech.generics.model.Manager;

import java.util.List;

public class UpperBoundWildCardDemo {
    public static void main(String[] args) {
        List<Employee> employees = List.of(new Employee(), new Employee());
        printEmployee(employees);
        List<Developer> developers = List.of(new Developer(), new Developer());
        printEmployee(developers);
        List<Manager> managers = List.of(new Manager(), new Manager());
        printEmployee(managers);
    }

    public static void printEmployee(List<? extends Employee> employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
