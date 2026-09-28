package com.srstech.marvel.hero;

public interface SuperHero extends Hero, Person {

    String UNIVERSE_NAME = "Marvel";
    int num = 6;

    static String commonCharacteristics() {
        return "Superhuman abilities, Willingness to sacrifice";
    }

    public String userPower();

    /*
      If Y received kill the villain
      If N received stop the villain
      @param c indicates Y or N
     * @return - Returns status
     */
    String stopVillain(char c);

    default String trackLiveLocation() {
        String liveLocation = "USA";
        System.out.println("I am in " + liveLocation);
        return liveLocation;
    }

    @Override
    default void walk() {
        Person.super.walk();
    }
}
