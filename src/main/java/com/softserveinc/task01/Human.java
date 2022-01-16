package com.softserveinc.task01;

public class Human {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String phone;

    Human(String firstName, String lastName, String dateOfBirth, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
    }

    Human() {
        firstName = "Adam";
        lastName = "Eva";
        dateOfBirth = "";
        phone = "no";
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Human:"
                + " Name = " + firstName + '\''
                + ", Last Name = " + lastName
                + ", DOB = " + dateOfBirth
                + ", phone = " + dateOfBirth;
    }
}
