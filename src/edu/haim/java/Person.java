package edu.haim.java;

import java.util.Comparator;

/**
 * Created by hackeru on 02/03/2017.
 */
public class Person implements IsWarmBlooded,Comparable<Person>, Comparator<Person>{
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public double getBodyTemperature() {
        return 36.8;
    }

    @Override
     public int compareTo(Person other) {
        int firstDiff = this.firstName.compareTo(other.firstName);

        if (firstDiff != 0)
            return firstDiff;
        else return this.lastName.compareTo(other.lastName);
    }


    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }


    @Override
    public int compare(Person o1, Person o2) {
        return o1.compareTo(o2);
    }
}
