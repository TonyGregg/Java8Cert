package org.genil.learning.java8.collections;

/**
 * Created by anton on 6/8/2018 7:47 PM
 **/
public class Employee {


    private final String firstName;
    private final String lastName;
    private final Integer id;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getId() {
        return id;
    }

    public Employee(String firstName, String lastName, Integer id) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return firstName + ", " + lastName + " :: " +id;
    }

}
