package org;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Florence Nightingale", "English", "12 May 1820", 9);
        System.out.println("Name: " + person.getName() + "\n" + "Nationality: " + person.getNationality() + "\n" + "Date of Birth: " + person.getDateOfBirth() + "\n" + "Seat Number: " + person.getSeatNumber() + "\n");

        if (person.applyPassport()) {
            System.out.println("Congratulations " + person.getName() + ". Your passport was approved.\n");
        } else {
            System.out.println("We are sorry " + person.getName() + ". We cannot process your application.\n");
        }

        Person twin = new Person(person); // creates a copy of the first object
        twin.setName("Afsha Nightingale"); // updates name field of the second object
        twin.setSeatNumber(10); // updates the seat number of the second object

        System.out.println("Name: " + twin.getName() + "\n" + "Nationality: " + twin.getNationality() + "\n" + "Date of Birth: " + twin.getDateOfBirth() + "\n" + "Seat Number: " + twin.getSeatNumber() + "\n");

        if (twin.applyPassport()) {
            System.out.println("Congratulations " + person.getName() + ". Your passport was approved.\n");
        } else {
            System.out.println("We are sorry " + person.getName() + ". We cannot process your application.\n");
        }

    }
}