package org;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /*
        For section 7.1:
        Person person = new Person();
        person.name = "Mother Teresa";
        person.nationality = "Macedonia";
        person.dateOfBirth = "24 Aug 1910";
        person.passport = new String[] {person.name, person.nationality, person.dateOfBirth};
        person.seatNumber = 9;
        */

        Person person = new Person("Mother Teresa", "Macedonia", "24 Aug 1910", 9);

        /*
        For section 7.1:
        System.out.println(person.name);
        System.out.println(person.nationality);
        System.out.println(person.dateOfBirth);
        System.out.println(Arrays.toString(person.passport));
        System.out.println(person.seatNumber);
         */

        System.out.println("Name: " + person.getName() + "\n" + "Nationality: " + person.getNationality() + "\n" + "Date of Birth: " + person.getDateOfBirth() + "\n" + "Seat Number: " + person.getSeatNumber() + "\n");

    }
}