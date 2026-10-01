package com.srstech.object.demo;

public final class ImmuteablePerson {
    private final String name;
    private final String occupation;

    public ImmuteablePerson(String name, String occupation) {
        this.name = name;
        this.occupation = occupation;
    }

    public String getName() {
        return name;
    }


    public String getOccupation() {
        return occupation;
    }
}
