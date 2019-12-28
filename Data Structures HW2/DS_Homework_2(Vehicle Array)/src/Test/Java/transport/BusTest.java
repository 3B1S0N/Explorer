package transport;
/*
 * File: BusTest.java
 * Project: transport
 * Author: Tobias Woode>
 * Email: toby2.0@outlook.com
 * Version: 1.0
 * Brief: A class created to test the features of the Bus class
 * -----
 * Last Modified: Saturday 28th December 2019, 10:44 am
 * Modified By: Tobias Woode>
 * -----
 * Copyright ©2019 Tobias Woode>
 */


public class BusTest {
    public static void main(String[] args) {
        Person driver2 = new Person(Person.Gender.FEMALE, "Driver Name", 12);

        Person passenger1 = new Person(Person.Gender.FEMALE, "passenger 1", 10);
        Person passenger2 = new Person(Person.Gender.FEMALE, "passenger 2", 14);
        Person passenger3 = new Person(Person.Gender.FEMALE, "passenger 3", 23);
        Person passenger4 = new Person(Person.Gender.FEMALE, "passenger 4", 67);

        Bus trotro = new Bus("GZ 100X","Mercedes","Sprinter", "2003", 4, 10);

        trotro.addPassenger(passenger1);
        trotro.addPassenger(passenger2);
        trotro.addPassenger(passenger3);
        trotro.addPassenger(passenger4);



        System.out.println(trotro.toString());
        System.out.println(trotro.listRiders());
    }

}
