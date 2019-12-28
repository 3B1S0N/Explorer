package transport;
/*
 * File: PersonTest.java
 * Project: transport
 * Author: Tobias Woode>
 * Email: toby2.0@outlook.com
 * Version: 1.0
 * Brief: A class created to test the Person class
 * -----
 * Last Modified: Saturday 28th December 2019, 10:50 am
 * Modified By: Tobias Woode>
 * -----
 * Copyright ©2019 Tobias Woode>
 */


import transport.Person;

public class PersonTest{

    public static void main(String[] args){
        System.out.println(" This Program has been designed to test the Person class\n Enjoy!");

        Person person = new Person(Person.Gender.FEMALE, "Ashley Anderson", 18);

        System.out.println(" This person's name is " + person.getName());
        System.out.println( " She prefers to be called a " + person.getGender());
        System.out.println(" She is " + person.getAge() + " years old.");
        // System.out.println(" Next year, she will be " + person.getincrementAge() + " years old.");

    }
}
