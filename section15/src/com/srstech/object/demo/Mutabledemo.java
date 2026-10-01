package com.srstech.object.demo;

public class Mutabledemo {
    public static void main(String[] args) {
        MuteablePerson muteablePerson = new MuteablePerson("Siyaram","Software Engineer");
        System.out.println(muteablePerson.getOccupation());
        muteablePerson.setOccupation("Doctor");
        System.out.println(muteablePerson.getOccupation());
    }
}
