package com.softserveinc.task03;

import com.softserveinc.task02.City;

public class Country {
    private final int citiesLength = 10;

    private String name;
    private String continent;
    private String code;
    private City capital;
    private City[] cities = new City[citiesLength];

    Country(String name, String continent, String code, City capital) {
        this.name = name;
        this.continent = continent;
        this.code = code;
        this.setCapital(capital);
        this.addCity(capital);
    }

    Country() {
        this.name = "Test Country";
        this.continent = "First continent";
        this.code = "01";
        this.capital = new City("Capital", "Region", this.name, 0);
    }

    public String getName() {
        return this.name;
    }

    public String getContinent() {
        return this.continent;
    }

    public String getCode() {
        return this.code;
    }

    public City getCapital() {
        return this.capital;
    }

    public City[] getCities() {
        return this.cities;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }

    public void setCities(City[] cities) {
        this.cities = cities;
    }

    public int getCityCount() {
        int count = 0;
        for (City city : this.cities) {
            if (city == null) {
                continue;
            }
            count++;
        }
        return count;
    }

    public void addCity(City newCity) {
        System.out.println("Count before additing " + this.getCityCount());
        int index = this.getCityCount();
        cities[index] = newCity;
        System.out.println("Count after additing " + this.getCityCount());
    }


    public int getInhabitants() {
        int allInhabitants = 0;
        for (int i = 0; i < this.getCityCount(); i++) {
            allInhabitants = allInhabitants + cities[i].getInhabitants();
        }
        return allInhabitants;
    }

    @Override
    public String toString() {
        return "Country:"
                + " name = " + name
                + ", continent = " + continent
                + ", code = " + code
                + ", capital name = " + capital.getName()
                + ", capital region = " + capital.getRegion()
                + ", capital inhabitants" + capital.getInhabitants();
    }

}
