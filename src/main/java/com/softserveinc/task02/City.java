package com.softserveinc.task02;

public class City {
    private String name;
    private String region;
    private String country;
    private int inhabitants;

    public City(String name, String region, String country, int inhabitants) {
        this.name = name;
        this.region = region;
        this.country = country;
        this.inhabitants = inhabitants;
    }

    public City() {
        this.name = "City_1";
    }

    public String getName() {
        return this.name;
    }

    public String getRegion() {
        return this.region;
    }

    public String getCountry() {
        return this.country;
    }

    public int getInhabitants() {
        return this.inhabitants;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setInhabitants(int inhabitants) {
        this.inhabitants = inhabitants;
    }

    @Override
    public String toString() {
        return "City:"
                + " name = " + name
                + ", region = " + region
                + ", country = " + country
                + ", inhabitants = " + inhabitants;
    }
}
