package com.srstech.app;

import com.srstech.model.Employee;
import com.srstech.model.Person;
import com.srstech.model.Vehicle;
import com.srstech.service.VehicleService;

import static com.srstech.utility.MyConstants.TAX_RATE;
import static com.srstech.utility.MyConstants.SHIPPING_COST;
import static com.srstech.utility.MyConstants.calculateTotalCost;


public class MainClass {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        Employee employee = new Employee();
        VehicleService vehicleService = new VehicleService();

        String input = new String("Hello");
        Integer num;

        System.out.println(TAX_RATE);
        System.out.println(SHIPPING_COST);

        System.out.println(calculateTotalCost(9.99));
        System.out.println(Math.PI);

        MyOuterClass.MyInnerClass myInnerClass = new MyOuterClass.MyInnerClass();
        myInnerClass.display();

        AccessModifiersDemo accessModifiersDemo = new AccessModifiersDemo();
        accessModifiersDemo.protectedMethod();

        Person person = new Person();
        person.setFirstName("Siyaram");
        person.setLastName("Meena");
        person.setAge(30);
        person.setSalary(10000.00);

        System.out.println(person.getFirstName());

    }
}
